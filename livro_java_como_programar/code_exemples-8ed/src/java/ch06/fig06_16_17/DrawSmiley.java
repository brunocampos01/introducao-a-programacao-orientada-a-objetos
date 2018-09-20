// Fig. 6.16: DrawSmiley.java
// Demonstra formas preenchidas.

package ch06.fig06_16_17;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // desenha o rosto
      g.setColor( Color.YELLOW );    
      g.fillOval( 10, 10, 200, 200 );
      
      // desenha os olhos
      g.setColor( Color.BLACK );    
      g.fillOval( 55, 65, 30, 30 );
      g.fillOval( 135, 65, 30, 30 );
      
      // desenha a boca
      g.fillOval( 50, 110, 120, 60 );
      
      // "retoca" a boca para criar um sorriso
      g.setColor( Color.YELLOW );    
      g.fillRect( 50, 110, 120, 30 );
      g.fillOval( 50, 120, 120, 40 );
   } // fim do m�todo paintComponent
} // fim da classe DrawSmiley


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