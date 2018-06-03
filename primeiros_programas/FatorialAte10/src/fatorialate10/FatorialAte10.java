/*
Imprima os fatoriais de 1 a 10.
O fatorial de um numero n ´ e n * n-1 * n-2 ... at ´ e n = 1. Lembre-se de utilizar os par ´ enteses. ˆ
O fatorial de 0 e 1 ´
O fatorial de 1 e (0!) * 1 = 1 ´
O fatorial de 2 e (1!) * 2 = 2 ´
O fatorial de 3 e (2!) * 3 = 6 ´
O fatorial de 4 e (3!) * 4 = 24 ´
Fac¸a um for que inicie uma variavel n (n ´ umero) como 1 e fatorial (resultado) como 1 e varia n de 1 at ´ e´
10:
1 int fatorial = 1;
2 for (int n = 1; n <= 10; n++) {
3
4 }
 */
package fatorialate10;
public class FatorialAte10 {
    public static void main(String[] args) {
        int fat=1;
        
        for(int n=2; n<=10; n++){
            System.out.println(fat=(n-1)*fat);
        }
    }  
}
/* questao 5 - No codigo do exerc ´ ´ıcio anterior, aumente a quantidade de numeros que ter ´ ao os fatoriais impressos, at ˜ e´
20, 30, 40. Em um determinado momento, alem desse c ´ alculo demorar, vai comec¸ar a mostrar respostas ´
completamente erradas. Por que?ˆ
Mude de int para long para ver alguma mudanc¸a.

Resposta:
isso ocorre devido o int ser um tipo primitivo que consegue armazenar até 2147483647
