// Fig. 12.11: FontJPanel.java
// exibe strings em diferentes fontes e cores.

package ch12.fig12_11_12;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel
{
   // exibe Strings em diferentes fontes e cores
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintConponent da superclasse 

      // fonte configurada como Serifa (Times), negrito, 12 pt e desenha uma string
      g.setFont( new Font( "Serif", Font.BOLD, 12 ) );
      g.drawString( "Serif 12 point bold.", 20, 50 );

      // configura fonte como monoespaçada (Courier), 24 pt itálico e desenha uma string
      g.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
      g.drawString( "Monospaced 24 point italic.", 20, 70 );

      // configura fonte como SansSerif (Helvetica), simples, 14 pt e desenha uma string
      g.setFont( new Font( "SansSerif", Font.PLAIN, 14 ) );
      g.drawString( "SansSerif 14 point plain.", 20, 90 );

      // configura fonte como Serif (Times), 18 pt negrito/itálico e desenha uma string
      g.setColor( Color.RED );
      g.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
      g.drawString( g.getFont().getName() + " " + g.getFont().getSize() +
         " point bold italic.", 20, 110 );
   } // fim do método paintComponent
} // fim da classe FontJPanel


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
