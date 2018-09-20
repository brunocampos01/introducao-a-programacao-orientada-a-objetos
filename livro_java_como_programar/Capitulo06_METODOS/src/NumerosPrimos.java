//6.25 com raiz quadrada - otimizado

public class NumerosPrimos {

	public static void main(String[] args) {
		
		System.out.println(ehPrimo(79));
	}
	public static boolean ehPrimo(int n){
		int somaDivisores = 0;
		
		for(int i=1; i<=Math.sqrt(n); i++){ //testa todos os numeros ate n
			if(n%i == 0){	// verifica quem eh divisivel
				somaDivisores ++;
				System.out.println(i); //exibe divisores
			}
		}
		if (somaDivisores == 1){
			return true;
		}else{
			return false;
		}
	}

}
