// Fig. 12.29: ShapesJPanel.java
// Demonstrando algumas formas 2D Java.

package ch12.fig12_29_30;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;  
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;           
import java.awt.geom.Ellipse2D;       
import java.awt.geom.Rectangle2D;     
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;           
import java.awt.geom.Line2D;          
import java.awt.image.BufferedImage;  
import javax.swing.JPanel;

public class ShapesJPanel extends JPanel 
{
   // desenha formas com Java 2D API
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse

      Graphics2D g2d = ( Graphics2D ) g; // faz coerção de g para Graphics2D

      // desenha elipse 2D preenchida com um gradiente azul-amarelo
      g2d.setPaint( new GradientPaint( 5, 30, Color.BLUE, 35, 100,
         Color.YELLOW, true ) );                                  
      g2d.fill( new Ellipse2D.Double( 5, 30, 65, 100 ) );         

      // desenha retângulo 2D em vermelho
      g2d.setPaint( Color.RED );                            
      g2d.setStroke( new BasicStroke( 10.0f ) );            
      g2d.draw( new Rectangle2D.Double( 80, 30, 65, 100 ) );

      // desenha retâng. arred. 2D com um fundo armazenado em buffer
      BufferedImage buffImage = new BufferedImage( 10, 10,   
         BufferedImage.TYPE_INT_RGB );                       

      // obtém Graphics2D de bufferImage e desenha nela
      Graphics2D gg = buffImage.createGraphics();
      gg.setColor( Color.YELLOW ); // desenha em amarelo
      gg.fillRect( 0, 0, 10, 10 ); // desenha um retângulo preenchido
      gg.setColor( Color.BLACK );  // desenha em preto
      gg.drawRect( 1, 1, 6, 6 ); // desenha um retângulo
      gg.setColor( Color.BLUE ); // desenha em azul
      gg.fillRect( 1, 1, 3, 3 ); // desenha um retângulo preenchido
      gg.setColor( Color.RED ); // desenha em vermelho
      gg.fillRect( 4, 4, 3, 3 ); // desenha um retângulo preenchido

      // pinta buffImage sobre o JFrame
      g2d.setPaint( new TexturePaint( buffImage,                   
         new Rectangle( 10, 10 ) ) );                              
      g2d.fill(                                                    
         new RoundRectangle2D.Double( 155, 30, 75, 100, 50, 50 ) );

      // Desenha arco 2D em forma de torta em branco
      g2d.setPaint( Color.WHITE );                                 
      g2d.setStroke( new BasicStroke( 6.0f ) );                    
      g2d.draw(                                                    
         new Arc2D.Double( 240, 30, 75, 100, 0, 270, Arc2D.PIE ) );

      // Desenha linhas 2D em verde e amarelo
      g2d.setPaint( Color.GREEN );                       
      g2d.draw( new Line2D.Double( 395, 30, 320, 150 ) );

      // desenha uma linha em 2D utilizando traço
      float dashes[] = { 10 }; // especifica padrão de traço
      g2d.setPaint( Color.YELLOW );                            
      g2d.setStroke( new BasicStroke( 4, BasicStroke.CAP_ROUND,
         BasicStroke.JOIN_ROUND, 10, dashes, 0 ) );            
      g2d.draw( new Line2D.Double( 320, 30, 395, 150 ) );      
   } // fim do método paintComponent
} // fim da classe ShapesJPanel


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