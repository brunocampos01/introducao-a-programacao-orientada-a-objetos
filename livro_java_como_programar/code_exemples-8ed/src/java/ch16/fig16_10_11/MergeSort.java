// Figura 16.10: MergeSort.java
// Classe que cria um array preenchido com inteiros aleatórios.
// Fornece um método para classificar o array com a classificação por intercalação.

package ch16.fig16_10_11;

import java.util.Random;

public class MergeSort
{
   private int[] data; // array de valores
   private static Random generator = new Random();

   // cria um array de um dado tamanho e o preenche com inteiros aleatórios
   public MergeSort( int size )
   {
      data = new int[ size ]; // cria espaço para o array

      // preenche o array com ints aleatórios no intervalo de 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // fim do construtor de MergeSort
   
   // chama o método de divisão recursiva p/ iniciar a classificação por intercalação
   public void sort()                                    
   {
      sortArray( 0, data.length - 1 ); // divide o array inteiro
   } // fim do método sort

   // divide o array, classifica subarrays e intercala subarrays no array classificado
   private void sortArray( int low, int high )                            
   {
      // caso básico de teste; tamanho do array é igual a 1
      if ( ( high - low ) >= 1 ) // se não for o caso básico
      {
         int middle1 = ( low + high ) / 2; // calcula o meio do array
         int middle2 = middle1 + 1; // calcula o próximo elemento

         // gera uma saída do passo de divisão
         System.out.println( "split:   " + subarray( low, high ) );
         System.out.println( "         " + subarray( low, middle1 ) );
         System.out.println( "         " + subarray( middle2, high ) );
         System.out.println();

         // divide o array pela metade; classifica cada metade (chamadas recursivas)
         sortArray( low, middle1 ); // primeira metade do array       
         sortArray( middle2, high ); // segunda metade do array       

         // intercala dois arrays classificados depois que as chamada de divisão retornam
         merge ( low, middle1, middle2, high );             
      } // fim do if
   } // fim do método de divisão
   
   // intercala dois subarrays classificados em um subarray classificado             
   private void merge( int left, int middle1, int middle2, int right )
   {
      int leftIndex = left; // índice no subarray esquerdo
      int rightIndex = middle2; // índice no subarray direito
      int combinedIndex = left; // índice no array temporário funcional
      int[] combined = new int[ data.length ]; // array de trabalho      
      
      // gera a saída de dois subarrays antes de mesclar
      System.out.println( "merge:   " + subarray( left, middle1 ) );
      System.out.println( "         " + subarray( middle2, right ) );

      // intercala os arrays até alcançar o final de um deles
      while ( leftIndex <= middle1 && rightIndex <= right )
      {
         // coloca o menor dos dois elementos atuais no resultado  
         // e o move para o próximo espaço nos arrays
         if ( data[ leftIndex ] <= data[ rightIndex ] )        
            combined[ combinedIndex++ ] = data[ leftIndex++ ];
         else                                                  
            combined[ combinedIndex++ ] = data[ rightIndex++ ];
      } // fim do while
   
      // se o array esquerdo estiver vazio                                
      if ( leftIndex == middle2 )                              
         // copia o restante do array direito                        
         while ( rightIndex <= right )                         
            combined[ combinedIndex++ ] = data[ rightIndex++ ];
      else // array direito está vazio
         // copia o restante do array direito                         
         while ( leftIndex <= middle1 )                        
            combined[ combinedIndex++ ] = data[ leftIndex++ ];

      // copia os valores de volta ao array original
      for ( int i = left; i <= right; i++ )  
         data[ i ] = combined[ i ];          

      // gera a saída do array intercalado
      System.out.println( "         " + subarray( left, right ) );
      System.out.println();
   } // fim do método merge

   // método para gerar a saída de certos valores do array
   public String subarray( int low, int high )
   {
      StringBuffer temporary = new StringBuffer();

      // gera espaços para alinhamento
      for ( int i = 0; i < low; i++ )
         temporary.append( "   " );

      // gera a saída dos elementos que permanecem no array
      for ( int i = low; i <= high; i++ )
         temporary.append( " " + data[ i ] );

      return temporary.toString();
   } // fim do método subarray

   // método para gerar a saída dos valores do array
   public String toString()
   {
      return subarray( 0, data.length - 1 );
   } // fim do método toString
} // fim da classe MergeSort


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
