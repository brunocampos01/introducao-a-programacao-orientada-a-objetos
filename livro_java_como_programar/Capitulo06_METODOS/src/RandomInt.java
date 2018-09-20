// exmplo da pg 165 sobre dados e classe Random
import java.util.Random;

public class RandomInt {
	public static void main(String[] args) {
		
		Random randomInteger = new Random();
		int face; 								//dado
		
		//joga o dado x vezes
		for (int contador=1; contador<=20; contador++){
			//face = inteiro aleatório entre 1 e 6
			face = 1 + randomInteger.nextInt(6);
			
			System.out.printf("%d ", face);		//exibe valor gerado
			
			//separa de 5 em 5 resultados por linha
			if (contador%5 == 0){
				System.out.println();
			}
		}
	}
}
