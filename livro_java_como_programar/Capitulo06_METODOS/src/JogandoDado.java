//roll die
// verificar a frequencia

import java.util.Random;
public class JogandoDado {
	public static void main(String[] args) {
		
		//atributos
		Random randomInteger = new Random();
		
		int frequencia01 = 0;
		int frequencia02 = 0;
		int frequencia03 = 0;
		int frequencia04 = 0;
		int frequencia05 = 0;
		int frequencia06 = 0;
		
		int face;
		
		//joga 6000 o dado
		for(int jogada=1;jogada<=6000; jogada++){
			face = 1 + randomInteger.nextInt(6); // armazena o valor do dado em cada jogada
			
			//armazena no contador de frequencia
			switch(face){
				case 1:
					++frequencia01;
					break;
				case 2:
					++frequencia02;
					break;
				case 3:
					++frequencia03;
					break;
				case 4:
					++frequencia04;
					break;
				case 5:
					++frequencia05;
					break;
				case 6:
					++frequencia06;
					break;
			} //poderia fazer com if..if else...if else...else
		}
		System.out.println("face\t Frequencia");
		System.out.printf("1\t%d \n", frequencia01);
		System.out.printf("2\t%d \n", frequencia02);
		System.out.printf("3\t%d \n", frequencia03);
		System.out.printf("4\t%d \n", frequencia04);
		System.out.printf("5\t%d \n", frequencia05);
		System.out.printf("6\t%d \n", frequencia06);
	}
}
