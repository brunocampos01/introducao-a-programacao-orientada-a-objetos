public class AreaCirculo {
    public static void main(String[] args) {
        // testes
        System.out.println(areaDoCirculo(10));
        System.out.println(areaDoCirculo(2));
    }

    public static double areaDoCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}
