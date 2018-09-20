// Fig. 19.9: Sort2.java
// Utilizando um objeto Comparator com o algoritmo sort.

package ch19.fig19_09;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 
{
   private static final String suits[] = 
      { "Hearts", "Diamonds", "Clubs", "Spades" };

   // gera saída de elementos List
   public void printElements()
   {
      List< String > list = Arrays.asList( suits ); // cria List

      // gera saída de elementos List
      System.out.printf( "Unsorted array elements:\n%s\n", list );

      // classifica em ordem decrescente utilizando um comparador
      Collections.sort( list, Collections.reverseOrder() );

      // gera saída de elementos List
      System.out.printf( "Sorted list elements:\n%s\n", list );
   } // fim do método printElements
 
   public static void main( String args[] )
   {
      Sort2 sort2 = new Sort2();
      sort2.printElements();
   } // fim de main
} // fim da classe Sort2 


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
