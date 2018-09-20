
public class CashDispenser {
	private final static int INITIAL_COUNT = 500;
	private int count;	//numero de celulas q restam no caixa
	
	public CashDispenser()
	{
		count = INITIAL_COUNT;
	}

	//metodo q entrega as cedulas
	public void dispenseCash(int amount)
	{
		int billsRequired = amount/20;	//numero de cedulas requeridas
		count -= billsRequired;		//update cedulas no caixa
	}
	
	//indica se pode entregar tudo o q foi reuerido de cedulas
	public boolean isSufficientCashAvailable( int amount)
	{
		int billsRequired = amount/20;
		
		if( count >= billsRequired)
			return true;
		else
			return false;
	}
}
