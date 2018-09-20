// Fig. 7.13: PassArray.java
// Passando arrays e elementos de arrays individuais aos métodos.

package ch07.fig07_13;

public class PassArray 
{
   // main cria array e chama modifyArray e modifyElement
   public static void main( String args[] )
   {
      int array[] = { 1, 2, 3, 4, 5 };
      
      System.out.println( 
         "Effects of passing reference to entire array:\n" +
         "The values of the original array are:" );

      // gera saída de elementos do array original
      for ( int value : array )
         System.out.printf( "   %d", value );
   
      modifyArray( array ); // passa a referência do array
      System.out.println( "\n\nThe values of the modified array are:" );

      // gera saída de elementos do array modificado
      for ( int value : array )
         System.out.printf( "   %d", value );
   
      System.out.printf( 
         "\n\nEffects of passing array element value:\n" +
         "array[3] before modifyElement: %d\n", array[ 3 ] );
   
      modifyElement( array[ 3 ] ); // tenta modificar o array[ 3 ]
      System.out.printf( 
         "array[3] after modifyElement: %d\n", array[ 3 ] );
   } // fim de main
   
   // multiplica cada elemento de um array por 2
   public static void modifyArray( int array2[] )                
   {                                                             
      for ( int counter = 0; counter < array2.length; counter++ )
         array2[ counter ] *= 2;                                 
   } // fim do método modifyArray
   
   // multiplica argumento por 2
   public static void modifyElement( int element )            
   {                                                          
      element *= 2;                                           
      System.out.printf(                                      
         "Value of element in modifyElement: %d\n", element );
   } // fim do método modifyElement
} // fim da classe PassArray


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