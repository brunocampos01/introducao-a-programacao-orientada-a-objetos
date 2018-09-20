// Fig. 19.16: Stacktest.java
// Programa para testar java.util.Stack.

package ch19.fig19_16;

import java.util.Stack;              
import java.util.EmptyStackException;

public class StackTest 
{
   public StackTest()
   {
      Stack< Number > stack = new Stack< Number >();

      // cria números para armazenar na pilha
      Long longNumber = 12L;
      Integer intNumber = 34567;
      Float floatNumber = 1.0F;
      Double doubleNumber = 1234.5678;

      // utiliza método push
      stack.push( longNumber );// adiciona um long
      printStack( stack );
      stack.push( intNumber );// adiciona um int
      printStack( stack );
      stack.push( floatNumber );// adiciona um float
      printStack( stack );
      stack.push( doubleNumber );// adiciona um double
      printStack( stack );

      // remove itens de pilha
      try 
      {
         Number removedObject = null;

         // remove elementos da pilha
         while ( true ) 
         {
            removedObject = stack.pop(); // utiliza método pop
            System.out.printf( "%s popped\n", removedObject );
            printStack( stack );
         } // fim do while
      } // fim do try
      catch ( EmptyStackException emptyStackException ) 
      {
         emptyStackException.printStackTrace();
      } // fim do catch
   } // fim do construtor StackTest 
   
   private void printStack( Stack< Number > stack )
   {
      if (stack.isEmpty())
         System.out.print( "stack is empty\n\n" ); // a pilha está vazia
      else  // a pilha não está vazia
      {
         System.out.print( "stack contains: " );

         // itera pelos elementos
         for ( Number number : stack )
            System.out.printf( "%s ", number );

         System.out.print( "(top) \n\n" ); // indica o topo da pilha
      } // fim de else
   } // fim do método printStack
   
   public static void main( String args[] )
   {
      new StackTest();
   } // fim de main
} // fim da classe StackTest


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