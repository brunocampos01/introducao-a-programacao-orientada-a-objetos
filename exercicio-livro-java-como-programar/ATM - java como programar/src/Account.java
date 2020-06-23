
public class Account {
	
	private int accountNumber;
	private int pin;
	private double availableBalace;
	private double totalBalance;
	
	//construtor padrao
	public Account( int theAccount, int thePin, double theAvailableBalace, double theTotalBalance)
	{
		accountNumber = theAccount;
		pin = thePin;
		availableBalace = theAvailableBalace;
		totalBalance = theTotalBalance;
	}
	
	//verifica se o PIN esta correto
	public boolean validatePin( int userPIN)
	{
		if(userPIN == pin)
			return true;
		else
			return false;
	}
	
	public double getAvailableBalance()
	{
		return availableBalace;
	}
	
	public double getTotalBalance()
	{
		return totalBalance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void credit (double amount)
	{
		totalBalance += amount;
	}
	
	public void debit (double amount)
	{
		availableBalace -= amount;
		totalBalance -= amount;
	}
	
}
