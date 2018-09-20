// Fig. 13.5: UsingExceptions.java
// Demonstração do tratamento de exceções try...catch...finally
// Mecanismo.

package ch13.fig13_05;

public class UsingExceptions 
{
   public static void main( String args[] )
   {
      try 
      { 
         throwException(); // chama método throwException
      } // fim de try
      catch ( Exception exception ) // exceção lançada por throwException
      {
         System.err.println( "Exception handled in main" );
      } // fim de catch

      doesNotThrowException();
   } // fim de main

   // demonstra try...catch...finally
   public static void throwException() throws Exception
   {
      try // lança uma exceção e imediatamente a captura
      { 
         System.out.println( "Method throwException" );
         throw new Exception(); // gera a exceção
      } // fim de try
      catch ( Exception exception ) // captura exceção lançada em try
      {
         System.err.println(
            "Exception handled in method throwException" );
         throw exception; // lança novamente para processamento adicional

         // qualquer código aqui não seria alcançado

      } // fim de catch
      finally // executa independentemente do que ocorre em try...catch
      {                                                             
         System.err.println( "Finally executed in throwException" );
      } // fim de finally 

      // qualquer código aqui não seria atingido, exceção lançada de novo em catch

   } // fim de método throwException

   // demonstra finally quando nenhuma exceção ocorrer
   public static void doesNotThrowException()
   {
      try // bloco try não lança uma exceção
      { 
         System.out.println( "Method doesNotThrowException" );
      } // fim de try
      catch ( Exception exception ) // não executa
      {
         System.err.println( exception );
      } // fim de catch
      finally // executa independentemente do que ocorre em try...catch
      {                                                           
         System.err.println(                                      
            "Finally executed in doesNotThrowException" );        
      } // fim de finally 

      System.out.println( "End of method doesNotThrowException" );
   } // fim de método doesNotThrowException
} // fim da classe UsingExceptions 


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