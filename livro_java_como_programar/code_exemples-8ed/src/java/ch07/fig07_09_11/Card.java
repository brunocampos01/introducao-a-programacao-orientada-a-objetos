// Fig. 7.9: Card.java
// Classe Card representa uma carta de baralho.

package ch07.fig07_09_11;

public class Card 
{
   private String face; // face da carta ("Ace", "Deuce", ...)
   private String suit; // naipe da carta ("Hearts", "Diamonds", ...)

   // construtor de dois argumentos inicializa face e naipe da carta
   public Card( String cardFace, String cardSuit )
   {
      face = cardFace; // inicializa face da carta
      suit = cardSuit; // inicializa naipe da carta
   } // fim do construtor Card de dois argumentos

   // retorna representação String de Card
   public String toString()               
   {                                      
      return face + " of " + suit;        
   } // fim do método toString
} // fim da classe Card


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