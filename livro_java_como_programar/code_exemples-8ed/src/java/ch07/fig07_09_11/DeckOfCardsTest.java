// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

package ch07.fig07_09_11;

public class DeckOfCardsTest
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória
      
      // imprime todas as 52 cartas na ordem em que elas são distribuídas
      for ( int i = 0; i < 13; i++ )
      {
         // distribui e imprime 4 Cards
         System.out.printf( "%-20s%-20s%-20s%-20s\n",
            myDeckOfCards.dealCard(), myDeckOfCards.dealCard(), 
            myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
      } // for final
   } // fim de main
} // fim da classe DeckOfCardsTest


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