
public class BalaceInquiry extends Trasaction{
	//cosntrutor padrao
	public BalaceInquiry (int userAccountNumber, Screen atmScreen, BankDataBase atmBankDataBase)
	{
		super(userAccountNumber, atmScreen, atmBankDataBase);
	}
	
	public void execute()
	{
		//obtem as referencias do banco de dados, tela e saldos
		BankDataBase bankDataBase = getBankDataBase();
		Screen screen = getScreen();
		double availableBalance = bankDataBase.getAvailableBalance(getAccountNumber());		
		double totalBalance = bankDataBase.getAvailableBalance(getAccountNumber());
		
		screen.displayMessageLine("\nInformacoes da conta");
		screen.displayMessage("\nSaldo disponivel:");
		screen.displayDollarAmount(availableBalance);
		screen.displayMessage("\nSaldo total:");
		screen.displayDollarAmount(totalBalance);
		screen.displayMessageLine("");
	}

}
