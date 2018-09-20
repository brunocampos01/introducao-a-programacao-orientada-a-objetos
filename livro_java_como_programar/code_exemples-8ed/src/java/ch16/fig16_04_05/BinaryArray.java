// Fig. 16.4: BinaryArray.java
// Classe que contém um array de inteiros aleatórios e um método
// que utiliza a pesquisa binária para localizar um inteiro.

package ch16.fig16_04_05;

import java.util.Random;
import java.util.Arrays;

public class BinaryArray
{
   private int[] data; // array de valores
   private static Random generator = new Random();

   // cria um array de um dado tamanho e o preenche com inteiros aleatórios
   public BinaryArray( int size )
   {
      data = new int[ size ]; // cria espaço para o array

      // preenche o array com ints aleatórios no intervalo de 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );

      Arrays.sort( data );
   } // fim do construtor de BinaryArray

   // realiza uma pesquisa binária nos dados
   public int binarySearch( int searchElement )
   {
      int low = 0; // extremidade baixa da área de pesquisa
      int high = data.length - 1; // extremidade alta da área de pesquisa
      int middle = ( low + high + 1 ) / 2; // elemento do meio    
      int location = -1; // valor de retorno; -1 se não localizado

      do // faz um loop para procurar o elemento
      {
         // imprime os elementos remanescentes do array
         System.out.print( remainingElements( low, high ) );

         // gera espaços para alinhamento
         for ( int i = 0; i < middle; i++ )
            System.out.print( "   " );
         System.out.println( " * " ); // indica o meio atual

         // se o elemento for localizado no meio               
         if ( searchElement == data[ middle ] )                 
            location = middle; // a localização é o meio atual

         // elemento do meio é muito alto
         else if ( searchElement < data[ middle ] )        
            high = middle - 1; // elimina a metade mais alta
         else  // elemento do meio é muito baixo
            low = middle + 1; // elimina a metade mais baixa

         middle = ( low + high + 1 ) / 2; // recalcula o meio
      } while ( ( low <= high ) && ( location == -1 ) );           

      return location; // retorna a localização da chave de pesquisa
   } // fim do método binarySearch

   // método para gerar a saída de certos valores no array
   public String remainingElements( int low, int high )
   {
      StringBuffer temporary = new StringBuffer();

      // gera espaços para alinhamento
      for ( int i = 0; i < low; i++ )
         temporary.append( "   " );

      // gera a saída dos elementos que permanecem no array
      for ( int i = low; i <= high; i++ )
         temporary.append( data[ i ] + " " );

      temporary.append( "\n" );
      return temporary.toString();
   } // fim do método remainingElements

   // método para gerar saída de valores no array
   public String toString()
   {
      return remainingElements( 0, data.length - 1 );
   } // fim do método toString
} // fim do método BinaryArray


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