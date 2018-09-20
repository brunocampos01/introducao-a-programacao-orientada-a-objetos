// Fig. 5.6: Interest.java
// Cáculos de juros compostos com for.

package ch05.fig05_06;

public class Interest
{
   public static void main( String args[] )
   {
      double amount; // quantia em depósito ao fim de cada ano
      double principal = 1000.0; // quantidade inicial antes dos juros
      double rate = 0.05; // taxa de juros

      // exibe cabeçalhos
      System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );

      // calcula quantidade de depósito para cada um dos dez anos
      for ( int year = 1; year <= 10; year++ )
      {
         // calcula nova quantidade durante ano especificado
         amount = principal * Math.pow( 1.0 + rate, year );

         // exibe o ano e a quantidade
         System.out.printf( "%4d%,20.2f\n", year, amount );
      } // for final
   } // fim de main
} // fim da classe Interest


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