public class FatorialOutraForma {
    public static void main(String[] args) {
        // teste
        System.out.println(fatorial(5));
    }

    public static double fatorial(int n) {
        double fat = 1;
        for (int i = n; i > 1; i--) {
            fat *= i;
        }
        return fat;
    }
}
