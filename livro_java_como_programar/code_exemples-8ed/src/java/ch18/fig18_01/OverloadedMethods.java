// Fig. 18.1: OverloadedMethods.java
// Utilizando métodos sobrecarregados para imprimir um array de diferentes tipos.

package ch18.fig18_01;

public class OverloadedMethods 
{
   // método printArray para imprimir um array de Integer
   public static void printArray( Integer[] inputArray )
   {
      // exibe elementos do array
      for ( Integer element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // fim do método printArray

   // método printArray para imprimir um array de Double
   public static void printArray( Double[] inputArray )
   {
      // exibe elementos do array
      for ( Double element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // fim do método printArray

   // método printArray para imprimir um array de Character
   public static void printArray( Character[] inputArray )
   {
      // exibe elementos do array
      for ( Character element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // fim do método printArray

   public static void main( String args[] ) 
   {
      // cria arrays de Integer, Double e Character
      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println( "Array integerArray contains:" );
      printArray( integerArray ); // passa um array de Integers
      System.out.println( "\nArray doubleArray contains:" );
      printArray( doubleArray ); // passa um array Doubles
      System.out.println( "\nArray characterArray contains:" );
      printArray( characterArray ); // passa um array de Characters
   } // fim de main
} // fim da classe OverloadedMethods


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