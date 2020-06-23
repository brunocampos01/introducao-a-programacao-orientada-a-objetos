public class ParOuImpar {
    public static void main(String[] args) {
        // testes
        System.out.println(ehPar(2));
        System.out.println(ehPar(3));
        System.out.println(ehPar(0));
        System.out.println(ehPar(52626));
    }

    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
