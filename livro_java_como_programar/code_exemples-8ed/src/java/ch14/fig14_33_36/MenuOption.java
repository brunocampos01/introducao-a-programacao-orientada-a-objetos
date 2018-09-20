// Fig. 14.33: MenuOption.Java
// Define um tipo enum para as opções do programa de consulta de crédito.

package ch14.fig14_33_36;

public enum MenuOption
{
   // declara o conteúdo do tipo enum
   PRINT( 1 ),
   UPDATE( 2 ),
   NEW( 3 ),
   DELETE( 4 ),
   END( 5 );

   private final int value; // opção atual de menu

   MenuOption( int valueOption )
   {
      value = valueOption;
   } // fim do construtor do enum de MenuOptions

   public int getValue()
   {
      return value;
   } // fim do método getValue
} // fim do enum de MenuOption


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