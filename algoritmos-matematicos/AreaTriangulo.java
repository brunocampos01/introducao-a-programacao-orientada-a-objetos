public class AreaTriangulo {
    public static void main(String[] args) {
        // atributos
        int base = randomTamanhos();
        int altura = randomTamanhos();
        int areaTriangulo = (base * altura) / 2;

        System.out.println("Medidas do triangulo: " + base + ", " + altura);
        System.out.println(areaTriangulo);
    }

    public static int randomTamanhos() {
        double tamanhosRandomica = Math.random() * 10;
        return (int) tamanhosRandomica;
    }
}
