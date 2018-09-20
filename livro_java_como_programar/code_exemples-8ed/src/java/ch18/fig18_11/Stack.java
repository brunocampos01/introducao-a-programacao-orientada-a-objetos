// Fig. 18.7: Stack.java
// Classe genérica Stack.

package ch18.fig18_11;

public class Stack< E >
{
   private final int size; // número de elementos na pilha
   private int top; // localização do elemento superior
   private E[] elements; // array que armazena elementos na pilha

   // construtor sem argumento cria uma pilha do tamanho padrão
   public Stack()
   {
      this( 10 ); // tamanho padrão da pilha
   } // fim do construtor sem argumentos da classe Stack

   // construtor cria uma pilha com o número especificado de elementos
   public Stack( int s )
   {
      size = s > 0 ? s : 10; // configura o tamanho da Stack
      top = -1; // Stack inicialmente vazia

      elements = ( E[] ) new Object[ size ]; // cria o array
   } // fim do construtor de Stack

   // insere o elemento na pilha; se bem-sucedido retorna true;
   // caso contrário, lança uma FullStackException
   public void push( E pushValue )
   {
      if ( top == size - 1 ) // se a pilha estiver cheia
         throw new FullStackException( String.format( 
            "Stack is full, cannot push %s", pushValue ) );

      elements[ ++top ] = pushValue; // insere pushValue na Stack
   } // fim do método push

   // retorna o elemento superior se não estiver vazia; do contrário lança uma EmptyStackException
   public E pop()
   {
      if ( top == -1 ) // se pilha estiver vazia
         throw new EmptyStackException( "Stack is empty, cannot pop" );

      return elements[ top-- ]; // remove e retorna o elemento superior da Stack
   } // fim do método pop
} // fim da classe Stack <E>


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