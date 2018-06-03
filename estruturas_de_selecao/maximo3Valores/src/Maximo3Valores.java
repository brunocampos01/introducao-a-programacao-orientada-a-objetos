public class Maximo3Valores {
    public static void main(String[] args) {
    System.out.println (maximo(5, 2, 15));
    System.out.println (maximo(1, 1, 1));
    }
    public static double maximo(double valor1, double valor2, double valor3)
    {
       if (valor1 == valor2 && valor1 == valor3){
           System.out.println ("é tudo IGUAL");
       }if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
           System.out.println (+ valor1 + "-" + valor2 +"-"+ valor3);
       }if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3){
           System.out.println (+ valor2 + "-" + valor1 + "-"+ valor3);
       }if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2){
            System.out.println (+valor3 + "-" +valor1 +"-"+valor2);
       
       }if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2){
            System.out.println (+valor1 + "-" +valor3 + "-" +valor2);
       }if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1){
           System.out.println (+ valor2 + "-" + valor3 + "-"+ valor1);
       }if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1){
            System.out.println (+valor3 + "-" +valor2 + "-"+valor1);
       }
        return 0;
    }
}