/*8 Massa Radioativa
Calcular quanto tempo demora a massa de um material radioativo para reduzir a menos de 0,5 gramas,
dado que um material radioativo perde metade de sua massa a cada 50 segundos

public static double tempoParaReducao(double massa)*/

public class MassaRadioativa {
    public static void main(String[] args) {
        System.out.println(tempoParaReducao(100));
    }
    public static double tempoParaReducao(double massa)
    {
        //variaveis:
        double tempo;
        int cont = 0;
        
        //estrutura de repeticao
        while(massa>=0.5)
        {
            massa = massa/2;
            cont++;
        }
        tempo = cont*50;
        return tempo;
    }
}
