// Fig. 17.14: QueueTest.java
// Classe QueueTest.

package ch17.fig17_13;

import com.deitel.jhtp6.ch17.Queue;
import com.deitel.jhtp6.ch17.EmptyListException;

public class QueueTest 
{
   public static void main( String args[] )
   {
      Queue queue = new Queue();

      // utiliza o método enqueue
      queue.enqueue( -1 );
      queue.print();       
      queue.enqueue( 0 );  
      queue.print();       
      queue.enqueue( 1 );  
      queue.print();       
      queue.enqueue( 5 );  
      queue.print();       

      // remove os objetos da fila
      try 
      {
         Object removedObject = null;

         while ( true ) 
         {
            removedObject = queue.dequeue(); // utiliza método dequeue
            System.out.printf( "%s dequeued\n", removedObject );
            queue.print();
         } // fim do while
      } // fim do try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // fim do catch
   } // fim de main
} // fim da classe QueueTest


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