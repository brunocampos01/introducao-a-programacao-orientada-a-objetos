import java.util.Scanner;

public class ConverteRealEmDolar {
    public static void main(String[] args) {
        System.out.println(converteParaDolar(1.0));
    }
    public static String converteParaDolar(double reais){
        double dolar;
        Scanner entrada;
        entrada = new Scanner(System.in);
        double cotacaoAtual = 0;
        System.out.println("qual a cotacao do dolar hoje em reais (,) ?");
        cotacaoAtual = entrada.nextDouble();
        dolar = reais/cotacaoAtual;
        
        String msg = ("$ "+cotacaoAtual+" reais vale R$ "+dolar+" dolares."); 
        return msg;
    }
    
}
