// Fig. 7.17: InitArray.java
// Inicializando arrays bidimensionais.

package ch07.fig07_17;

public class InitArray 
{
   // cria e gera saída de arrays bidimensionais
   public static void main( String args[] )
   {
      int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };     
      int array2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

      System.out.println( "Values in array1 by row are" );
      outputArray( array1 ); // exibe array1 por linha
   
      System.out.println( "\nValues in array2 by row are" );
      outputArray( array2 ); // exibe array2 por linha
   } // fim de main

   // gera saída de linhas e colunas de um array bidimensional
   public static void outputArray(int array[][])
   {
      // faz um loop pelas linhas do array
      for ( int row = 0; row < array.length; row++ )                   
      {                                                                
         // faz um loop pelas colunas da linha atual
         for ( int column = 0; column < array[ row ].length; column++ )
            System.out.printf( "%d  ", array[ row ][ column ] );       
                                                                       
         System.out.println(); // inicia nova linha de saída
      } // fim do for externo 
   } // fim do método outputArray
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