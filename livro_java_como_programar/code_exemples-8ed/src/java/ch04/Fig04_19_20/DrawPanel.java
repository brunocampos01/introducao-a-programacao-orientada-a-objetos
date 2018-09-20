// Fig. 4.19: DrawPanel.java
// Desenha duas linhas que se cruzam em um painel.

package ch04.Fig04_19_20;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   // desenha um X a partir dos cantos do painel
   public void paintComponent( Graphics g )
   {
      // chama paintComponent para assegurar que o painel é exibido corretamente
      super.paintComponent( g );
      
      int width = getWidth(); // largura total
      int height = getHeight(); // altura total

      // desenha uma linha a partir do canto superior esquerdo até o inferior direito
      g.drawLine( 0, 0, width, height );
      
      // desenha uma linha a partir do canto inferior esquerdo até o superior direito
      g.drawLine( 0, height, width, 0 );
   } // fim do método paintComponent
} // fim da classe DrawPanel


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