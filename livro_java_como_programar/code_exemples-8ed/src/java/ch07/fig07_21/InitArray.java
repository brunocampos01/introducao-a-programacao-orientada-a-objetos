// Fig. 7.21: InitArray.java
// Utilizando argumentos de linha de comando para inicializar um array.

package ch07.fig07_21;

public class InitArray 
{
   public static void main(String args[])
   {
      // verifica número de argumentos de linha de comando
      if (args.length != 3)
         System.out.println(
            "Error: Please re-enter the entire command, including\n" +
            "an array size, initial value and increment." );
      else
      {
         // obtém o tamanho do array a partir do primeiro argumento de linha de comando
         int arrayLength = Integer.parseInt( args[ 0 ] );
         int array[] = new int[ arrayLength ]; // cria o array

         // obtém o valor inicial e o incremento a partir do argumento de linha de comando
         int initialValue = Integer.parseInt( args[ 1 ] );
         int increment = Integer.parseInt( args[ 2 ] );   

         // calcula valor de cada elemento do array
         for ( int counter = 0; counter < array.length; counter++ )
            array[ counter ] = initialValue + increment * counter;

         System.out.printf( "%s%8s\n", "Index", "Value" );
         
         // exibe o valor e o índice de array
         for ( int counter = 0; counter < array.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array[ counter ] );
      } // fim de else
   } // fim de main
} // fim da classe InitArray


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