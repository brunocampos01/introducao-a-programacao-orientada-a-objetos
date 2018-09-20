/* MDC:
Calcular o MDC (máximo divisor comum) entre dois números:
public static int mdc(int numero1, int numero2)*/

public class MDC {
    public static void main(String[] args) {
    	//teste
        System.out.println(mdc(36,90));
    }
    public static int mdc(int numero1, int numero2) {
    	int menor = Math.min(numero1, numero2);
    	for(int i=menor; i >= 2; i--) {
    		if(numero1%i==0 && numero2%i==0) {
    			return i;
    		}
    	}
    	return 1;
    }
}
