//6.14 metodo com argumentos

public class Exponenciacao {
	public static void main(String[] args) {
		System.out.println(integerPower(4,3));
	}
	
	public static int integerPower(int base, int expoente){
		int resultado=base;
		
		for(int i=2; i<=expoente; i++){
			//System.out.println(resultado);
			resultado = base*resultado;
		}
		return resultado;
	}
}
