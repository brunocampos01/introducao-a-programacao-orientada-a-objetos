// Fig. 13.2: DivideByZeroWithExceptionHandling.java
// Um exemplo de tratamento de exceções que verifica a divisão por zero.

package ch13.fig13_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
   // demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
   public static int quotient( int numerator, int denominator )
      throws ArithmeticException
   {
      return numerator / denominator; // possível divisão por zero
   } // fim de método quotient

   public static void main( String args[] )
   {
      Scanner scanner = new Scanner( System.in ); // scanner para entrada
      boolean continueLoop = true; // determina se mais entradas são necessárias

      do                                                                  
      {                                                                   
         try // lê dois números e calcula o quociente
         {                                                                
            System.out.print( "Please enter an integer numerator: " );    
            int numerator = scanner.nextInt();                            
            System.out.print( "Please enter an integer denominator: " );  
            int denominator = scanner.nextInt();                          
                                                                          
            int result = quotient( numerator, denominator );              
            System.out.printf( "\nResult: %d / %d = %d\n", numerator,     
               denominator, result );                                     
            continueLoop = false; // entrada bem-sucedida; fim de loop
         } // fim de try
         catch ( InputMismatchException inputMismatchException )          
         {                                                                
            System.err.printf( "\nException: %s\n",                       
               inputMismatchException );                                  
            scanner.nextLine(); // descarta entrada para o usuário tentar novamente
            System.out.println(                                           
               "You must enter integers. Please try again.\n" );          
         } // fim de catch
         catch ( ArithmeticException arithmeticException )                
         {                                                                
            System.err.printf( "\nException: %s\n", arithmeticException );
            System.out.println(                                           
               "Zero is an invalid denominator. Please try again.\n" );   
         } // fim de catch
      } while ( continueLoop ); // fim de do...while                         
   } // fim de main
} // fim da classe DivideByZeroWithExceptionHandling 


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