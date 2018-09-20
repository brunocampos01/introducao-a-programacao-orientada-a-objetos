//7.19
package Exercicios;
import java.util.Scanner;

public class SistemaReservaDePassagensAereas {
	public static void main(String[] args) {
		// atributos
		
		Scanner entrada = new Scanner(System.in);
		boolean [] assentos = new boolean[10];
		assentos[1] = true;
		
		int classe;
		int assento = 0;
		
		//garante tudo livre
		for (int i = 0; i < assentos.length; i++)
		{
			assentos[i] = false;
		}
		
		//fica perguntando ate todos os assentos estarem ocupados
		for(int percorre=0; percorre<assentos.length; percorre++)
		{
		System.out.println("1-FirstClass e 2-Economy");
		classe = entrada.nextInt();
		
		//escolha da classe 1, 2 ou errada
		if(classe == 1){
			System.out.println("Os assentos vagos na FirstClass são: ");
			for(int i=1; i<=5; i++){ //percorre o array para exibir assentos LIVRES
				if(assentos[i] == false)
					System.out.println(i);
				else
					System.out.println("Poltrona " + i + " reserved.");

			}
			System.out.println("Escolha a poltrona: ");
			assento = entrada.nextInt();
			assentos[assento] = true;

		}else if(classe == 2){
				System.out.println("Os assentos vagos na Economy são: ");
				for(int x=6; x<assentos.length; x++){//percorre o array para exibir assentos LIVRES
					if(assentos[x] == false)
						System.out.println(x);
				}
				System.out.println("Escolha a poltrona: ");
				assento = entrada.nextInt();
				assentos[assento] = true;
		}else
		{
			System.out.println( "Error. Invalid class." );
			for (int i = 0; i <= 4; i++)
				if ( assentos[i] )
					System.out.println("First Class " + i + " reserved.");
				else 
					System.out.println("First Class " + i + " NOT reserved.");
					
			for (int i = 5; i <= 9; i++)//economy
						if ( assentos[i] )
							System.out.println("Economy " + i + " reserved.");
						else 
							System.out.println("Economy " + i + " NOT reserved.");
			
		System.out.println("Escolha a poltrona: ");
		assento = entrada.nextInt();
		}
		
			System.out.println("Poltrona " + assento + " reservada para vc.");
		}
		System.out.println( "No more seats at all !!!" );
	}
}
