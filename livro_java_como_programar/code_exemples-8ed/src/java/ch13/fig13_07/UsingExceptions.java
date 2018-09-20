// Fig. 13.7: UsingExceptions.java
// Demonstrando GetMessage e printStackTrace a partir da classe Exception.

package ch13.fig13_07;

public class UsingExceptions 
{
   public static void main( String args[] )
   {
      try 
      { 
         method1(); // chama method1 
      } // fim de try
      catch ( Exception exception ) // captura a exceção lançada em method1
      { 
         System.err.printf( "%s\n\n", exception.getMessage());
         exception.printStackTrace(); // imprime rastreamento de pilha da exceção

         // obtém informações de rastreamento de pilha
         StackTraceElement[] traceElements = exception.getStackTrace();
         
         System.out.println( "\nStack trace from getStackTrace:" );
         System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );

         // faz um loop por traceElements para obter a descrição da exceção
         for ( StackTraceElement element : traceElements ) 
         {
            System.out.printf( "%s\t", element.getClassName());
            System.out.printf( "%s\t", element.getFileName());
            System.out.printf( "%s\t", element.getLineNumber());
            System.out.printf( "%s\n", element.getMethodName());
         } // for final
      } // fim de catch
   } // fim de main

   // chama method2; lança exceções de volta para main
   public static void method1()throws Exception
   {
      method2();
   } // fim de método method1

   // chama method3; lança exceções de volta para method1
   public static void method2()throws Exception
   {
      method3();
   } // fim de método method2

   // lança Exception de volta para method2
   public static void method3()throws Exception
   {
      throw new Exception( "Exception thrown in method3" );
   } // fim de método method3
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