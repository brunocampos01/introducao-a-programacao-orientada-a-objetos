// Fig. 18.9: EmptyStackException.java
// Indica que uma pilha está cheia.

package ch18.fig18_07_10;

public class EmptyStackException extends RuntimeException
{
   // construtor sem argumento
   public EmptyStackException()
   {
      this( "Stack is empty" );
   } // fim do construtor sem argumentos de EmptyStackException

   // construtor de um argumento
   public EmptyStackException( String exception )
   {
      super( exception );
   } // fim do construtor de um argumento de EmptyStackException
} // fim da classe EmptyStackException


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