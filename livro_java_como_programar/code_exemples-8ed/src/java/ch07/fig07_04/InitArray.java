// Fig. 7.4: InitArray.java
// Calculando valores a serem colocados em elementos de um array.

package ch07.fig07_04;

public class InitArray
{
   public static void main( String args[] )
   {
      final int ARRAY_LENGTH = 10; // declara a constante      
      int array[] = new int[ ARRAY_LENGTH ]; // cria o array

      // calcula valor de cada elemento do array
      for ( int counter = 0; counter < array.length; counter++ )
         array[ counter ] = 2 + 2 * counter;

      System.out.printf( "%s%8s\n", "Index", "Value" ); // títulos de coluna
   
      // gera saída do valor de cada elemento do array
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
   } // fim de main
} // fim da classe InitArray


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