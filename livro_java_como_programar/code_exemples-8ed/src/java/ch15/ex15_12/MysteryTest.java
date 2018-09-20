// Exercício 15.12: MysteryTest.java

package ch15.ex15_12;

public class MysteryTest
{
   public static void main( String args[] )
   {
      MysteryClass mysteryObject = new MysteryClass();

      int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

      int result = mysteryObject.mystery( array, array.length );

      System.out.printf( "Result is: %d\n", result );
   } // fim do método main
} // fim da classe MysteryTest 


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