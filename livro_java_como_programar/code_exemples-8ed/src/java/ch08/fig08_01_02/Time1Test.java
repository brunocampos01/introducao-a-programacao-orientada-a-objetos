// Fig. 8.2: Time1Test.java
// objeto Time1 utilizado em um aplicativo.

package ch08.fig08_01_02;

public class Time1Test 
{
   public static void main( String args[] )
   {
      // cria e inicializa um objeto Time1
      Time1 time = new Time1(); // invoca o construtor Time1

      // gera saída de representações de string da data/hora
      System.out.print( "The initial universal time is: " );
      System.out.println(time.toUniversalString());
      System.out.print( "The initial standard time is: " );
      System.out.println(time.toString());
      System.out.println(); // gera saída de uma linha em branco

      // altera a data/hora e gera saída da data/hora atualizada
      time.setTime( 13, 27, 6 );
      System.out.print( "Universal time after setTime is: " );
      System.out.println(time.toUniversalString());
      System.out.print( "Standard time after setTime is: " );
      System.out.println(time.toString());
      System.out.println(); // gera saída de uma linha em branco

      // configura data/hora com valores inválidos; gera saída da data/hora atualizada
      time.setTime( 99, 99, 99 );
      System.out.println( "After attempting invalid settings:" );
      System.out.print( "Universal time: " );
      System.out.println(time.toUniversalString());
      System.out.print( "Standard time: " );
      System.out.println(time.toString());
   } // fim de main
} // fim da classe Time1Test


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