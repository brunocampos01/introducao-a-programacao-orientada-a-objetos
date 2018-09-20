// Fig. 18.15: WildcardTest.java
// Programa de teste de curinga.

package ch18.fig18_15;

import java.util.ArrayList;

public class WildcardTest 
{
   public static void main( String args[] ) 
   {
      // cria, inicializa e gera saída de ArrayList de Integers, então
      // exibe o total dos elementos
      Integer[] integers = { 1, 2, 3, 4, 5 };
      ArrayList< Integer > integerList = new ArrayList< Integer >();

      // insere elementos na integerList
      for ( Integer element : integers )
         integerList.add( element );

      System.out.printf( "integerList contains: %s\n", integerList );
      System.out.printf( "Total of the elements in integerList: %.0f\n\n",
         sum( integerList ));

      // cria, inicializa e gera saída do ArrayList de Doubles, então
      // exibe o total dos elementos
      Double[] doubles = { 1.1, 3.3, 5.5 };
      ArrayList< Double > doubleList = new ArrayList< Double >();

      // insere elementos na doubleList
      for ( Double element : doubles )
         doubleList.add( element );

      System.out.printf( "doubleList contains: %s\n", doubleList );
      System.out.printf( "Total of the elements in doubleList: %.1f\n\n", 
         sum( doubleList ));

      // cria, inicializa e gera saída de ArrayList de números contendo
      // Integers e Doubles e então exibe o total dos elementos
      Number[] numbers = { 1, 2.4, 3, 4.1 }; // Integers and Doubles
      ArrayList< Number > numberList = new ArrayList< Number >();

      // insere elementos na numberList
      for ( Number element : numbers )
         numberList.add( element );

      System.out.printf( "numberList contains: %s\n", numberList );
      System.out.printf( "Total of the elements in numberList: %.1f\n", 
         sum( numberList ));
   } // fim de main

   // calcula o total de elementos na pilha
   public static double sum(ArrayList< ? extends Number >list )
   {
      double total = 0; // inicializa o total

      // calcula a soma
      for ( Number element : list )
         total += element.doubleValue();

      return total;
   } // fim do método sum
} // fim da classe WildcardTest


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