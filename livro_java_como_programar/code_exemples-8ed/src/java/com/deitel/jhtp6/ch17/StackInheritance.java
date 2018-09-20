// Fig. 17.10: StackInheritance.java
// Derivado da classe List.
package com.deitel.jhtp6.ch17;

public class StackInheritance extends List
{
   // construtor sem argumento
   public StackInheritance() 
   { 
      super( "stack" ); 
   } // fim do construtor sem argumento StackInheritance

   // adiciona objeto à pilha
   public void push( Object object )
   { 
      insertAtFront( object );
   } // fim do método push

   // remove objeto da pilha
   public Object pop() throws EmptyListException
   { 
      return removeFromFront();
   } // fim do método pop
} // fim da classe StackInheritance


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