// Fig. 5.13: ContinueTest.java
// continua instrução que termina uma iteração de uma instrução for.

package ch05.fig05_13;

public class ContinueTest 
{
   public static void main( String args[] )
   {
      for ( int count = 1; count <= 10; count++ ) // faz o loop 10 vezes
      {  
         if ( count == 5 ) // se contagem for 5,
            continue;      // pula o código restante no loop

         System.out.printf( "%d ", count );
      } // for final

      System.out.println( "\nUsed continue to skip printing 5" );
   } // fim de main
} // fim da classe ContinueTest


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