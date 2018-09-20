// Fig. 4.20: DrawPanelTest.java
// Aplicativo para exibir uma DrawPanel.

package ch04.Fig04_19_20;

import javax.swing.JFrame;

public class DrawPanelTest
{
   public static void main( String args[] )
   {
      // cria um painel que contém nosso desenho
      DrawPanel panel = new DrawPanel();
      
      // cria um novo quadro para armazenar o painel
      JFrame application = new JFrame();
      
      // configura o frame para ser encerrado quando ele é fechado
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      application.add( panel ); // adiciona o painel ao frame
      application.setSize( 250, 250 ); // configura o tamanho do frame
      application.setVisible( true ); // torna o frame visível
   } // fim de main
} // fim da classe DrawPanelTest


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