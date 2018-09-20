// Fig. 11.45: PanelFrame.java
// Utilizando um JPanel para ajudar a fazer o layout dos componentes.

package ch11.fig11_45_46;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame 
{
   private JPanel buttonJPanel; // painel para armazenar botões
   private JButton buttons[]; // array de botões

   // construtor sem argumento
   public PanelFrame()
   {
      super( "Panel Demo" );
      buttons = new JButton[ 5 ]; // cria botões de array
      buttonJPanel = new JPanel(); // configura painel
      buttonJPanel.setLayout( new GridLayout( 1, buttons.length ) );

      // cria e adiciona botões
      for ( int count = 0; count < buttons.length; count++ ) 
      {
         buttons[ count ] = new JButton( "Button " + ( count + 1 ) );
         buttonJPanel.add( buttons[ count ] ); // adiciona botão ao painel
      } // for final

      add( buttonJPanel, BorderLayout.SOUTH ); // adiciona painel ao JFrame
   } // fim do construtor PanelFrame
} // fim da classe PanelFrame


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