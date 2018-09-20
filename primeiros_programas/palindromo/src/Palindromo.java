public class Palindromo {
    public static void main(String[] args){
        System.out.println(ehPalindromo(5555));//true
        System.out.println(ehPalindromo(5885));
        System.out.println(ehPalindromo(2088));
        System.out.println( ehPalindromo(5353));// false
    }
    public static boolean ehPalindromo(int numero){
        int milhar, centena, dezena, unidade, resto;
        
        milhar = numero / 1000;
        resto = numero % 1000;
        centena = resto / 100;
    	resto = resto % 100;
    	dezena = resto / 10;
    	unidade = resto % 10;
        
        return milhar == unidade && centena == dezena;
    }
    
}
