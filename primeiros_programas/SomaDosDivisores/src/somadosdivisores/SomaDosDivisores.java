/*
5. Leia um numero inteiro e some todos os seus divisores.
 */
package somadosdivisores;
public class SomaDosDivisores {
    public static void main(String[] args) {
        int a=8;
        int cont=0;
        
        for(int i=1; i<=a; i++){
            if(a%i==0){
                    cont+=i;
            }
        }
        System.out.println(cont);
    }    
}
