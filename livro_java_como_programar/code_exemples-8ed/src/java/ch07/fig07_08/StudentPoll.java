// Fig. 7.8: StudentPoll.java
// Programa de análise de enquete.

package ch07.fig07_08;

public class StudentPoll
{
   public static void main( String args[] )
   {
      // array de respostas da pesquisa
      int responses[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 
         10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 
         4, 8, 6, 8, 10 };
      int frequency[] = new int[ 11 ]; // array de contadores de frequência

      // para cada resposta, seleciona o elemento de respostas e utiliza esse valor
      // como índice de frequência para determinar o elemento a incrementar
      for ( int answer = 0; answer < responses.length; answer++ )
         ++frequency[ responses[ answer ] ];

      System.out.printf( "%s%10s", "Rating", "Frequency" );
   
      // gera saída do valor de cada elemento do array
      for ( int rating = 1; rating < frequency.length; rating++ )
         System.out.printf( "%d%10d", rating, frequency[ rating ] );
   } // fim de main
} // fim da classe StudentPoll


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
