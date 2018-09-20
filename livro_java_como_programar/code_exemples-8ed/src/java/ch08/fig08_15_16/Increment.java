// Fig. 8.15: Increment.java
// Variável de instância final em uma classe.

package ch08.fig08_15_16;

public class Increment 
{
   private int total = 0; // total de todos os incrementos
   private final int INCREMENT; // variável constante (não-inicializada)

   // construtor inicializa variável de instância final INCREMENT
   public Increment( int incrementValue )                               
   {                                                                    
      INCREMENT = incrementValue; // inicializa variável constante (uma vez)
   } // fim do construtor Increment

   // adiciona INCREMENT ao total
   public void addIncrementToTotal()
   {
      total += INCREMENT;
   } // fim do método addIncrementToTotal

   // retorna representação de String dos dados de um objeto Increment
   public String toString()
   {
      return String.format( "total = %d", total );
   } // fim do método toIncrementString
} // fim da classe Increment


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