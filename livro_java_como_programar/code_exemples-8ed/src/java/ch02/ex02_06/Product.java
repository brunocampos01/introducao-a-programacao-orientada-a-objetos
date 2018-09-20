// Ex. 2.6: Product.Java
// Calcula o produto de três inteiros.

package ch02.ex02_06;

import java.util.Scanner; // programa utiliza Scanner

public class Product 
{
   public static void main( String args[] )
   {
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      int x; // primeiro número inserido pelo usuário
      int y; // segundo número inserido pelo usuário
      int z; // terceiro número inserido pelo usuário
      int result; // produto dos números

      System.out.print( "Enter first integer: " ); // solicita entrada
      x = input.nextInt(); // lê o primeiro inteiro

      System.out.print( "Enter second integer: " ); // solicita entrada
      y = input.nextInt(); // lê o segundo inteiro
      
      System.out.print( "Enter third integer: " ); // solicita entrada
      z = input.nextInt(); // lê o terceiro inteiro

      result = x * y * z; // calcula o produto dos números

      System.out.printf( "Product is %d\n", result );

   } // fim do método principal

} // fim da classe Product


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