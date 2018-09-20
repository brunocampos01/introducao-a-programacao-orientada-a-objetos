//6.24
public class NumerosPerfeitos {
	public static void main(String[] args) {	
		
		System.out.println(isPerfect(6));
	}

	public static boolean isPerfect(int number){
		int soma = 0;
		
		for(int i=1; i<number; i++){ // testa todos os numeros ate o NUMBER
			if (number%i == 0){ //verifica se eh dividor de NUMBER
				soma = i + soma; // se for, soma
				System.out.print(+i+ " + ");
			}
			//System.out.println(soma);
		}
		if(soma == number){ //verifica se eh perfeito (soma dos fatores = a ele mesmo)
			return true;
		}else{
		return false;
		}
	}
}
