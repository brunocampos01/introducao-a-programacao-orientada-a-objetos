/*
5 Maior valor aleatório
Obter o maior valor dentre m valores gerados aleatoriamente no intervalo [1,n]:

public static int maiorValor(int numValores, int n)*/
public class MaiorValorAleatorio {
    public static void main(String[] args) {
        System.out.println(maiorValor ( 5, 15));
    }
    public static int maiorValor (int numValores, int n)
    { 
        int num = 0;
        for(int i = 1; numValores>= i; i++)
        {
        num = (int)(Math.random()*n);
        }
        return Math.max(1, num);
    }
    
}
