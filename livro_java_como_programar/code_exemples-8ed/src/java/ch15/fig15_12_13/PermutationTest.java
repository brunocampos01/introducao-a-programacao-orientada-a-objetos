// Fig. 15.13: PermutationTest.java
// Testando o método recursivo para permutar strings.

package ch15.fig15_12_13;

import java.util.Scanner;

public class PermutationTest
{  
   public static void main( String args[] )
   {
      Scanner scanner = new Scanner( System.in );
      Permutation permutationObject = new Permutation();

      System.out.print( "Enter a string: " );
      String input = scanner.nextLine(); // recupera String a permutar

      // permuta String 
      permutationObject.permuteString( "", input );
   } // fim de main
} // fim da classe PermutationTest


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