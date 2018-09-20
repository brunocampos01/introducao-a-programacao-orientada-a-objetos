import java.util.Random;

public class MediaAritmetica {
	public static void main(String[] args) {
		// atributos	
		double nota1 = Math.random() * 10;
		double nota2 = Math.random() * 10;
		double nota3 = Math.random() * 10;
		int notaFinal;
		
		notaFinal = (int) ((nota1 + nota2 + nota3)/3); //(int) cast para gerar nota inteira
		
		System.out.println(notaFinal);

	}

}
