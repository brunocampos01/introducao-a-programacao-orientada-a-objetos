//6.26
public class DigitosInvertidos {
	public static void main(String[] args) {
		//teste
		System.out.println(inverteNumero(1234));
	}
	
	public static int inverteNumero(int n){
		int milhar = n/1000;
		System.out.println("milhar: " +milhar);
		int centena = n/100 - milhar*10;
		System.out.println("centena: " +centena);
		int dezena = n/10 - milhar*100 - centena*10;
		System.out.println("dezena: " +dezena);
		int unidade = n/1 - milhar*1000 - centena*100 - dezena*10;
		System.out.println("unidade: " +unidade);
		
		System.out.print(unidade);
		System.out.print(dezena);
		System.out.print(centena);
		System.out.println(milhar);
		
		return n;
	}
}
