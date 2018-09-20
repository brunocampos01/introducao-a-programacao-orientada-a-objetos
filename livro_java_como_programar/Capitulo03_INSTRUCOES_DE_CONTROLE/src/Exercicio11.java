//localiza o menor numero
public class Exercicio11 {
	public static void main(String[] args) {
	
		//quantidade de numeros para a comparacao
		int a = Exercicio11.geradorNumeros();
		int b = geradorNumeros();
		System.out.println("numeros gerados: " +a);
		
		int auxiliar = 110;
		
		for (int x=0; x<a; x++){
			int numero= geradorNumeros(); //aqui eh gerado cada 
			//numero sendo a quantidade gerada definada por a
			System.out.println(numero);

			if(numero <= auxiliar){
				auxiliar = Math.min(numero, auxiliar); //variavel auxiliar armazena o < num
				//System.out.println("auxiliar: "+auxiliar);
			}
			//depois de todas as interacoes, eh imprimido o < n entre todas as comparacoes
			System.out.println("menor: " +auxiliar);
		}
	}
	
	public static int geradorNumeros(){
		int numeroAleatorio = (int) (Math.random() * 10);
		return numeroAleatorio;
	}	
}
