// Fig. 19.6: VectorTest.java
// Utilizando a classe Vector.

package ch19.fig19_06;

import java.util.Vector;                
import java.util.NoSuchElementException;

public class VectorTest 
{
   private static final String colors[] = { "red", "white", "blue" };

   public VectorTest()
   {
      Vector< String > vector = new Vector< String >();
      printVector( vector ); // imprime vetor

      // adiciona elementos ao vetor
      for ( String color : colors )
         vector.add( color );

      printVector( vector ); // imprime vetor
      
      // gera saída dos primeiros e últimos elementos
      try 
      {
         System.out.printf( "First element: %s\n", vector.firstElement());
         System.out.printf( "Last element: %s\n", vector.lastElement());
      } // fim do try
      // captura exceção se vetor estiver vazio
      catch ( NoSuchElementException exception ) 
      {
         exception.printStackTrace();
      } // fim do catch
      
      // o vetor contém "red"?
      if (vector.contains( "red" ))
         System.out.printf( "\n\"red\" found at index %d\n\n", 
            vector.indexOf( "red" ));
      else
         System.out.println( "\n\"red\" not found\n" );
      
      vector.remove( "red" ); // remove a string "red"
      System.out.println( "\"red\" has been removed" );
      printVector( vector ); // imprime vetor
      
      // o vetor contém "red" depois da operação remove?
      if (vector.contains( "red" ))
         System.out.printf(  
            "\"red\" found at index %d\n", vector.indexOf( "red" ));
      else
         System.out.println( "\"red\" not found" );
      
      // imprime o tamanho e capacidade de vetor
      System.out.printf( "\nSize: %d\nCapacity: %d\n", vector.size(), 
         vector.capacity());
   } // fim do construtor Vector
   
   private void printVector(Vector< String > vectorToOutput)
   {
      if (vectorToOutput.isEmpty()) 
         System.out.print( "vector is empty" ); // vectorToOutput está vazio
      else  // itera pelos elementos
      {
         System.out.print( "vector contains: " );      

         // envia os elementos para a saída
         for ( String element : vectorToOutput )
            System.out.printf( "%s ", element );
      } // fim de else
      
      System.out.println( "\n" ); 
   } // fim do método printVector

   public static void main( String args[] )
   {
      new VectorTest(); // cria o objeto e chama seu construtor
   } // fim de main
} // fim da classe VectorTest


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