//6.9
public class Arredondamento {
	public static void main(String[] args) {

		// atributos
		
		double x = gerador() + 1;
		System.out.println("Original:"+x);
		
		double y = Math.floor(x);
		System.out.println("Arredondado:"+y);
		
	}
	
		//metodos
	public static double gerador(){
		double geradorNumeros = Math.random()*100;
		return geradorNumeros;
	}
}
