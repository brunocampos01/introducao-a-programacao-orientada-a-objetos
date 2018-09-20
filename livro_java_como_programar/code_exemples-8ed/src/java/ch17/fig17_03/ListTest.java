// Fig. 17.5: ListTest.java
// Classe ListTest para demonstrar capacidades de List.

package ch17.fig17_03;

import com.deitel.jhtp6.ch17.List;
import com.deitel.jhtp6.ch17.EmptyListException;

public class ListTest 
{
   public static void main( String args[] )
   {
      List list = new List(); // cria o contâiner de List

      // insere inteiros na lista
      list.insertAtFront( -1 );
      list.print();             
      list.insertAtFront( 0 );
      list.print();            
      list.insertAtBack( 1 );  
      list.print();            
      list.insertAtBack( 5 );  
      list.print();            

      // remove objetos da lista; imprime depois de cada remoção
      try 
      { 
         Object removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();
      } // fim do try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // fim do catch
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