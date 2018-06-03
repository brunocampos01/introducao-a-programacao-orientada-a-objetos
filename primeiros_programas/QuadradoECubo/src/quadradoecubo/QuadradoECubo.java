/*
1. Leia um numero ´ n e escreva o quadrado e o cubo para inteiro de 2 a n.
 */
package quadradoecubo;

public class QuadradoECubo {
    public static void main(String[] args) {
        double a;//quadrado
        double b;//cubo
        
        for(int i=2; i<=5; i++){
            a=Math.pow(i,2);
            b=Math.pow(i,3);
            System.out.println(a+" "+b);
        }
    }
}
