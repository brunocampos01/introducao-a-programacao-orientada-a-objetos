// Fig. 8.14: StaticImportTest.java
// Utilizando import static para importar métodos static da classe Math.

package ch08.fig08_14;

import static java.lang.Math.*;

public class StaticImportTest 
{
   public static void main( String args[] ) 
   {
      System.out.printf( "sqrt( 900.0 ) = %.1f\n", sqrt( 900.0 ));
      System.out.printf( "ceil( -9.8 ) = %.1f\n", ceil( -9.8 ));
      System.out.printf( "log( E ) = %.1f\n", log( E ));
      System.out.printf( "cos( 0.0 ) = %.1f\n", cos( 0.0 ));
   } // fim de main
} // fim da classe StaticImportTest


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