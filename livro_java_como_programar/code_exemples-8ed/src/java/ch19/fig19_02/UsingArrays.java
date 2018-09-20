// Fig. 19.2: UsingArrays.java
// Utilizando arrays Java.

package ch19.fig19_02;

import java.util.Arrays;

public class UsingArrays 
{
   private int intArray[] = { 1, 2, 3, 4, 5, 6 };
   private double doubleArray[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };
   private int filledIntArray[], intArrayCopy[];

   // o construtor inicializa arrays
   public UsingArrays()
   {
      filledIntArray = new int[ 10 ]; // cria o array int com 10 elementos
      intArrayCopy = new int[ intArray.length ];

      Arrays.fill( filledIntArray, 7 ); // preenche com 7s
      Arrays.sort( doubleArray ); // classifica doubleArray ascendente

      // copia o array intArray no array intArrayCopy 
      System.arraycopy( intArray, 0, intArrayCopy,  
         0, intArray.length );                      
   } // fim do construtor UsingArrays

   // gera a saída de valores de cada array
   public void printArrays()
   {     
      System.out.print( "doubleArray: " );
      for ( double doubleValue : doubleArray )
         System.out.printf( "%.1f ", doubleValue );

      System.out.print( "\nintArray: " );
      for ( int intValue : intArray )
         System.out.printf( "%d ", intValue );

      System.out.print( "\nfilledIntArray: " );
      for ( int intValue : filledIntArray )
         System.out.printf( "%d ", intValue );

      System.out.print( "\nintArrayCopy: " );
      for ( int intValue : intArrayCopy )
         System.out.printf( "%d ", intValue );

      System.out.println( "\n" );
   } // fim do método printArrays

   // localiza valor no array intArray 
   public int searchForInt( int value )
   {  
      return Arrays.binarySearch( intArray, value );
   } // fim do método searchForInt

   // compara o conteúdo dos arrays
   public void printEquality()
   {
      boolean b = Arrays.equals( intArray, intArrayCopy );
      System.out.printf( "intArray %s intArrayCopy\n",
         ( b ? "==" : "!=" ) );

      b = Arrays.equals( intArray, filledIntArray );
      System.out.printf( "intArray %s filledIntArray\n", 
         ( b ? "==" : "!=" ) );
   } // fim do método printEquality

   public static void main( String args[] )
   {
      UsingArrays usingArrays = new UsingArrays();

      usingArrays.printArrays();
      usingArrays.printEquality();

      int location = usingArrays.searchForInt( 5 );
      if ( location >= 0 )
         System.out.printf( 
            "Found 5 at element %d in intArray\n", location ); 
      else
         System.out.println( "5 not found in intArray" ); 

      location = usingArrays.searchForInt( 8763 );
      if ( location >= 0 )
         System.out.printf( 
            "Found 8763 at element %d in intArray\n", location ); 
      else
         System.out.println( "8763 not found in intArray" ); 
   } // fim de main
} // fim da classe UsingArrays 


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