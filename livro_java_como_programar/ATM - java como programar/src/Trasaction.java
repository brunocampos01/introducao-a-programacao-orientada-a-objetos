
public abstract class Trasaction {
	private int accountNumber;
	private Screen screen;
	private BankDataBase bankDataBase;
	
	
	//cosntrutor padrao
	public Trasaction (int userAccountNumber, Screen atmScreen, BankDataBase atmBankDataBase)
	{
		accountNumber = userAccountNumber;
		screen = atmScreen;
		bankDataBase = atmBankDataBase;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public Screen getScreen()
	{
		return screen;
	}
	
	public BankDataBase getBankDataBase()
	{
		return bankDataBase;
	}
	
	//executa as operacoes
	abstract public void execute();

}
