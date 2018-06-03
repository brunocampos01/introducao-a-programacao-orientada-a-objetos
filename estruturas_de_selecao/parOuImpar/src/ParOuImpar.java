public class ParOuImpar {
    public static void main(String[] args) 
    {
       System.out.println(ehPar(2));
       System.out.println(ehPar(3));
       System.out.println(ehPar(0));
       System.out.println(ehPar(52626));
    }
    public static boolean ehPar(int numero)
    {
        return numero % 2 == 0;
    }
    
}
