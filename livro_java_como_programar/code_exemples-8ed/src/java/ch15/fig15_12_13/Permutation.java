// Fig. 15.12: Permutation.java
// Método recursivo para localizar todas as permuta��es de uma String.

package ch15.fig15_12_13;

public class Permutation
{
   // declaração recursiva do método permuteString
   public void permuteString(
      String beginningString, String endingString )
   {
      // caso básico: se string a permutar tiver comprimento menor que ou igual a
      // 1, exibe apenas essa string concatenada com beginningString
      if ( endingString.length() <= 1 )
         System.out.println( beginningString + endingString );
      else // passo de recursão: permuta endingString
      {
         // para cada caractere em endingString
         for ( int i = 0; i < endingString.length(); i++ )
         {
            try
            {
               // cria nova string para permutar eliminando o
               // caractere no índice i
               String newString = endingString.substring( 0, i ) +
                  endingString.substring( i + 1 );                

               // chamada recursiva com uma nova string a ser permutada
               // e uma string inicial a ser concatenada, que
               // inclui o caractere no índice i
               permuteString( beginningString +         
                  endingString.charAt( i ), newString );
            } // fim do try
            catch ( StringIndexOutOfBoundsException exception )
            {
               exception.printStackTrace();
            } // fim do catch
         } // for final
      } // fim de else
   } // fim do método permuteString
} // fim da classe Permutation


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
