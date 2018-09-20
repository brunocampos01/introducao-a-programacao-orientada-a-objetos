// Fig. 13.1: DivideByZeroNoExceptionHandling.java
// Um aplicativo que tenta dividir por zero.

package ch13.fig13_01;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling
{
   // demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
   public static int quotient( int numerator, int denominator )
   {
      return numerator / denominator; // possible division by zero
   } // fim de método quotient

   public static void main( String args[] )
   {
      Scanner scanner = new Scanner( System.in ); // scanner para entrada

      System.out.print( "Please enter an integer numerator: " );
      int numerator = scanner.nextInt();
      System.out.print( "Please enter an integer denominator: " );
      int denominator = scanner.nextInt();

      int result = quotient( numerator, denominator );
      System.out.printf( 
         "\nResult: %d / %d = %d\n", numerator, denominator, result );
   } // fim de main
} // fim da classe DivideByZeroNoExceptionHandling 


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