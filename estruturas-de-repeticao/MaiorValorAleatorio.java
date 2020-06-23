/*Maior valor aleatório:
Obter o maior valor dentre m valores gerados aleatoriamente no intervalo [1,n]:
public static int maiorValor(int numValores, int n)*/

public class MaiorValorAleatorio {
    public static void main(String[] args) {
        // teste
        System.out.println("\nO maior valor é = " + maiorValor(5, 15));
    }

    public static int maiorValor(int numValores, int n) {
        int num = 0;
        System.out.print("Foi gerado os números = ");
        for (int i = 1; numValores >= i; i++) {
            num = (int) (Math.random() * n);
            System.out.print(num + "| ");
        }
        return Math.max(1, num);
    }

}
