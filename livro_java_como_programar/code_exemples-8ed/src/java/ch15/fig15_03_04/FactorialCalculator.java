// Fig. 15.3: FactorialCalculator.java
// Método fatorial recursivo.

package ch15.fig15_03_04;

public class FactorialCalculator
{
   // método recursivo fatorial
   public long factorial( long number )            
   {                                               
      if ( number <= 1 ) // testa caso básico
         return 1; // casos básicos: 0! = 1 e 1! = 1
      else // passo de recursão
         return number * factorial( number - 1 );  
   } // fim do método factorial

   // gera saída de fatoriais para valores 0-10
   public void displayFactorials()
   {
      // calcula o fatorial de 0 a 10
      for ( int counter = 0; counter <= 10; counter++ )
         System.out.printf( "%d! = %d\n", counter, factorial( counter ));
   } // fim do método displayFactorials
} // fim da classe FactorialCalculator 


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