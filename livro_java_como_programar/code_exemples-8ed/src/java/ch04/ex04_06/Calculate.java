// Calcula a soma dos inteiros de 1 a 10

package ch04.ex04_06;

public class Calculate 
{
   public static void main( String args[] )
   {
      int sum;
      int x;

      x = 1;   // inicializa x como 1 para contagem
      sum = 0; // inicializa a soma como 0 para totalização

      while ( x <= 10 ) // enquanto x é menor ou igual a 10
      {
         sum += x; // adiciona x a soma
         ++x; // incrementa x 
      } // fim do while

      System.out.printf( "The sum is: %d\n", sum );
   } // fim de main

} // fim da classe Calculate


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