// Fig. 19.3: CollectionTest.java
// Utilizando a interface Collection.

package ch19.fig19_03;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest 
{
   private static final String[] colors = 
      { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
   private static final String[] removeColors = 
      { "RED", "WHITE", "BLUE" };

   // cria ArrayList, adiciona Colors a ela e a manipula
   public CollectionTest()
   {
      List< String > list = new ArrayList< String >();      
      List< String > removeList = new ArrayList< String >();

      // adiciona elementos no array colors a listar
      for ( String color : colors )
         list.add( color );

      // adiciona elementos de removeColors a removeList
      for ( String color : removeColors )
         removeList.add( color );

      System.out.println( "ArrayList: " );

      // gera saída do conteúdo da lista
      for ( int count = 0; count < list.size(); count++ )
         System.out.printf( "%s ", list.get( count ));

      // remove cores contidas em removeList
      removeColors( list, removeList );

      System.out.println( "\n\nArrayList after calling removeColors: " );

      // gera saída do conteúdo da lista
      for ( String color : list )
         System.out.printf( "%s ", color );
   } // fim do construtor CollectionTest

   // remove cores especificadas em collection2 a partir de collection1
   private void removeColors( 
      Collection< String > collection1, Collection< String > collection2)
   {
      // obtém o iterador
      Iterator< String > iterator = collection1.iterator(); 

      // loop enquanto a coleção tiver itens
      while (iterator.hasNext())         

         if (collection2.contains( iterator.next() ))
            iterator.remove();// remove Color atual
   } // fim do método removeColors

   public static void main( String args[] )
   {
      new CollectionTest();
   } // fim de main
} // fim da classe CollectionTest 


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