// Fig. 12.5: ColorJPpanel.java
// Demonstrando Colors.

package ch12.fig12_05_06;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel 
{
   // desenha retângulos e Strings em cores diferentes
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse

      this.setBackground( Color.WHITE );

      // configura nova cor de desenho utilizando inteiros
      g.setColor( new Color( 255, 0, 0 ) );
      g.fillRect( 15, 25, 100, 20 );       
      g.drawString( "Current RGB: " + g.getColor(), 130, 40 );

      // configura nova cor de desenho utilizando floats
      g.setColor( new Color( 0.50f, 0.75f, 0.0f ) );
      g.fillRect( 15, 50, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 65 );

      // configura nova cor de desenho utilizando objetos static Color
      g.setColor( Color.BLUE );
      g.fillRect( 15, 75, 100, 20 );
      g.drawString( "Current RGB: " + g.getColor(), 130, 90 );

      // exibe valores individuais de RGB
      Color color = Color.MAGENTA;
      g.setColor( color );
      g.fillRect( 15, 100, 100, 20 );
      g.drawString( "RGB values: " + color.getRed()+ ", " +
         color.getGreen()+ ", " + color.getBlue(), 130, 115 );
   } // fim do método paintComponent
} // fim da classe ColorJPanel


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