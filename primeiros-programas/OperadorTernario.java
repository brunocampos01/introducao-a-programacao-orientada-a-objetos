import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        // variaveis
        double nota;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        nota = entrada.nextDouble();

        // sustitui o if else
        System.out.println(nota >= 5.75 ? "aprovado" : "reprovado");
    }

}
