// Fig. 18.11: StackTest2.java
// Programa de teste da classe genérica Stack.

package ch18.fig18_11;

public class StackTest2 
{
   private Double [] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
   private Integer [] integerElements = 
      { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

   private Stack< Double > doubleStack; // a pilha armazena objetos Double
   private Stack< Integer > integerStack; // a pilha armazena objetos Integer

   // testa objetos Stack
   public void testStacks()
   {
      doubleStack = new Stack< Double >( 5 ); // Stack de Doubles
      integerStack = new Stack< Integer >( 10 ); // Stack de Integers

      testPush( "doubleStack", doubleStack, doubleElements );   
      testPop( "doubleStack", doubleStack );                    
      testPush( "integerStack", integerStack, integerElements );
      testPop( "integerStack", integerStack );                  
   } // fim do método testStacks

   // método genérico testPush insere elementos em uma Stack
   public < T > void testPush( String name, Stack< T > stack,
      T[] elements )                                          
   {
      // insere elementos na pilha
      try
      {
         System.out.printf( "\nPushing elements onto %s\n", name );

         // insere elementos na Stack
         for (T element : elements)
         {
            System.out.printf( "%s ", element );
            stack.push( element ); // insere o elemento na pilha
         }
      } // fim do try
      catch ( FullStackException fullStackException )
      {
         System.out.println();
         fullStackException.printStackTrace();
      } // fim da captura de FullStackException
   } // fim do método testPush

   // método genérico testPop remove elementos de uma Stack
   public < T > void testPop( String name, Stack< T > stack )
   {
      // remove elementos da pilha
      try
      {
         System.out.printf( "\nPopping elements from %s\n", name );
         T popValue; // armazena o elemento removido da pilha

         // remove elementos da Stack
         while ( true )
         {
            popValue = stack.pop(); // remove da pilha
            System.out.printf( "%s ", popValue );
         } // fim do while
      } // fim do try
      catch( EmptyStackException emptyStackException )
      {
         System.out.println();
         emptyStackException.printStackTrace();
      } // fim da captura de EmptyStackException
   } // fim do método testPop

   public static void main( String args[] ) 
   {
      StackTest2 application = new StackTest2();
      application.testStacks(); 
   } // fim de main
} // fim da classe StackTest2


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