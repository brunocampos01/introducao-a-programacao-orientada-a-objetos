public class Withdrawal extends Trasaction{
	private int amount;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	
	private final static int CANCELED = 6;
	
	//construtor padrao
	public Withdrawal (int userAccountNumber, Screen atmScreen, BankDataBase atmBankDataBase, Keypad atmKeyPad, CashDispenser atmCashDispenser)
	{
		//inicializa as variaveis da supercliasse
		super( userAccountNumber, atmScreen, atmBankDataBase);
		
		//inicializa teclado e dispensador
		keypad = atmKeyPad;
		cashDispenser = atmCashDispenser;
	}
	
	@Override
	public void execute()
	{
		boolean cashDispensed = false; //cedulas nao entregues
		double availableBalance;	//quantia disponivel para saque
		
		BankDataBase bankDataBase = getBankDataBase();
		Screen screen = getScreen();
		
		//faz o loop ate entregar as cedulas ou o usuario cancela
		do
		{
			amount = displayMenuOfAmounts();	//quantidade que o usuario escolheu
			
			//verifica se usuario escolheu um quantia para saque
			if(amount != CANCELED)
			{
				availableBalance = bankDataBase.getAvailableBalance(getAccountNumber());	//saldo disponivel
				
				if(amount <= availableBalance)
				{
					//verifica se o ATM tem cedulas suficientes
					if(cashDispenser.isSufficientCashAvailable(amount))
					{
						//update na conta
						bankDataBase.debit(getAccountNumber(),amount);
						cashDispenser.dispenseCash(amount);	//entrega as cedulas
						cashDispensed = true;	//cedulas entregues !
						
						screen.displayMessageLine("\n Retire seu dinheiro do dispensador AGORA.");
						
					}else
						screen.displayMessageLine("\n sem saldo solicitado no ATM. Escolha um valor menor.");
				}
				else
					screen.displayMessageLine("\n Voce nao tem fundos para isso. TA POBRE...");
			}
			else
				screen.displayMessageLine("\n Cancelando transacao...");
			return;
		} while (!cashDispensed);	
	}	//fim metodo execute
	
	//exibe um menu de opcos de saque e a opcao cancelar
	private int displayMenuOfAmounts()
	{
		int userChoice = 0;
		Screen screen = getScreen();
		
		int[] amounts = {0, 20, 40, 60, 100, 200};	//array para as opcoes do menu
		
		while(userChoice == 0)
		{
			screen.displayMessageLine("\n1: $20");
			screen.displayMessageLine("2: $40");
			screen.displayMessageLine("3: $60");
			screen.displayMessageLine("4: $100");
			screen.displayMessageLine("5: $200");
			screen.displayMessageLine("6: cancel transation");
			screen.displayMessageLine("\n Choice a withdrawal amount:");
			
			int input = keypad.getInput();	//obtem a entreda do usuario
			
			switch (input)
			{
			case 1:	//usuario escolheu 
			case 2: //escolheu uma opcao de 1 a 5
			case 3: //quantia correspondete do array de quantias
			case 4:
			case 5:
				userChoice = amounts[input];	//salva a escolha do usuario
				break;
			case CANCELED:
				userChoice = CANCELED;
				break;
				default: //usuario nao inseriu valores corretos
					screen.displayMessageLine("\n Invalid selection. Try again.");
			}
			
		}
		
		return userChoice;		
	}

}
