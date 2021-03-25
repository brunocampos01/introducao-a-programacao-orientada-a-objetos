public class RaizesEquacao2Grau {
    public static void main(String[] args) {
        System.out.println(raizesDaEquacao(2, 9, 2));
    }

    public static double raizesDaEquacao(double a, double b, double c) {
        double delta;
        double raiz;
        delta = (b * b - 4 * a * c);
        return raiz = (-b + Math.sqrt(delta)) / (2 * a);
    }
}
