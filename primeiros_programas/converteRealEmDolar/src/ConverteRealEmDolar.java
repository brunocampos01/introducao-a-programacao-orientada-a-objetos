import java.util.Scanner;

public class ConverteRealEmDolar {
    public static void main(String[] args) {
        System.out.println(converteParaDolar(2.5));
    }
    public static double converteParaDolar(double reais){
        double dolar;
        Scanner entrada;
        entrada = new Scanner(System.in);
        double cotacaoAtual = 0;
        System.out.println("qual a cotacao do dolar hoje?");
        cotacaoAtual = entrada.nextDouble();
        dolar = reais*cotacaoAtual;
        return dolar;
    }
    
}
