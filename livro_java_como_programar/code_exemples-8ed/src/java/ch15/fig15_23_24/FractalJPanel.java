// Fig. 15.24: FractalJPanel.java
// FractalJPanel demonstra desenho recursivo de um fractal.

package ch15.fig15_23_24;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel
{
   private Color color; // armazena cor utilizada para desenhar o fractal
   private int level;   // armazena o nível atual do fractal

   private final int WIDTH = 400;  // define a largura do JPanel
   private final int HEIGHT = 400; // define a altura do JPanel

   // configura o nível do fractal inicial com o valor especificado
   // e configura as especificações do JPanel
   public FractalJPanel( int currentLevel )
   {
      color = Color.BLUE;  // inicializa a cor desenho como azul
      level = currentLevel; // configura o nível do fractal inicial
      setBackground( Color.WHITE );
      setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
   } // fim do construtor FractalJPanel 

   // desenha o fractal recursivamente
   public void drawFractal( int level, int xA, int yA, int xB,     
      int yB, Graphics g )                                         
   {                                                               
      // caso básico: desenha uma linha conectando dois pontos dados
      if ( level == 0 )                                            
         g.drawLine( xA, yA, xB, yB );                             
      else // passo de recursão: determina novos pontos, desenha próximo nível
      {                                                            
         // calcula ponto intermediário entre (xA, yA) e (xB, yB)
         int xC = ( xA + xB ) / 2;                                 
         int yC = ( yA + yB ) / 2;                                 
                                                                   
         // calcula o quarto ponto (xD, yD) que forma um
         // triângulo isósceles reto entre (xA, yA) e (xC, yC)
         // onde o ângulo direito está a (xD, yD)
         int xD = xA + ( xC - xA ) / 2 - ( yC - yA ) / 2;          
         int yD = yA + ( yC - yA ) / 2 + ( xC - xA ) / 2;          
                                                                   
         // desenha recursivamente o Fractal                           
         drawFractal( level - 1, xD, yD, xA, yA, g );              
         drawFractal( level - 1, xD, yD, xC, yC, g );              
         drawFractal( level - 1, xD, yD, xB, yB, g );              
      } // fim do else                                                
   } // fim do método drawFractal

   // inicia o desenho de fractal
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // desenha o padrão de fractal
      g.setColor( color );
      drawFractal( level, 100, 90, 290, 200, g );
   } // fim do método paintComponent

   // configura a cor de desenho como c
   public void setColor( Color c )
   {
      color = c;
   } // fim do método setColor
    
   // configura o novo nível de recursão
   public void setLevel( int currentLevel )
   {
      level = currentLevel;
   } // fim do método setLevel

   // retorna o nível de recursão
   public int getLevel()
   {
      return level;
   } // fim do método getLevel
} // fim da classe FractalJPanel


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