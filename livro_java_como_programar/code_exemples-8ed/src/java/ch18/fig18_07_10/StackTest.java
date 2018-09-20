// Fig. 18.10: Stacktest.java
// Programa de teste da classe genérica Stack.

package ch18.fig18_07_10;

public class StackTest 
{
   private double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
   private int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

   private Stack< Double > doubleStack; // a pilha armazena objetos Double
   private Stack< Integer > integerStack; // a pilha armazena objetos Integer

   // testa objetos Stack
   public void testStacks()
   {
      doubleStack = new Stack< Double >( 5 ); // Stack de Doubles
      integerStack = new Stack< Integer >( 10 ); // Stack de Integers

      testPushDouble(); // insere doubles em doubleStack
      testPopDouble(); // remove de doubleStack
      testPushInteger(); // insere ints em intStack
      testPopInteger(); // remove de intStack
   } // fim do método testStacks

   // testa o método push com a pilha de doubles
   public void testPushDouble()
   {
      // insere elementos na pilha
      try
      {
         System.out.println( "\nPushing elements onto doubleStack" );

         // insere elementos na Stack
         for ( double element : doubleElements )
         {
            System.out.printf( "%.1f ", element );
            doubleStack.push( element ); // insere em doubleStack
         } // fim do for
      } // fim do try
      catch ( FullStackException fullStackException )
      {
         System.err.println();
         fullStackException.printStackTrace();
      } // fim da captura de FullStackException
   } // fim do método testPushDouble

   // testa o método pop com a pilha de doubles
   public void testPopDouble()
   {
      // Retira elementos da pilha
      try
      {
         System.out.println( "\nPopping elements from doubleStack" );
         double popValue; // armazena o elemento removido da pilha

         // remove todos os elementos da Stack
         while ( true )
         {
            popValue = doubleStack.pop(); // remove de doubleStack
            System.out.printf( "%.1f ", popValue ); 
         } // fim do while
      } // fim do try
      catch( EmptyStackException emptyStackException )
      {
         System.err.println();
         emptyStackException.printStackTrace();
      } // fim da captura de EmptyStackException
   } // fim do método testPopDouble

   // testa o método push com a pilha de integers
   public void testPushInteger()
   {
      // insere elementos na pilha
      try
      {
         System.out.println( "\nPushing elements onto integerStack" );

         // insere elementos na Stack
         for ( int element : integerElements )
         {
            System.out.printf( "%d ", element );
            integerStack.push( element ); // insere em integerStack
         } // fim do for
      } // fim do try
      catch ( FullStackException fullStackException )
      {
         System.err.println();
         fullStackException.printStackTrace();
      } // fim da captura de FullStackException
   } // fim do método testPushInteger

   // testa o método pop com a pilha de integers
   public void testPopInteger()
   {
      // remove elementos da pilha
      try
      {
         System.out.println( "\nPopping elements from integerStack" );
         int popValue; // armazena o elemento removido da pilha

         // remove todos os elementos da Stack
         while ( true )
         {
            popValue = integerStack.pop(); // remove de integerStack
            System.out.printf( "%d ", popValue );
         } // fim do while
      } // fim do try
      catch( EmptyStackException emptyStackException )
      {
         System.err.println();
         emptyStackException.printStackTrace();
      } // fim da captura de EmptyStackException
   } // fim do método testPopInteger

   public static void main( String args[] ) 
   {
      StackTest application = new StackTest();
      application.testStacks();
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
