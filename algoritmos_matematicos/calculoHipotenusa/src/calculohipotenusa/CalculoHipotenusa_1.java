/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculohipotenusa;

/**
 *
 * @author bruno_000
 */
public class CalculoHipotenusa {
    private static double hipotenusa;
    public static void main(String[] args) 
    {
        System.out.println (hipotenusa( 3, 4));
        System.out.println (hipotenusa( 10, 4.9));
        System.out.println (hipotenusa( 30, 40));
    }
    public static double hipotenusa(double cateto1, double cateto2)
    {
      return Math.sqrt(cateto2 * cateto2 + cateto1 * cateto1));
    }
    
}
