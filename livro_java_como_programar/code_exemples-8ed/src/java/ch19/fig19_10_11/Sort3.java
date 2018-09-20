// Fig. 19.11: Sort3.java
// Classifica uma lista utilizando a classe Comparator TimeComparator personalizada.

package ch19.fig19_10_11;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 
{
   public void printElements()
   {
      List< Time2 > list = new ArrayList< Time2 >(); // cria List

      list.add( new Time2(  6, 24, 34 ) );
      list.add( new Time2( 18, 14, 58 ) );
      list.add( new Time2(  6, 05, 34 ) );
      list.add( new Time2( 12, 14, 58 ) );
      list.add( new Time2(  6, 24, 22 ) );
      
      // gera saída de elementos List
      System.out.printf( "Unsorted array elements:\n%s\n", list );

      // classifica em ordem utilizando um comparador            
      Collections.sort( list, new TimeComparator() );

      // gera saída de elementos List
      System.out.printf( "Sorted list elements:\n%s\n", list );
   } // fim do método printElements
 
   public static void main( String args[] )
   {
      Sort3 sort3 = new Sort3();
      sort3.printElements();
   } // fim de main
} // fim da classe Sort3 


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