// Fig. 19.14: BinarySearchTest.java
// Utilizando o algoritmo binarySearch.

package ch19.fig19_14;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest 
{
   private static final String colors[] = { "red", "white",  
      "blue", "black", "yellow", "purple", "tan", "pink" };
   private List< String > list; // referência de ArrayList

   // cria, classifica e gera a saída da lista
   public BinarySearchTest()
   {
      list = new ArrayList< String >( Arrays.asList( colors ) );  
      Collections.sort( list ); // classifica a ArrayList
      System.out.printf( "Sorted ArrayList: %s\n", list );
   } // fim do construtor BinarySearchTest

   // pesquisa vários valores na lista
   private void search()
   {
      printSearchResults( colors[ 3 ] ); // primeiro item
      printSearchResults( colors[ 0 ] ); // item do meio
      printSearchResults( colors[ 7 ] ); // último item
      printSearchResults( "aqua" ); // abaixo do mais baixo
      printSearchResults( "gray" ); // não existe
      printSearchResults( "teal" ); // não existe
   } // fim do método search

   // realiza pesquisas e exibe o resultado da pesquisa
   private void printSearchResults( String key )
   {
      int result = 0;

      System.out.printf( "\nSearching for: %s\n", key );
      result = Collections.binarySearch( list, key );

      if ( result >= 0 )
         System.out.printf( "Found at index %d\n", result );
      else
         System.out.printf( "Not Found (%d)\n",result );
   } // fim do método printSearchResults

   public static void main( String args[] )
   {
      BinarySearchTest binarySearchTest = new BinarySearchTest();
      binarySearchTest.search();
   } // fim de main      
} // fim da classe BinarySearchTest


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