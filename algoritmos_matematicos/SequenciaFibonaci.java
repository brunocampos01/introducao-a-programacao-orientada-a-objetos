/*Sequência de Fibonacci:
Cálculo do n-ésimo termo da Seqüência de Fibonacci:
public static int fibonacci(int n)
o 1 termo = 0, 2 termo = 1, 3 termo = 1, 4 termo = (soma dos dois anteriores*/

public class SequenciaFibonaci {
    public static void main(String[] args) {
    	//teste
        System.out.println(fibonacci (13));
    }
    public static int fibonacci (int n){
	    if(n==1){
	        return 0;
	    }
	    int x = 0;// 1 termo
	    int y = 1;// 2 termo
	    
	    for (int i=3; i<=n; i++){ // a instrucao diz q vai repetir os comandos até que i<=n
	       int z= x + y; // soma dos primeiros termos
	       x = y;
	       y = z;
	    }
	        return y;
    }
}