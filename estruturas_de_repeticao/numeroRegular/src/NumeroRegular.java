/*1 Verificar se um número é regular

Um número é dito regular se sua decomposição em fatores primos apresenta apenas potências de 2, 3 e 5. Por exemplo, o número 60 é um número regular  uma vez que:
60 = 2²×3×5

Verifique, então, se um dado número é ou não regular.

public static boolean ehRegular(int n)*/
public class NumeroRegular {
    public static void main (String [] args)
    {
        System.out.println(ehRegular (60));
        System.out.println(ehRegular (20));
        System.out.println(ehRegular (5));
        System.out.println(ehRegular (30));
    }
    public static boolean ehRegular (int n)
    {
        double resto;
        
        if ( n%5 == 0){
            n = n/5;
            if(n%3 == 0){
                n = n/3;
                if(n%2 == 0){
                    n = n/2;
                    return true;
                } 
            }
        }
        return false;
    }
}