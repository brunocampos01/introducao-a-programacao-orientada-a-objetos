package GameCraps;
import java.util.Random;

// ex pg 197 e exer 7.17
public class RollDie {

	public static void main(String[] args) {
		// eh uma forma de subtituir o switch
		
		Random randomNumbers = new Random();
		int [] frequencia = new int [7];
		
		System.out.printf("%s%10s \n", "face", "frequ�ncia");

		//lan�a dados 6000 vezes
		for(int roll=1; roll <=6000; roll++){
			int face = 1 + randomNumbers.nextInt(6);
			++frequencia[face];
			
		}
		for(int faceTabela=1; faceTabela<frequencia.length; faceTabela++){
			System.out.printf("%4d%10d \n", faceTabela, frequencia[faceTabela]);
		}
	}

}
