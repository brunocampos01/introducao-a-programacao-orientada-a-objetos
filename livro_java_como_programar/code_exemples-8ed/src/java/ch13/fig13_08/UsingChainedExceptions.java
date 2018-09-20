// Fig. 13.8: UsingChainedExceptions.java 
// Demonstrando exceções encadeadas.

package ch13.fig13_08;

public class UsingChainedExceptions
{
   public static void main( String args[] )
   {
      try 
      { 
         method1(); // chama method1 
      } // fim de try
      catch ( Exception exception ) // exceções lançadas de method1
      { 
         exception.printStackTrace();
      } // fim de catch
   } // fim de main

   // chama method2; lança exceções de volta para main
   public static void method1()throws Exception
   {
      try 
      { 
         method2(); // chama method2 
      } // fim de try
      catch ( Exception exception ) // exceçõo lançada de method2
      {
         throw new Exception( "Exception thrown in method1", exception );
      } // fim de try
   } // fim de método method1

   // chama method3; lança exceções de volta para method1
   public static void method2()throws Exception
   {
      try 
      { 
         method3(); // chama method3
      } // fim de try
      catch ( Exception exception ) // exceção lançada de method3
      {
         throw new Exception( "Exception thrown in method2", exception );
      } // fim de catch
   } // fim de método method2

   // lança Exception de volta para method2
   public static void method3() throws Exception
   {
      throw new Exception( "Exception thrown in method3" );
   } // fim de método method3
} // fim da classe UsingChainedExceptions 


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
