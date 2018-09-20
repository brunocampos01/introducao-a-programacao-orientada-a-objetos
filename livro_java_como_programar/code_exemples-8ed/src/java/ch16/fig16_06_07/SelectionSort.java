// Fig. 16.6: SelectionSort.java
// Classe que cria um array preenchido com inteiros aleatórios.
// fornece um método para classificar o array com a classificação por seleção.

package ch16.fig16_06_07;

import java.util.Random;

public class SelectionSort
{
   private int[] data; // array de valores
   private static Random generator = new Random();

   // cria um array de um dado tamanho e o preenche com inteiros aleatórios
   public SelectionSort( int size )
   {
      data = new int[ size ]; // cria espaço para o array

      // preenche o array com ints aleatórios no intervalo de 10 a 99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // fim do construtor de SelectionSort

   // classifica o array utilizando a classificação por seleção
   public void sort()                
   {
      int smallest; // índice do menor elemento

      // faz um loop sobre data.length - 1 elementos      
      for ( int i = 0; i < data.length - 1; i++ )
      {
         smallest = i; // primeiro índice do array remanescente

         // faz um loop para localizar o índice do menor elemento
         for ( int index = i + 1; index < data.length; index++ )
            if ( data[ index ] < data[ smallest ] )             
               smallest = index;                                

         swap( i, smallest ); // permuta o menor elemento na posição
         printPass( i + 1, smallest ); // passagem de saída do algoritmo
      } // fim do for externo
   } // fim do método sort

   // método auxiliar para permutar valores em dois elementos
   public void swap( int first, int second )
   {
      int temporary = data[ first ]; // armazena o primeiro no temporário
      data[ first ] = data[ second ]; // substitui o primeiro pelo segundo
      data[ second ] = temporary; // coloca o temporário no segundo
   } // fim do método swap

   // imprime uma passagem do algoritmo
   public void printPass( int pass, int index )
   {
      System.out.print( String.format( "after pass %2d: ", pass ) );

      // saída de elementos até item selecionado
      for ( int i = 0; i < index; i++ )
         System.out.print( data[ i ] + "  " );

      System.out.print( data[ index ] + "* " ); // indica permuta

      // termina de gerar a saída do array
      for ( int i = index + 1; i < data.length; i++ )
         System.out.print( data[ i ] + "  " );

      System.out.print( "\n               " ); // para alinhamento

      // indica quantidade do array que é classificado
      for ( int j = 0; j < pass; j++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // adiciona fim de linha
   } // fim do método indicateSelection

   // método para gerar saída de valores no array
   public String toString()
   {
      StringBuffer temporary = new StringBuffer();

      // itera pelo array
      for ( int element : data )
         temporary.append( element + "  " );

      temporary.append( "\n" ); // adiciona um caractere de fim de linha
      return temporary.toString();
   } // fim do método toString
} // fim da classe SelectionSort


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