// Fig. 16.8: InsertionSort.java
// Classe que cria um array preenchido com inteiros aleatórios.
// fornece um método para classificar o array com a classificação por inserção.

package ch16.fig16_08_09;

import java.util.Random;

public class InsertionSort
{
   private int[] data; // array de valores
   private static Random generator = new Random();

   // cria um array de um dado tamanho e o preenche com inteiros aleatórios
   public InsertionSort( int size )
   {
      data = new int[ size ]; // cria espaço para o array

      // preenche o array com ints aleatórios no intervalo de 10 a 99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // fim do construtor de InsertionSort

   // classifica o array utilizando a classificação por inserção
   public void sort()                
   {
      int insert; // variável temporária para armazenar o elemento a inserir

      // faz um loop sobre data.length - 1 elementos      
      for ( int next = 1; next < data.length; next++ )
      {
         // armazena o valor no elemento atual
         insert = data[ next ];           

         // inicializa a localização para colocar elemento
         int moveItem = next;                   

         // procura o local para colocar o elemento atual             
         while ( moveItem > 0 && data[ moveItem - 1 ] > insert )
         {
            // desloca o elemento direito um slot         
            data[ moveItem ] = data[ moveItem - 1 ];
            moveItem--;                             
         } // fim do while

         data[ moveItem ] = insert; // coloca o elemento inserido    
         printPass( next, moveItem ); // passagem de saída do algoritmo
      } // for final
   } // fim do método sort

   // imprime uma passagem do algoritmo
   public void printPass( int pass, int index )
   {
      System.out.print( String.format( "after pass %2d: ", pass ) );

      // gera saída dos elementos até o item permutado
      for ( int i = 0; i < index; i++ )
         System.out.print( data[ i ] + "  " );

      System.out.print( data[ index ] + "* " ); // indica permuta

      // termina de gerar a saída do array
      for ( int i = index + 1; i < data.length; i++ )
         System.out.print( data[ i ] + "  " );

      System.out.print( "\n               " ); // para alinhamento

      // indica quantidade do array que é classificado
      for( int i = 0; i <= pass; i++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); // adiciona fim de linha
   } // fim do método printPass

   // método para gerar a saída dos valores do array
   public String toString()
   {
      StringBuffer temporary = new StringBuffer();

      // itera pelo array
      for ( int element : data )
         temporary.append( element + "  " );

      temporary.append( "\n" ); // adiciona um caractere de fim de linha
      return temporary.toString();
   } // fim do método toString
} // fim da classe InsertionSort


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