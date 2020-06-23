
public class Screen {
	
	//nao move o cursor
	public void displayMessage( String message)
	{
		System.out.print(message);
	}
	
	//move o cursor
	public void displayMessageLine(String message)
	{
		System.out.println(message);
	}
	
	//exibe valor em dolar
	public void displayDollarAmount(double amount)
	{
		System.out.printf("$%, .2f", amount);
	}
}
