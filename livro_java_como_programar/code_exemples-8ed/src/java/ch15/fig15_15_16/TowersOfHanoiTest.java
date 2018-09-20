// Fig. 15.16: TowersOfHanoiTest.java
// Testa a solução do problema Torres de Hanói.

package ch15.fig15_15_16;

public class TowersOfHanoiTest
{
   public static void main( String args[] )
   {
      int startPeg = 1;   // valor 1 utilizado para indicar startPeg na saída
      int endPeg = 3;     // valor 3 utilizado para indicar endPeg na saída
      int tempPeg = 2;    // valor 2 utilizado para indicar tempPeg na saída
      int totalDisks = 3; // número de discos
      TowersOfHanoi towersOfHanoi = new TowersOfHanoi( totalDisks );

      // chamada não recursiva inicial: move todos os discos.
      towersOfHanoi.solveTowers( totalDisks, startPeg, endPeg, tempPeg );
   } // fim de main
} // fim da classe TowersOfHanoiTest


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