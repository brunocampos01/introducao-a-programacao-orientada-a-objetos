public class ConversaoCmParaPol {
    public static void main(String[] args) {
        System.out.println(conversaoParaPol (1));
        System.out.println(conversaoParaPol (10.1));
        System.out.println(conversaoParaPol (5));
    }
    public static double conversaoParaPol (double cm){
        double pol = 0;
        pol = cm*2.54;
        return pol;
    }
}
