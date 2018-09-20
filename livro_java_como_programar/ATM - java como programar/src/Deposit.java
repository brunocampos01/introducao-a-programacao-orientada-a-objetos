
public class Deposit extends Trasaction{
	private double amount;
	private Keypad keypad;
	private DepositSlot depositSlot;
	private final static int CANCELED = 0;
	
	//construtor padrao
	public Deposit ( int userAccountNumber, Screen atmScreen, BankDataBase atmBankDataBase, Keypad atmKeypad, DepositSlot atmDepositSlot)
	{
		super(userAccountNumber, atmScreen, atmBankDataBase);	//inicializa as variaveis da superclasse
		
		keypad = atmKeypad;
		depositSlot = atmDepositSlot;
	}
	
	@Override
	public void execute()
	{
		BankDataBase bankDataBase = getBankDataBase();
		Screen screen = getScreen();
		
		amount = promptForDepositAmount();	//obtem a quantidade depositada
		
		if(amount != CANCELED)
		{
			screen.displayMessage("\n Insira o envelope com a grana");
			screen.displayDollarAmount(amount);
			screen.displayMessageLine(".");
			
			//recebe o envelope
			boolean envelopeRecebido = depositSlot.isEnvelopeReceived();
			
			//verifica se o envelope foi recebido
			if(envelopeRecebido)
			{
				screen.displayMessageLine("\n Seu envelope foi recebido. \nNOTA: O dinheiro nao sera depositado pois nao confiamos em vc."
						+ "Primeiro teremos que verificar o envelope. ");
				
				//credita na consta
				bankDataBase.credit(getAccountNumber(), amount);
			}
			else	//envepole nao recebido
			{
				screen.displayMessageLine("\n Vc nao inseriu o envelope, entao a transacao sera cancelada. :( ");
			}
		}
		else	//usuario cancelou
		{
			screen.displayMessageLine("\n Cancelando transacao...");
		}
	}
	
	//solicita q o usuario insira a quantia de deposito em centavos
	private double promptForDepositAmount()
	{
		Screen screen = getScreen();
		
		screen.displayMessage("\n Entre com o valor do deposito em CENTAVOS [opcao 0 cancela]: ");
		int input = keypad.getInput();	//obtem a entrada do usuario
		
		if (input == CANCELED)
			return CANCELED;
		else
		{
			return (double) input/100;
		}
	}
	
	

}
