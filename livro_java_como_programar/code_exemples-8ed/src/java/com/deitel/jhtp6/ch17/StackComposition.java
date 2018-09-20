// Fig. 17.12: StackComposition.java
// Definição da classe StackComposition com o objeto List composto.
package com.deitel.jhtp6.ch17;

public class StackComposition 
{
   private List stackList;

   // construtor sem argumento
   public StackComposition()
   { 
      stackList = new List( "stack" );
   } // fim construtor sem argumento StackComposition

   // adiciona objeto à pilha
   public void push( Object object )
   { 
      stackList.insertAtFront( object );
   } // fim do método push

   // remove objeto da pilha
   public Object pop() throws EmptyListException
   { 
      return stackList.removeFromFront();
   } // fim do método pop

   // determina se a pilha está vazia
   public boolean isEmpty()
   { 
      return stackList.isEmpty();
   } // fim do método isEmpty

   // gera saída do conteúdo de pilha
   public void print()
   { 
      stackList.print();
   } // fim do método print
} // fim da classe StackComposition


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