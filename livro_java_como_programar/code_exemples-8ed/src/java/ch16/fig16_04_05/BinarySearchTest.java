// Fig. 16.5: BinarySearchTest.java
// Utiliza a pesquisa binária para localizar um item em um array.

package ch16.fig16_04_05;

import java.util.Scanner;

public class BinarySearchTest
{
   public static void main( String args[] )
   {
      // cria o objeto Scanner para inserir dados
      Scanner input = new Scanner( System.in );

      int searchInt; // chave de pesquisa
      int position; // localização da chave de pesquisa no array
   
      // cria um array e gera saída
      BinaryArray searchArray = new BinaryArray( 15 );
      System.out.println( searchArray );

      // obtém a entrada de usuário
      System.out.print( 
         "Please enter an integer value (-1 to quit): " );
      searchInt = input.nextInt(); // lê um int do usuário
      System.out.println();

      // insere repetidamente um inteiro; -1 termina o programa
      while ( searchInt != -1 )
      {
         // utiliza a pesquisa binária para tentar localizar o inteiro
         position = searchArray.binarySearch( searchInt );

         // valor de retorno -1 indica que o inteiro não foi localizado
         if ( position == -1 )
            System.out.println( "The integer " + searchInt + 
               " was not found.\n" );
         else
            System.out.println( "The integer " + searchInt + 
               " was found in position " + position + ".\n" );

         // obtém a entrada de usuário
         System.out.print( 
            "Please enter an integer value (-1 to quit): " );
         searchInt = input.nextInt(); // lê um int do usuário
         System.out.println();
      } // fim do while
   } // fim de main
} // fim da classe BinarySearchTest


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