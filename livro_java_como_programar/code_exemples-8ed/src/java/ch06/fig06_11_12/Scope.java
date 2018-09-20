// Fig. 6.11: Scope.java
// A classe Scope demonstra os escopos de campo e de vari�vel local.

package ch06.fig06_11_12;

public class Scope
{
   // campo acessível para todos os métodos dessa classe
   private int x = 1;                                      

   // método begin cria e inicializa a variável local x
   // e chama os métodos useLocalVariable e useField
   public void begin()
   {
      int x = 5; // variável local x do método sombreia o campo x

      System.out.printf( "local x in method begin is %d\n", x );

      useLocalVariable(); // useLocalVariable tem uma variável local x
      useField(); // useField utiliza o campo x da classe Scope
      useLocalVariable(); // useLocalVariable reinicializa a variável local x
      useField(); // campo x da classe Scope retém seu valor

      System.out.printf( "\nlocal x in method begin is %d\n", x );
   } // fim do método begin

   // cria e inicializa a variável local x durante cada chamada
   public void useLocalVariable()
   {
      int x = 25; // inicializada toda vez que useLocalVariable é chamado

      System.out.printf( 
         "\nlocal x on entering method useLocalVariable is %d\n", x );
      ++x; // modifica a variável local x desse método
      System.out.printf( 
         "local x before exiting method useLocalVariable is %d\n", x );
   } // fim do método useLocalVariable

   // modifica o campo x da classe Scope durante cada chamada
   public void useField()
   {
      System.out.printf( 
         "\nfield x on entering method useField is %d\n", x );
      x *= 10; // modifica o campo x da classe Scope
      System.out.printf( 
         "field x before exiting method useField is %d\n", x );
   } // fim do método useField
} // fim da classe Scope


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