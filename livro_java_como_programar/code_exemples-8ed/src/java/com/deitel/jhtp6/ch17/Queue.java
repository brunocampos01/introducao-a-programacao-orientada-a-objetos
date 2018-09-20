// Fig. 17.13: Queue.java
// Classe Queue.
package com.deitel.jhtp6.ch17;

public class Queue 
{
   private List queueList;

   // construtor sem argumento
   public Queue() 
   { 
      queueList = new List( "queue" );
   } // fim do construtor sem argumento Queue

   // adiciona o objeto à fila
   public void enqueue( Object object )
   { 
      queueList.insertAtBack( object );
   } // fim do método enqueue

   // remove o objeto da fila
   public Object dequeue() throws EmptyListException
   { 
      return queueList.removeFromFront();
   } // fim do método dequeue

   // determina se a fila está vazia
   public boolean isEmpty()
   {
      return queueList.isEmpty();
   } // fim do método isEmpty

   // gera o conteúdo da fila
   public void print()
   {
      queueList.print();
   } // fim do método print
} // fim da classe Queue


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