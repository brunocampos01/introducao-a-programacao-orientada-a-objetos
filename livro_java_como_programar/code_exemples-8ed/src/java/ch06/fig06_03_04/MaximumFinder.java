// Fig. 6.3: MaximumFinder.java
// Método maximum declarado pelo programador.

package ch06.fig06_03_04;

import java.util.Scanner;

public class MaximumFinder 
{
   // obtém três valores de ponto flutuante e localiza o valor máximo
   public void determineMaximum()
   {
      // cria Scanner para entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      // obtém a entrada do usuário
      System.out.print( 
         "Enter three floating-point values separated by spaces: " );
      double number1 = input.nextDouble(); // lê o primeiro double
      double number2 = input.nextDouble(); // lê o segundo double
      double number3 = input.nextDouble(); // lê o terceiro double

      // determina o valor máximo
      double result = maximum( number1, number2, number3 );

      // exibe o valor máximo
      System.out.println("Maximum is: " + result);
   } // fim do método determineMaximum

   // retorna o máximo dos seus três parâmetros de double
   public double maximum( double x, double y, double z )          
   {                                                              
      double maximumValue = x; // supõe que x é o maior valor inicial
                                                                  
      // determina se y é maior que maximumValue
      if ( y > maximumValue )                                     
         maximumValue = y;                                        
                                                                  
      // determina se z é maior que maximumValue
      if ( z > maximumValue )                                     
         maximumValue = z;                                        
                                                                  
      return maximumValue;                                        
   } // fim do método maximum                                        
} // fim da classe MaximumFinder


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