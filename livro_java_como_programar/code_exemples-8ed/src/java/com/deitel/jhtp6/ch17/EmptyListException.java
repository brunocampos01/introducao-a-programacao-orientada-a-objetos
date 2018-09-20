// Fig. 17.4: EmptyListException.java
// Definição da classe EmptyListException.
package com.deitel.jhtp6.ch17;

public class EmptyListException extends RuntimeException 
{
   // construtor sem argumento
   public EmptyListException()
   {
      this( "List" ); // chama outro construtor de EmptyListException
   } // fim do construtor sem argumento EmptyListException

   // construtor de um argumento
   public EmptyListException( String name )
   {
      super( name + " is empty" ); // chama construtor de superclasse
   } // fim do construtor de um argumento EmptyListException
} // fim da classe EmptyListException


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