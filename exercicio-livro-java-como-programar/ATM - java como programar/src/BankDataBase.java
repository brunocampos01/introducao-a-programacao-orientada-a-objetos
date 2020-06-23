
public class BankDataBase {
	
	private Account[] accounts;
	
	//construtor padrao
	public BankDataBase()
	{
		accounts = new Account[2];
		accounts[0] = new Account(12345, 54321, 1000, 1200);
		accounts[1] = new Account(98765, 56789, 200, 200);
	}
	
	//recupera o objeto Account q contem o numero da conta do usuario atual
	private Account getAccount(int accountNumber)
	{
		//percorre todas as contas ate achar
		for(Account currentAcount: accounts)
		{
			if(currentAcount.getAccountNumber() == accountNumber)
			{
				return currentAcount;
			}
		}
		
		return null;	//se nunhuma correpondecia for encontrada
	}
	
	//valida o PIN, conferindo no banco de dados
	public boolean authenticateUser(int userAccountNumber, int userPIN)
	{
		//pega a conta
		Account userAccount = getAccount(userAccountNumber);
		
		if(userAccount != null)
			return userAccount.validatePin(userPIN);
		else
			return false;
	}
	
	public double getAvailableBalance(int userAccountNumber)
	{
		return getAccount(userAccountNumber).getAvailableBalance();
	}
	
	public double getTotalBalance (int userAccountNumber)
	{
		return getAccount(userAccountNumber).getAvailableBalance();
	}
	
	public void credit(int userAccountNumber, double amount)
	{
		getAccount(userAccountNumber).credit(amount);
	}

	public void debit(int userAccountNumber, double amount)
	{
		getAccount(userAccountNumber).debit(amount);
	}
}
