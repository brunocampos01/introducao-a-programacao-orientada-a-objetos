// Fig. 5.7: DoWhileTest.java
// instru��o de repeti��o do...while.

package ch05.fig05_07;

public class DoWhileTest 
{  
   public static void main( String args[] )
   {
      int counter = 1; // inicializa o contador

      do                                          
      {                                           
         System.out.printf( "%d  ", counter );    
         ++counter;                               
      } while ( counter <= 10 ); // fim da instrução do...while

      System.out.println(); // gera a saída de um caractere nova linha
   } // fim de main
} // fim da classe DoWhileTest 


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