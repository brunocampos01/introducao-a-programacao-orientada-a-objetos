// Fig. 6.7: RandomIntegers.java
// Inteiros aleatórios deslocados e escalonados.

package ch06.fig06_07;

import java.util.Random; // o programa utiliza a classe Random

public class RandomIntegers 
{
   public static void main( String args[] )
   {      
      Random randomNumbers = new Random(); // gerador de número aleatório
      int face; // armazena cada inteiro aleatório gerado

      // faz o loop 20 vezes
      for ( int counter = 1; counter <= 20; counter++ ) 
      {
         // seleciona o inteiro aleatório entre 1 a 6
         face = 1 + randomNumbers.nextInt( 6 );

         System.out.printf( "%d  ", face ); // exibe o valor gerado
         
         // se o contador for divisível por 5, inicia uma nova linha de saída
         if ( counter % 5 == 0 )
            System.out.println();
      } // for final
   } // fim de main
} // fim da classe RandomIntegers


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