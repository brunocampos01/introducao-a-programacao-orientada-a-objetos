// Fig. 11.35: Painter.java
// Testando o PaintPanel

package ch11.fig11_34_35;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter
{
   public static void main( String args[] )
   { 
      // cria o JFrame
      JFrame application = new JFrame( "A simple paint program" );

      PaintPanel paintPanel = new PaintPanel(); // cria o painel de pintura
      application.add( paintPanel, BorderLayout.CENTER ); // no centro

      // cria um rótulo e o coloca em SOUTH do BorderLayout
      application.add( new JLabel( "Drag the mouse to draw" ), 
         BorderLayout.SOUTH );

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.setSize( 400, 200 ); // configura o tamanho do frame
      application.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe Painter


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