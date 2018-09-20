// Fig. 7.20: VarargsTest.java
// Utilizando listas de argumentos de comprimento variável.

package ch07.fig07_20;

public class VarargsTest 
{
   // calcula a média
   public static double average(double... numbers)
   {
      double total = 0.0; // inicializa o total

      // calcula total utilizando a instrução for aprimorada
      for ( double d : numbers )              
         total += d;                          

      return total / numbers.length;
   } // fim do método average

   public static void main( String args[] ) 
   {
      double d1 = 10.0;
      double d2 = 20.0;
      double d3 = 30.0;
      double d4 = 40.0;

      System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
         d1, d2, d3, d4 );

      System.out.printf( "Average of d1 and d2 is %.1f\n", 
         average( d1, d2 )); 
      System.out.printf( "Average of d1, d2 and d3 is %.1f\n", 
         average( d1, d2, d3 ));
      System.out.printf( "Average of d1, d2, d3 and d4 is %.1f\n", 
         average( d1, d2, d3, d4 ));
   } // fim de main
} // fim da classe VarargsTest


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/