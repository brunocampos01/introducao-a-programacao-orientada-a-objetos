// Fig. 19.19: SortedSetTest.java
// Utilizando TreeSet e SortedSet.

package ch19.fig19_19;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest 
{
   private static final String names[] = { "yellow", "green",
       "black", "tan", "grey", "white", "orange", "red", "green" };
   
   // cria um conjunto classificado com TreeSet, e depois o manipula
   public SortedSetTest()
   {
      // cria TreeSet                                  
      SortedSet< String > tree =                         
         new TreeSet< String >( Arrays.asList( names ) );

      System.out.println( "sorted set: " );
      printSet( tree ); // conteúdo de saída de árvore

      // obtém headSet com base em "orange"
      System.out.print( "\nheadSet (\"orange\"):  " );
      printSet(tree.headSet( "orange" ));

      // obtém tailSet baseado em "orange"
      System.out.print( "tailSet (\"orange\"):  " );
      printSet(tree.tailSet( "orange" ));

      // obtém primeiro e último elementos
      System.out.printf( "first: %s\n", tree.first());
      System.out.printf( "last : %s\n", tree.last());
   } // fim do construtor SortedSetTest

   // gera saída do conjunto
   private void printSet( SortedSet< String > set )
   {
      for ( String s : set )
         System.out.printf( "%s ",  s );

      System.out.println();
   } // fim do método printSet

   public static void main( String args[] )
   {
      new SortedSetTest();
   } // fim de main
} // fim da classe SortedSetTest 


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