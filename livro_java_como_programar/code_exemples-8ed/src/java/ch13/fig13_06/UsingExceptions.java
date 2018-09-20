// Fig. 13.6: UsingExceptions.java
// Demonstração da desempinhamento.

package ch13.fig13_06;

public class UsingExceptions 
{
   public static void main( String args[] )
   {
      try // chama throwException para demonstrar o desempilhamento
      { 
         throwException();
      } // fim de try
      catch ( Exception exception ) // exceção lançada em throwException
      {
         System.err.println( "Exception handled in main" );
      } // fim de catch
   } // fim de main

   // throwException lança exceção que não é capturada nesse método
   public static void throwException()throws Exception
   {
      try // lança uma exceção e a captura em main
      { 
         System.out.println( "Method throwException" );
         throw new Exception(); // gera a exceção
      } // fim de try
      catch ( RuntimeException runtimeException ) // captura tipo incorreto
      {
         System.err.println( 
            "Exception handled in method throwException" );
      } // fim de catch
      finally // o bloco finally sempre executa
      { 
         System.err.println( "Finally is always executed" );
      } // fim de finally 
   } // fim de método throwException
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