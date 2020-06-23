public class AprovacaoUFSC {
    public static void main(String[] args) {
        // testes
        System.out.println(media(9.2, 7.25, 5.75));
        System.out.println(media(9.2, 7.25, 5.75));
        System.out.println(media(9.2, 6.58, 9.8));
    }

    public static double media(double nota1, double nota2, double nota3) {
        // variaveis de escopo
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        int parteInteira = (int) media;
        double parteFracionaria = media - parteInteira;

        if (media >= 6) {
            if (parteFracionaria < 0.25) {
                return parteInteira;
            } else if (parteFracionaria < 0.75) {
                return parteInteira + 0.5;
            } else {
                return parteInteira + 1;
            }
        } else {
            if (parteFracionaria < 0.25) {
                return parteInteira;
            } else if (parteFracionaria < 0.75) {
                return parteInteira + 0.5;
            } else {
                return parteInteira + 1;
            }
        }
    }
}
