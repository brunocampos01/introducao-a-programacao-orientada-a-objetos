public class ConversaoCmParaPol {
    public static void main(String[] args) {
        System.out.println("1 cm = " + conversaoParaPol(1) + " polegas");
        System.out.println("10.1 cm = " + conversaoParaPol(10.1) + " polegas");
        System.out.println("5 cm = " + conversaoParaPol(5) + " polegas");
    }

    // metodo que faz a conversao de cm para pol
    public static double conversaoParaPol(double cm) {
        double pol = 0;
        pol = cm * 2.54;
        return pol;
    }
}
