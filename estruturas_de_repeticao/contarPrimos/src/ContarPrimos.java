/*12 Contar Primos
Contar quantos números primos há no intervalo [x, y] (inclusive):

public static int qtdadeNumerosPrimos(int x, int y)*/
public class ContarPrimos {
    public static void main(String[] args) {
        System.out.println(qtdadeNumerosPrimos(2,5));
    }
    public static int qtdadeNumerosPrimos( int x, int y)
    {
        int cont = 0;
        
//estrutura de selecao:
        for(int i=x; i<=y; i++) // faz percorrer o intervalo
        {
            if(x%2==0){
                cont --;
            }
        }
        return cont;
    }
}
