// Fig. 6.9: Craps.java
// A classe Craps simula o jogo de dados craps.

package ch06.fig06_09_10;

import java.util.Random;

public class Craps 
{
   // cria um gerador de números aleatórios para uso no método rollDice
   private Random randomNumbers = new Random(); 

   // enumeração com constantes que representam o status do jogo
   private enum Status { CONTINUE, WON, LOST };                

   // constantes que representam lançamentos comuns dos dados
   private final static int SNAKE_EYES = 2;
   private final static int TREY = 3;      
   private final static int SEVEN = 7;     
   private final static int YO_LEVEN = 11;
   private final static int BOX_CARS = 12;

   // joga uma partida de craps
   public void play()
   {
      int myPoint = 0; // pontos se não ganhar ou perder na 1a. rolagem
      Status gameStatus; // pode conter CONTINUE, WON ou LOST

      int sumOfDice = rollDice(); // primeira rolagem dos dados

      // determina o status do jogo e a pontuação com base no primeiro lan�amento
      switch ( sumOfDice ) 
      {
         case SEVEN: // ganha com 7 no primeiro lançamento
         case YO_LEVEN: // ganha com 11 no primeiro lançamento
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // perde com 2 no primeiro lançamento
         case TREY: // perde com 3 no primeiro lançamento
         case BOX_CARS: // perde com 12 no primeiro lançamento
            gameStatus = Status.LOST;
            break;
         default: // não ganhou nem perdeu, portanto registra a pontuação
            gameStatus = Status.CONTINUE; // jogo não terminou
            myPoint = sumOfDice; // informa a pontuação
            System.out.printf( "Point is %d\n", myPoint );
            break; // opcional no final do switch
      } // switch final

      // enquanto o jogo não estiver completo
      while (gameStatus == Status.CONTINUE) // nem WON nem LOST
      { 
         sumOfDice = rollDice(); // lança os dados novamente

         // determina o status do jogo
         if ( sumOfDice == myPoint ) // vitória por pontuação
            gameStatus = Status.WON;
         else
            if ( sumOfDice == SEVEN ) // perde obtendo 7 antes de atingir a pontuação
               gameStatus = Status.LOST;
      } // fim do while

      // exibe uma mensagem ganhou ou perdeu
      if (gameStatus == Status.WON)
         System.out.println( "Player wins" );
      else
         System.out.println( "Player loses" );
   } // fim do método play

   // lança os dados, calcula a soma e exibe os resultados
   public int rollDice()
   {
      // seleciona valores aleatórios do dado
      int die1 = 1 + randomNumbers.nextInt( 6 ); // primeiro lançamento do dado
      int die2 = 1 + randomNumbers.nextInt( 6 ); // segundo lançamento do dado

      int sum = die1 + die2; // soma dos valores dos dados

      // exibe os resultados desse lançamento
      System.out.printf( "Player rolled %d + %d = %d\n", 
         die1, die2, sum );

      return sum; // retorna a soma dos dados
   } // fim do método rollDice
} // fim da classe Craps


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