/*6 Quadros Perfeitos
Calcular quantos quadrados perfeitos há no intervalo [2,n] (Um número é um quadrado perfeito quando sua raiz quadrada 
dá como resultado um número inteiro)

public static int qtdadeQuadradosPerfeitos(int n)
*/
public class QuadradoPerfeito {
    public static void main(String[] args) {
        System.out.println(qtdadeQuadradosPerfeitos(100));
    }
    public static int qtdadeQuadradosPerfeitos(int n)
    {
        int cont = 0;
        int raiz =0;
        for(int i=4; n<=i; i++)
        {
            raiz = (int) (Math.sqrt(i));// calculei a raiz
            if(raiz%1 == 0){
                cont++;
        }else{
                i++;
             }
        }
        return cont;
    }
}
