// Fig. 16.2: LinearArray.java
// Classe que contém um array de inteiros aleatórios e um método
// que pesquisará esse array sequencialmente

package ch16.fig16_02_03;

import java.util.Random;

public class LinearArray
{
   private int[] data; // array de valores
   private static Random generator = new Random();

   // cria um array de um dado tamanho e o preenche com números aleatórios
   public LinearArray( int size )
   {
      data = new int[ size ]; // cria espaço para o array

      // preenche o array com ints aleatórios no intervalo de 10-99
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   } // fim do construtor de LinearArray

   // realiza uma pesquisa linear nos dados  
   public int linearSearch( int searchKey )
   {
      // faz um loop pelo array sequencialmente
      for ( int index = 0; index < data.length; index++ )
         if ( data[ index ] == searchKey )               
            return index; // retorna o �ndice de inteiros     

      return -1; // inteiro não foi localizado
   } // fim do método linearSearch

   // método para gerar saída de valores no array
   public String toString()
   {
      StringBuffer temporary = new StringBuffer();

      // itera pelo array
      for ( int element : data )
         temporary.append( element + " " );

      temporary.append( "\n" ); // adiciona um caractere de fim de linha
      return temporary.toString();
   } // fim do método toString
} // fim da classe LinearArray


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