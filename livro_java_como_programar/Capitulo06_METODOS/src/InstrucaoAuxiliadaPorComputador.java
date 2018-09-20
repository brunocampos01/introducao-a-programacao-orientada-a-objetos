//6.35, 6.36 6.37, 6.38 e 6.39
import java.util.Scanner;

public class InstrucaoAuxiliadaPorComputador {
	public static void main (String [] args){
		
		int a;
		int b;
		int resposta;
		int nivelDificuldade;
		int mensagem = (int) (Math.random()*3 + 2);
		//System.out.println(mensagem);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escolha o nivel de dificuldade (1,2 ou 3 digitos): ");
		nivelDificuldade = entrada.nextInt();
		
		if (nivelDificuldade == 1){
			a =  (int) (Math.random()*10);
			b =  (int) (Math.random()*10);
		}else if(nivelDificuldade == 2){
			a =  (int) (Math.random()*100);
			b =  (int) (Math.random()*100);
		}else{
			a =  (int) (Math.random()*1000);
			b =  (int) (Math.random()*1000);
		}
		
		System.out.println("Qual operação matemática quer tentar?");
		System.out.println("1 - adição");
		System.out.println("2 - subtração");
		System.out.println("3 - divisão");
		System.out.println("4 - multiplicação");
		resposta = entrada.nextInt();
		
		System.out.print("Quanto eh " +a+" e " +b+"?:");
		resposta = entrada.nextInt();
		
		if(resposta == a*b || resposta == a/b || resposta == a+b || resposta == a-b){
			switch (mensagem){
			case 1:
				System.out.println("Very good!!!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
			}
			
		}else{
			switch (mensagem){
			case 1:
				System.out.println("No, please try again.");
				break;
			case 2:
				System.out.println("wrong, try once more.");
				break;
			case 3:
				System.out.println("Don't give up.");
				break;
			case 4:
				System.out.println("No, keep trynig.");
				break;
			}
		}
	}
}
