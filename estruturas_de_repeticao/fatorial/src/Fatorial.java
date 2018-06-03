/*
2 Fatorial
Calcular o fatorial de um número natural:

public static double fatorial(int numero)
 */
public class Fatorial {
    public static void main(String[] args) {
        System.out.println(fatorial (0));
    }
public static double fatorial (int n){
    if(n == 0){
        return 1;
    }else{
        return n*fatorial(n-1);
    }
}
}