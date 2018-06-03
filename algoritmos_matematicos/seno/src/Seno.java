/*15 Seno
Calular o valor aproximado do seno de um ângulo x (dado em radianos) 
utilizando a série de Taylor: 
seno\left(x\right)=x- \frac{x^{3}}{{3}!} + \frac{x^{5}}{{5}!} - \frac{x^{7}}{{7}!} +..., para -∞ < x < ∞.

public static double seno(double x)*/
public class Seno {
    public static void main(String[] args) {
        System.out.println(seno(0));
    }
    public static double seno(double x)
    {
        double seno=0;
        int fator=0;

        for(int i=1; i<=20; i=+2)
        {
            double termo= Math.pow(x,i)/fator;
            seno +=termo*fator;
            fator*=-1;
        }
        return seno;
    }    
}
