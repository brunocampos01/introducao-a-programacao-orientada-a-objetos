// Fig. 12.24: ArcsJPanel.java
// Desenhando arcos.

package ch12.fig12_24_25;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ArcsJPanel extends JPanel 
{
   // desenha ret�ngulos e arcos
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse

      // inicia em 0 e varre 360 graus
      g.setColor( Color.RED );
      g.drawRect( 15, 35, 80, 80 );
      g.setColor( Color.BLACK );
      g.drawArc( 15, 35, 80, 80, 0, 360 );

      // inicia em 0 e varre 110 graus
      g.setColor( Color.RED );
      g.drawRect( 100, 35, 80, 80 );
      g.setColor( Color.BLACK );
      g.drawArc( 100, 35, 80, 80, 0, 110 );

      // inicia em 0 e varre -270 graus
      g.setColor( Color.RED );
      g.drawRect( 185, 35, 80, 80 );
      g.setColor( Color.BLACK );
      g.drawArc( 185, 35, 80, 80, 0, -270 );

      // inicia em 0 e varre 360 graus
      g.fillArc( 15, 120, 80, 40, 0, 360 );

      // inicia em 270 e varre -90 graus
      g.fillArc( 100, 120, 80, 40, 270, -90 );
                 
      // inicia em 0 e varre -270 graus
      g.fillArc( 185, 120, 80, 40, 0, -270 );
   } // fim do método paintComponent
} // fim da classe ArcsJPanel


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