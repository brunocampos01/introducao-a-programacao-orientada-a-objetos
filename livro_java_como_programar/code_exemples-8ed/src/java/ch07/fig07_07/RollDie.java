// Fig. 7.7: Rolldie.java
// Rola um dado de seis lados 6000 vezes.

package ch07.fig07_07;

import java.util.Random;

public class RollDie
{
   public static void main( String args[] )
   {
      Random randomNumbers = new Random(); // gerador de número aleatório
      int frequency[] = new int[ 7 ]; // array de contadores de freqüência

      // lança o dados 6000 vezes; utiliza o valor do dado como índice de freqüência
      for ( int roll = 1; roll <= 6000; roll++ ) 
         ++frequency[ 1 + randomNumbers.nextInt( 6 ) ];

      System.out.printf( "%s%10s\n", "Face", "Frequency" );
   
      // gera saída do valor de cada elemento do array
      for ( int face = 1; face < frequency.length; face++ )
         System.out.printf( "%4d%10d\n", face, frequency[ face ] );
   } // fim de main
} // fim da classe RollDie


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