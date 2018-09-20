// Fig. 19.17: PriorityQueueTest.java
// Programa de teste da classe de biblioteca padrão PriorityQueue.

package ch19.fig19_17;

import java.util.PriorityQueue;

public class PriorityQueueTest 
{
   public static void main( String args[] ) 
   {
      // fila de capacidade 11                                       
      PriorityQueue< Double > queue = new PriorityQueue< Double >();

      // insere elementos na fila
      queue.offer( 3.2 );        
      queue.offer( 9.8 );        
      queue.offer( 5.4 );        

      System.out.print( "Polling from queue: " );

      // exibe elementos na fila
      while (queue.size()> 0 )
      {
         System.out.printf( "%.1f ", queue.peek()); // visualiza elemento superior 
         queue.poll();// remove elemento superior
      } // fim do while
   } // fim de main
} // fim da classe PriorityQueueTest 


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