// Fig. 12.18: LinesRectsOvalsJPanel.java
// Desenhando linhas, retângulos e ovais.

package ch12.fig12_18_19;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LinesRectsOvalsJPanel extends JPanel 
{
   // exibe várias linhas, retângulos e elipses
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o método paint da superclasse

      this.setBackground( Color.WHITE );

      g.setColor( Color.RED );
      g.drawLine( 5, 30, 380, 30 );

      g.setColor( Color.BLUE );
      g.drawRect( 5, 40, 90, 55 );  
      g.fillRect( 100, 40, 90, 55 );

      g.setColor( Color.CYAN );
      g.fillRoundRect( 195, 40, 90, 55, 50, 50 );
      g.drawRoundRect( 290, 40, 90, 55, 20, 20 );

      g.setColor( Color.YELLOW );   
      g.draw3DRect( 5, 100, 90, 55, true );   
      g.fill3DRect( 100, 100, 90, 55, false );

      g.setColor( Color.MAGENTA );
      g.drawOval( 195, 100, 90, 55 );
      g.fillOval( 290, 100, 90, 55 );
   } // fim do método paintComponent
} // fim da classe LinesRectsOvalsJPanel


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