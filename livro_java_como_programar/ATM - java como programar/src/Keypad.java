import java.util.Scanner;

public class Keypad {
	private Scanner input;
	
	//cosntrutor
	public Keypad()
	{
		input = new Scanner (System.in);
	}
	
	//retorna valor inserido pelo usuario
	public int getInput()
	{
		return input.nextInt();
	}

}
