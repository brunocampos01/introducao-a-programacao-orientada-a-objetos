public class ConceitoMedia {
    public static void main(String[] args) {
        // testes
        System.out.println(conceito(5, 8, 10));
        System.out.println(conceito(9, 8, 10));
        System.out.println(conceito(5, 2, 5));
        System.out.println(conceito(7, 7, 7));
    }

    public static String conceito(double nota1, double nota2, double nota3) {
        double media;
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 9) {
            return ("conceito: otimo");
        }
        if (media >= 7.5 && media < 9) {
            return ("conceito: bom");
        }
        if (media >= 6 && media < 7.5) {
            return ("conceito: satisfatorio");
        }
        if (media < 6) {
            return ("conceito: insuficiente");
        }
        return null;
    }
}