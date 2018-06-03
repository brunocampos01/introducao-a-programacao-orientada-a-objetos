package matematicaBasica;

public class MediaPonderada {

	
	public static void main(String[] args) {
		
		// atributos
		double nota1 = random();
		double nota2 = random();
		double nota3 = random();

		double peso1 = 5;
		double peso2 = 3;
		double peso3 = 2;
		double media;
		
		media = (nota1*peso1 +nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3) ;
		System.out.println("notas: " +nota1+ ", "+nota2+ ", "+nota3);
		System.out.println("media: " +media);

	}
	
	//metodos
	public static double random(){
		int notas = (int) (Math.random() * 10);
		return notas;
	}

}
