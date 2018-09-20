// Fig. 18.12: RawTypeTest.java
// Programa de teste de tipos brutos.

package ch18.fig18_12;

public class RawTypeTest 
{
   private Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
   private Integer[] integerElements = 
      { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

   // método para testar classes Stack com tipos brutos
   public void testStacks()
   {
      // Pilha de tipos brutos atribuídos à classe Stack da variável de tipos brutos
      Stack rawTypeStack1 = new Stack( 5 );                        

      // Stack< Double > atribuído a Stack da variável de tipos brutos
      Stack rawTypeStack2 = new Stack< Double >( 5 );           

      // Pilha de tipos crus atribuídos à variável Stack< Integer >
      Stack< Integer > integerStack = new Stack( 10 );           

      testPush( "rawTypeStack1", rawTypeStack1, doubleElements );
      testPop( "rawTypeStack1", rawTypeStack1 );
      testPush( "rawTypeStack2", rawTypeStack2, doubleElements );
      testPop( "rawTypeStack2", rawTypeStack2 );
      testPush( "integerStack", integerStack, integerElements );
      testPop( "integerStack", integerStack );
   } // fim do método testStacks

   // método genérico insere elementos na pilha
   public < T > void testPush( String name, Stack< T > stack,
      T[] elements )
   {
      // insere elementos na pilha
      try
      {
         System.out.printf( "\nPushing elements onto %s\n", name );

         // insere elementos na Stack
         for ( T element : elements )         
         {
            System.out.printf( "%s ", element );
            stack.push( element ); // insere o elemento na pilha
         } // fim do for
      } // fim do try
      catch ( FullStackException fullStackException )
      {
         System.out.println();
         fullStackException.printStackTrace();
      } // fim da captura de FullStackException
   } // fim do método testPush

   // método genérico testPop remove elementos da pilha
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
      RawTypeTest application = new RawTypeTest();
      application.testStacks();
   } // fim de main
} // fim da classe RawTypeTest


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