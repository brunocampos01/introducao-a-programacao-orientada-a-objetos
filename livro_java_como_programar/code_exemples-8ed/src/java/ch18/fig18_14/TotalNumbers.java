// Fig. 18.14: TotalNumbers.java
// Somando os elementos de um ArrayList.

package ch18.fig18_14;

import java.util.ArrayList;

public class TotalNumbers
{
   public static void main( String args[] ) 
   {
      // cria, inicializa e gera saída de ArrayList de números contendo
      // Integers e Doubles e então exibe o total dos elementos
      Number[] numbers = { 1, 2.4, 3, 4.1 }; // Integers and Doubles
      ArrayList< Number > numberList = new ArrayList< Number >();   

      for ( Number element : numbers ) 
         numberList.add( element ); // insere cada número na numberList

      System.out.printf( "numberList contains: %s\n", numberList);
      System.out.printf( "Total of the elements in numberList: %.1f\n", 
         sum( numberList ));
   } // fim de main

   // calcula o total de elementos em ArrayList
   public static double sum(ArrayList< Number >list )
   {
      double total = 0; // inicializa o total

      // calcula a soma
      for ( Number element : list )     
         total += element.doubleValue();

      return total;
   } // fim do método sum
} // fim da classe TotalNumbers


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