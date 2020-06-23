import java.util.Scanner;

public class AumentoSalarioFOR {
    public static void main(String[] args) {
        // atributos
        int i, anoA;
        double porcentagem, salario0, novoSal;
        Scanner entrada;
        entrada = new Scanner(System.in);
        salario0 = 1000;
        porcentagem = 0.015;
        novoSal = salario0 + porcentagem * salario0;
        System.out.println("digite o ano:");
        anoA = entrada.nextInt();

        for (i = 2007; i <= anoA; i++) {
            porcentagem *= 2;
            novoSal = novoSal + porcentagem * novoSal;
        }
        System.out.println("o novo salario é:" + novoSal);

    }

}
