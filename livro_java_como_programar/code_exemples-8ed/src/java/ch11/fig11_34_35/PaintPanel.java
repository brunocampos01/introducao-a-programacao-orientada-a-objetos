// Fig. 11.34: PaintPanel.java
// Utilizando a classe MouseMotionAdapter.

package ch11.fig11_34_35;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel 
{
   private int pointCount = 0; // número de contagem de pontos

   // array de 10000 referências java.awt.Point
   private Point points[] = new Point[ 10000 ];

   // configura a GUI e registra handler de evento de mouse
   public PaintPanel()
   {
      // trata evento de movimento de mouse do frame
      addMouseMotionListener(

         new MouseMotionAdapter()// classe interna anônima
         {  
            // armazena coordenadas de arrastar e repinta
            public void mouseDragged( MouseEvent event )                
            {                                                           
               if ( pointCount < points.length )                        
               {                                                        
                  points[ pointCount ] = event.getPoint(); // localiza o ponto
                  pointCount++; // incrementa número de pontos em array
                  repaint(); // repinta JFrame
               } // fim do if
            } // fim do método mouseDragged
         } // fim da classe interna anônima
      ); // fim da chamada para addMouseMotionListener
   } // fim do construtor PaintPanel

   // desenha oval em um quadro delimitador de 4x4 no local especificada na janela
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // limpa a área de desenho

      // desenha todos os pontos no array
      for ( int i = 0; i < pointCount; i++ )
         g.fillOval( points[ i ].x, points[ i ].y, 4, 4 );
   } // fim do método paintComponent
} // fim da classe PaintPanel


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
