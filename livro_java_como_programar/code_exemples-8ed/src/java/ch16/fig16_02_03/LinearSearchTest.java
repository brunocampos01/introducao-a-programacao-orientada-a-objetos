// Fig. 16.3: LinearSearchTest.java
// Pesquisa sequencialmente um item em um array.

package ch16.fig16_02_03;

import java.util.Scanner;

public class LinearSearchTest
{
   public static void main( String args[] )
   {
      // cria o objeto Scanner para inserir dados
      Scanner input = new Scanner( System.in );

      int searchInt; // chave de pesquisa
      int position; // localização da chave de pesquisa no array

      // cria um array e gera saída
      LinearArray searchArray = new LinearArray( 10 );
      System.out.println( searchArray ); // imprime o array

      // obtém a entrada de usuário
      System.out.print( 
         "Please enter an integer value (-1 to quit): " );
      searchInt = input.nextInt(); // lê o primeiro int de usuário

      // insere repetidamente um inteiro; -1 termina o programa
      while ( searchInt != -1 )
      {
         // realiza a pesquisa linear
         position = searchArray.linearSearch( searchInt );

         if ( position == -1 ) // inteiro não foi localizado
            System.out.println( "The integer " + searchInt + 
               " was not found.\n" );
         else // inteiro foi localizado
            System.out.println( "The integer " + searchInt + 
               " was found in position " + position + ".\n" );

         // obtém a entrada de usuário
         System.out.print( 
            "Please enter an integer value (-1 to quit): " );
         searchInt = input.nextInt(); // lê o próximo int de usuário
      } // fim do while
   } // fim de main
} // fim da classe LinearSearchTest


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