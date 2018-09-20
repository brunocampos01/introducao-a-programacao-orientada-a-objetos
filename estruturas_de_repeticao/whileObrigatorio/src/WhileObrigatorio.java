/*Este exemplo mostra que o WHile é obrigatorio para exibir uma quantidade diferente de mensagens na tela, 
neste caso é impossivel fazer com somente System.out.print*/

public class WhileObrigatorio {
    public static void main(String[] args) {
        double i = 0;
        double nAleatorio = Math.random()*100;
        System.out.println(nAleatorio); // para saber qual numero ele pegou
        while(i<=nAleatorio){
            System.out.println(i); //se for 1+i entao ele nao imprime o 0.
            i++;
        }
    }
}
