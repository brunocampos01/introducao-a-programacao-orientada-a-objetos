// Fig. 5.5: Sum.java
// Somando inteiros com a instrução for.

package ch05.fig05_05;

public class Sum 
{
   public static void main( String args[] )
   {
      int total = 0; // inicializa o total

      // total de inteiros pares de 2 a 20
      for ( int number = 2; number <= 20; number += 2 )
         total += number;                              

      System.out.printf( "Sum is %d\n", total ); // exibe resultados 
   } // fim de main
} // fim da classe Sum


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