// Fig. 19.12: DeckOfCards.java
// Utilizando o algoritmo shuffle.

package ch19.fig19_12;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// classe para representar uma Card de um baralho
class Card 
{    
   public static enum Face { Ace, Deuce, Three, Four, Five, Six,
      Seven, Eight, Nine, Ten, Jack, Queen, King  };            
   public static enum Suit { Clubs, Diamonds, Hearts, Spades }; 

   private final Face face; // face da carta
   private final Suit suit; // naipe da carta
   
   // construtor de dois argumentos
   public Card( Face cardFace, Suit cardSuit ) 
   {   
       face = cardFace; // inicializa face da carta
       suit = cardSuit; // inicializa naipe da carta
   } // fim do construtor Card de dois argumentos
   
   // retorna face da carta
   public Face getFace() 
   { 
      return face; 
   } // fim do método getFace

   // retorna naipe de Card
   public Suit getSuit() 
   { 
      return suit; 
   } // fim do método getSuit

   // retorna representação String de Card
   public String toString()
   {
      return String.format( "%s of %s", face, suit );
   } // fim do método toString
} // fim da classe Card

// declaração da classe DeckOfCards
public class DeckOfCards 
{
   private List< Card > list; // declara List que armazenará Cards

   // configura baralho de Cards e embaralha
   public DeckOfCards()
   {
      Card[] deck = new Card[ 52 ];
      int count = 0; // número de cartas

      // preenche baralho com objetos Card
      for (Card.Suit suit: Card.Suit.values() )  
      {
         for (Card.Face face: Card.Face.values() )   
         {
            deck[ count ] = new Card( face, suit );
            count++;
         } // fim do for
      } // fim do for

      list = Arrays.asList( deck ); // obtém List
      Collections.shuffle( list );  // embaralha as cartas
   } // fim do construtor DeckOfCards

   // gera saída de baralho
   public void printCards()
   {
      // exibe 52 cartas em duas colunas
      for ( int i = 0; i < list.size(); i++ )
         System.out.printf( "%-20s%s", list.get( i ),
            ( ( i + 1 ) % 2 == 0 ) ? "\n" : "\t" );
   } // fim do método printCards

   public static void main( String args[] )
   {
      DeckOfCards cards = new DeckOfCards();
      cards.printCards();
   } // fim de main
} // fim da classe DeckOfCards


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