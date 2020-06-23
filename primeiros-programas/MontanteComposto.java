public class MontanteComposto {
    public static void main(String[] args) {
        System.out.println(montanteComposto(500, 10, 5));
    }

    // Montante = c(1 + i)**t
    // i = taxa de juros
    // t = tempo ou periodo
    // capital inicial
    public static double montanteComposto(double c, int t, double i) {
        return c * Math.pow((1 + i / 100), t);
    }

}
