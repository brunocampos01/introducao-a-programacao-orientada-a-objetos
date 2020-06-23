public class SomaPA {

    public static void main(String[] args) {
        System.out.println(somaNtermosPA(2, 2, 3));
        System.out.println(somaNtermosPA(2, 10, 10));
    }

    public static int somaNtermosPA(int a1, int r, int n) {
        int soma;
        return soma = (a1 + (a1 + (n - 1) * r)) * n / 2;
    }
}
