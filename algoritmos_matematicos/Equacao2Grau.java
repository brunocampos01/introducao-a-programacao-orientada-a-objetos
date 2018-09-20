public class Equacao2Grau {
	public static void main(String[] args) {
		//atributos
		int a = (int) numeroAleatorio();
		int b = (int) numeroAleatorio();
		int c = (int) numeroAleatorio();
		System.out.println(+a+ "x^2 + " +b+ "x + " +c);
		int x1;
		int x2;
		
		//condicao para ser equacao do 2 grau a>0
		while(a == 0){
			a = (int) numeroAleatorio();
			System.out.println("a = "+a);
		}
		
		//delta
		int delta = (int) (Math.pow(b, 2) - 4*a*c);
		System.out.println(delta);
		
		if (delta == 0){
			x1 = (int) ((+b + Math.sqrt(delta))/ (2*a));
			
			System.out.println(" 1 raiz real x1=x2");
			System.out.println("DELTA = " +x1);
		}
		if (delta < 0){
			System.out.println(" N�O tem raiz real");
		}
		if (delta > 0){
			x1 = (int) ((+b + Math.sqrt(delta))/ (2*a));
			x2 = (int) ((-b + Math.sqrt(delta))/ (2*a));

			System.out.println(" 2 raizes reais");
			System.out.println(x1);
			System.out.println(x2);
		}
	}
	
	//metodo para obter numeros aleatorios
	public static double numeroAleatorio(){
		double random = Math.random()* 10;
		return random;
	}
}
