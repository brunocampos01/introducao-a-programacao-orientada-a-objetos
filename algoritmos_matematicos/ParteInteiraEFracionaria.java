public class ParteInteiraEFracionaria{

	public static void main(String[] args) {	
		//atributos
		double n = gerador(); 
		int parteInteira = (int) n;
		double fracao = n - parteInteira;   

		System.out.println("numero gerado: " +n);
		System.out.println("parte INTEIRA: " +parteInteira);
		System.out.println("parte FRACINARIA: " +fracao);
	}
	
	//metodos
	public static double gerador(){
		double aleatorio = Math.random()*10;
		return aleatorio;
	}

}
