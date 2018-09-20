// Fig. 16.7: SelectionSortTest.java
// Testa a classe de classificação por seleção.

package ch16.fig16_06_07;

public class SelectionSortTest
{
   public static void main( String[] args )
   {
      // cria um objeto para realizar a classificação por seleção
      SelectionSort sortArray = new SelectionSort( 10 );
      
      System.out.println( "Unsorted array:" );
      System.out.println( sortArray ); // imprime um array não-classificado

      sortArray.sort(); // classifica o array

      System.out.println( "Sorted array:" );
      System.out.println( sortArray ); // imprime o array classificado
   } // fim de main
} // fim da classe SelectionSortTest


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