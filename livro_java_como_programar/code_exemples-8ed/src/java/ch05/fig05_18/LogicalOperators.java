// Fig. 5.18: LogicalOperators.java
// Operadores lógicos.

package ch05.fig05_18;

public class LogicalOperators 
{
   public static void main( String args[] )
   {
      // cria a tabela-verdade para o operador && (E condicional)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional AND (&&)", "false && false",  ( false && false ),
         "false && true",  ( false && true ), 
         "true && false",  ( true && false ),
         "true && true",  ( true && true ));

      // cria a tabela-verdade para o operador || (OU condicional) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional OR (||)", "false || false",  ( false || false ),
         "false || true",  ( false || true ),
         "true || false",  ( true || false ),
         "true || true",  ( true || true ));

      // cria a tabela-verdade para o operador & (E lógico booleano) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical AND (&)", "false & false",  ( false & false ),
         "false & true",  ( false & true ),
         "true & false",  ( true & false ),
         "true & true",  ( true & true ));

      // cria a tabela-verdade para | (OU inclusivo lógico booleano) operador
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical inclusive OR (|)",
         "false | false",  ( false | false ),
         "false | true",  ( false | true ),
         "true | false",  ( true | false ),
         "true | true",  ( true | true ));

      // cria a tabela-verdade para o operador ^ (OU exclusivo lógico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical exclusive OR (^)", 
         "false ^ false",  ( false ^ false ),
         "false ^ true",  ( false ^ true ),
         "true ^ false",  ( true ^ false ),
         "true ^ true",  ( true ^ true ));

      // cria a tabela-verdade para o operador ! (negação lógica) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
         "!false",  ( !false ), "!true", ( ! true) );
   } // fim de main
} // fim da classe LogicalOperators 


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