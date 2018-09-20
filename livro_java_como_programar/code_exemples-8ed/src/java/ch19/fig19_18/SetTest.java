// Fig. 19.18: SetTest.java
// Utilizando um HashSet para remover duplicatas.

package ch19.fig19_18;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest 
{
   private static final String colors[] = { "red", "white", "blue",
      "green", "gray", "orange", "tan", "white", "cyan",
      "peach", "gray", "orange" };
                  
   // cria e gera saída ArrayList
   public SetTest()
   {
      List< String > list = Arrays.asList( colors );
      System.out.printf( "ArrayList: %s\n", list );
      printNonDuplicates( list );
   } // fim do construtor SetTest

   // cria conjunto de array para eliminar duplicatas
   private void printNonDuplicates(Collection< String > collection)
   {
      // cria um HashSet
      Set< String > set = new HashSet< String >( collection );

      System.out.println( "\nNonduplicates are: " );

      for ( String s : set )
         System.out.printf( "%s ", s );

      System.out.println();
   } // fim do método printNonDuplicates

   public static void main( String args[] )
   {
      new SetTest();
   } // fim de main
} // fim da classe SetTest 


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