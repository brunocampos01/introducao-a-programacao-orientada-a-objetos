
import java.text.DecimalFormat;

public class Arredondamento {
    public static void main(String[] args) {
        System.out.println(arredonda(5.1234 ,2));
        System.out.println(arredonda(5.5234 ,2));
        System.out.println(arredonda(5.490234 ,2));
    }
    public static String arredonda(double valor, int numeroCasasDecimais)
    {
        System.out.printf("o valor é: %.2f",  +valor);
        return new DecimalFormat("0.0").format(valor);
    }
}
