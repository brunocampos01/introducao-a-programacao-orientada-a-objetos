public class PorcentagemAumento {
    public static void main(String[] args) {

        // atributos
        double salario = RandomSalario();
        double aumento = salario * 0.25;
        double novoSalario = salario + aumento;

        System.out.println("Salario atual: " + salario);
        System.out.println("Salario com reajuste: " + novoSalario);
    }

    // metodos
    public static double RandomSalario() {
        double salarioMinimo = Math.random() * 1000;
        return salarioMinimo;
    }

}
