public class AnoBissexto {
    public static void main(String[] args) {
        System.out.println(ehBissexto(2014));
        System.out.println(ehBissexto(2012));
        System.out.println(ehBissexto(1500));
    }

    public static boolean ehBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0;

    }

}
