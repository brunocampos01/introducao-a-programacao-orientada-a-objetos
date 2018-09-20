//calcula o produto de numeros interos impares de 1 a 15

public class CalculandoOProdutoDeNumerosInteriosImpares {
	public static void main(String[] args) {
		
		int anterior = 1;
		int multiplicador = 1;
		int i = 1;
		
		while(i<=15){
			multiplicador = i*multiplicador;
			//o valor do multiplicador anterior*i atual
			
			anterior = i;
			System.out.println(multiplicador);
			i = i + 2;
		}
	}
}
