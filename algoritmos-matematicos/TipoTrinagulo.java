public class TipoTrinagulo {
    public static void main(String[] args) {
        // testes
        System.out.println(tipoDeTriangulo(5, 5, 5));
        System.out.println(tipoDeTriangulo(3, 4, 5));
        System.out.println(tipoDeTriangulo(4, 5, 5));
    }

    public static String tipoDeTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoA == ladoC) {
            return ("equilatero");
        }
        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            return ("escaleno");
        } else {
            return ("isoceles");
        }
    }
}
