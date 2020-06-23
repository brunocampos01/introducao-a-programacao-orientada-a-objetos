/*Fatorial:
Calcular o fatorial de um número natural:
public static double fatorial(int numero) */

public class Fatorial {
    public static void main(String[] args) {
        // testes
        System.out.println(fatorial(0));
        System.out.println(fatorial(10));
        System.out.println(fatorial(5));
    }

    public static double fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}