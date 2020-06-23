/*
2. Leia n numeros inteiros e, em seguida, escreva quantos sao pares e quantos sao ımpares.*/

public class DiferenciaParEImpar {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {//le os numeros
            if (x % 2 == 0) {
                System.out.printf("par: %d\n", x);
            } else {
                System.out.printf("impar: %d\n", x);
            }
        }
    }

}
