public class Fatorial {
    public static void main(String[] args) {
        int fat = 3;

        for (int n = 2; n <= 3; n++) {
            fat = fat * (n - 1);
            System.out.println(fat);
        }
    }
}
