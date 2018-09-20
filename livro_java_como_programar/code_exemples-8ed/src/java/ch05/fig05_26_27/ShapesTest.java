// Fig. 5.27: ShapesTest.java
// Aplicativo de teste que exibe a classe Shapes.

package ch05.fig05_26_27;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
   public static void main( String args[] )
   {
      // obtém a escolha do usuário
      String input = JOptionPane.showInputDialog(
         "Enter 1 to draw rectangles\n" +
         "Enter 2 to draw ovals" );
      
      int choice = Integer.parseInt( input ); // converte a entrada em int
      
      // cria o painel com a entrada do usuário
      Shapes panel = new Shapes( choice );
      
      JFrame application = new JFrame(); // cria um novo JFrame

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel ); // adiciona o painel ao frame
      application.setSize( 300, 300 ); // configura o tamanho desejado
      application.setVisible( true ); // mostra o frame
   } // fim de main
} // fim da classe ShapesTest 


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