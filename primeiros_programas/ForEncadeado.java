/*
8. Imprima a seguinte tabela, usando for’s encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
 */
public class ForEncadeado {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
        	//linha i
            for(int j=1; j<=i; j++){
            	//coluna j
                System.out.print(i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
