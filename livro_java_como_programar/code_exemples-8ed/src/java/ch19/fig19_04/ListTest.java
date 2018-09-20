// Fig. 19.4: ListTest.java
// Utilizando LinkLists.

package ch19.fig19_04;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest 
{
   private static final String colors[] = { "black", "yellow", 
      "green", "blue", "violet", "silver" };
   private static final String colors2[] = { "gold", "white", 
      "brown", "blue", "gray", "silver" };
                  
   // configura e manipula objetos LinkedList
   public ListTest()
   {
      List< String > list1 = new LinkedList< String >(); 
      List< String > list2 = new LinkedList< String >();

      // adiciona elementos a list1
      for ( String color : colors )
         list1.add( color );

      // adiciona elementos a list2
      for ( String color : colors2 )
         list2.add( color );

      list1.addAll( list2 ); // concatena as listas
      list2 = null; // libera recursos
      printList( list1 ); // imprime elementos list1 

      convertToUppercaseStrings( list1 ); // converte a string em letras maiúsculas
      printList( list1 ); // imprime elementos list1 

      System.out.print( "\nDeleting elements 4 to 6..." );
      removeItems( list1, 4, 7 ); // remove itens 4-7 da lista
      printList( list1 ); // imprime elementos list1 
      printReversedList( list1 ); // imprime lista na ordem inversa
   } // fim do construtor ListTest

   // gera saída do conteúdo de List
   public void printList(List< String > list)
   {
      System.out.println( "\nlist: " );
   
      for ( String color : list )
         System.out.printf( "%s ", color );

      System.out.println();
   } // fim do método printList

   // localiza objetos String e converte em letras maiúsculas
   private void convertToUppercaseStrings(List< String > list)
   {
      ListIterator< String > iterator = list.listIterator();

      while (iterator.hasNext()) 
      {
         String color = iterator.next();  // obtém o item
         iterator.set( color.toUpperCase() ); // converte em letras maiúsculas
      } // fim do while
   } // fim do método convertToUppercaseStrings

   // obtém sublista e utiliza método clear para excluir itens da sublista
   private void removeItems(List< String > list, int start, int end )
   {
      list.subList( start, end ).clear();  // remove os itens
   } // fim do método removeItems

   // imprime lista invertida
   private void printReversedList(List< String > list)
   {
      ListIterator< String > iterator = list.listIterator( list.size() );

      System.out.println( "\nReversed List:" );

      // imprime lista na ordem inversa
      while (iterator.hasPrevious()) 
         System.out.printf( "%s ", iterator.previous()); 
   } // fim do método printReversedList
   
   public static void main( String args[] )
   {
      new ListTest();
   } // fim de main                                          
} // fim da classe ListTest


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