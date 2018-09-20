// Fig. 19.5: UsingToArray.java
// Utilizando o método toArray.

package ch19.fig19_05;

import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray 
{
   // construtor cria LinkedList, adiciona elementos e converte em array
   public UsingToArray()
   {
      String colors[] = { "black", "blue", "yellow" };

      LinkedList< String > links =                           
         new LinkedList< String >( Arrays.asList( colors ) );

      links.addLast( "red" );   // adiciona como o último item
      links.add( "pink" );      // adiciona ao final
      links.add( 3, "green" );  // adiciona no terceiro índice
      links.addFirst( "cyan" ); // adiciona como primeiro item

      // obtém elementos LinkedList como um array
      colors = links.toArray( new String[ links.size() ] );

      System.out.println( "colors: " );

      for ( String color : colors )
         System.out.println( color );
   } // fim do construtor UsingToArray

   public static void main( String args[] )
   {
      new UsingToArray();
   } // fim de main
} // fim da classe UsingToArray 


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