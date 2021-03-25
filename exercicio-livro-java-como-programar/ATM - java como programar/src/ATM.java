public class ATM {
	
	private boolean userAutenticated;
	private int currentAccountNumber;
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private DepositSlot depositSlot;
	private BankDataBase bankDataBase;
	
	//constantes para as opcoes do menu
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	//construtor padaro para inicializar as variaveis e criar os objetos
	public ATM() {
		userAutenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depositSlot = new DepositSlot();
		bankDataBase = new BankDataBase();
	}
	
	//inicia o ATM
	public void run() {
		while(true)
		{
			//faz loop enquanto usuario nao autenticado
			while(!userAutenticated)
			{
				screen.displayMessageLine("\n-----------------------------------------------------");
				screen.displayMessageLine("Bem Vindo!");
				authenticateUser();		//autentica o usuario
			}
			
			performTransactions();		//o usuario esta autenticado
			userAutenticated = false;	//reinicia a variavel
			currentAccountNumber = 0;	//reinicia a variavel
			screen.displayMessageLine("\n\n Obrigado.");
		}
	}
	
	//pega dados de login do usuario e verifica no banco de dados
	private void authenticateUser() {
		screen.displayMessageLine("Entre com o numero da conta: ");
		int accountNumber = keypad.getInput();	//atribui o q foi digitado na variavel accountNumber
		screen.displayMessageLine("Numero de PIN: ");
		int pin = keypad.getInput();
		
		//configura o userAuthenticated com um valor Booleano, passado pelo bankDataBase
		userAutenticated = bankDataBase.authenticateUser( accountNumber, pin);
		
		//verifica se autenticacao esta OK
		if( userAutenticated)
		{
			currentAccountNumber = accountNumber;	//salva a conta do usuario na variavel temporaria
		}
		else
		{
			screen.displayMessageLine("Numero da conta ou PIN invalidos. Por favor, tente novamente.");
		}
	}
	
	//exibir menu principal
	private void performTransactions() {
		Trasaction currentTrasaction = null; 	//armaze a transacao atual em processo
		boolean userExited = false;
		
		//faz o loop enquanto o usuario nao sair
		while(!userExited)
		{
			int mainMenuSelection = displayMainMenu();
			
			//decide como prosseguir
			switch(mainMenuSelection)
			{
			case BALANCE_INQUIRY:
			case WITHDRAWAL:
			case DEPOSIT:
			
			currentTrasaction = createTrasaction (mainMenuSelection);
			
			currentTrasaction.execute();	//excutar a trasacao escolhida
			break;
			case EXIT:
				screen.displayMessageLine("\nSaindo do sistema...");
				userExited  = true;
				break;
			default:	//caso o usuario nao insira uma opcao valida
				screen.displayMessageLine("\nVoce nao inseriu uma opcao valida. Tente novamente.");
				break;
			}
		}
	}
	
	private int displayMainMenu() {
		screen.displayMessageLine("\n Menu pricipal");
		screen.displayMessageLine("\n1 - Ver saldo");
		screen.displayMessageLine("2 - Saque");
		screen.displayMessageLine("3 - Deposito");
		screen.displayMessageLine("4 - Sair");
		screen.displayMessageLine("\n Entre com uma escolha");
		return keypad.getInput();
	}
	
	//retorna o objeto da subclasse de Trasaction escolhida
	private Trasaction createTrasaction( int type) {
		Trasaction temp = null;	//variavel temporaria
		
		//determina que Trasaction deve criar
		switch(type) {
		case BALANCE_INQUIRY:
			temp = new BalaceInquiry(currentAccountNumber, screen, bankDataBase);
			break;
		case WITHDRAWAL:
			temp = new Withdrawal(currentAccountNumber, screen, bankDataBase, keypad, cashDispenser);
			break;
		case DEPOSIT:
			temp = new Deposit(currentAccountNumber, screen, bankDataBase, keypad, depositSlot);
			break;
		}	
		return temp;
	}
}
