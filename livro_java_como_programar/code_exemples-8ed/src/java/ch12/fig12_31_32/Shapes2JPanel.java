// Fig. 12.31: Shapes2JPanel.java
// Demonstrando um caminho geral.

package ch12.fig12_31_32;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class Shapes2JPanel extends JPanel 
{
   // desenha caminhos gerais
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse
      Random random = new Random(); // obtém o gerador de números aleatórios

      int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
      int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

      Graphics2D g2d = ( Graphics2D ) g;
      GeneralPath star = new GeneralPath(); // cria o objeto GeneralPath 

      // configura a coordenada inicial do General Path
      star.moveTo( xPoints[ 0 ], yPoints[ 0 ] );       

      // cria a estrela -- isso não desenha a estrela
      for ( int count = 1; count < xPoints.length; count++ )
         star.lineTo( xPoints[ count ], yPoints[ count ] );

      star.closePath(); // fecha a forma

      g2d.translate( 200, 200 ); // traduz a origem para (200, 200)

      // gira em torno da origem e desenha estrelas em cores aleatórias
      for ( int count = 1; count <= 20; count++ ) 
      {
         g2d.rotate( Math.PI / 10.0 ); // rotaciona o sistema de coordenadas

         // configura cores aleatórias
         g2d.setColor( new Color( random.nextInt( 256 ),
            random.nextInt( 256 ), random.nextInt( 256 ) ) );

         g2d.fill( star ); // desenha estrela preenchida
      } // for final
   } // fim do método paintComponent
} // fim da classe Shapes2JPanel


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