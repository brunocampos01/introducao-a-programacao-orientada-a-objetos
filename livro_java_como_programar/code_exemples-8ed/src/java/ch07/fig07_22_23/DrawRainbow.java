// Fig. 7.22: DrawRainbow.java
// Demonstra a utilização de cores em um array.

package ch07.fig07_22_23;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{
   // Define as cores índigo e violeta
   final Color VIOLET = new Color( 128, 0, 128 );
   final Color INDIGO = new Color( 75, 0, 130 );
   
   // a utilizar no arco-íris, iniciando da parte mais interna
   // As duas entradas em branco resultam em um arco vazio no centro
   private Color colors[] =
      { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
        
   // construtor
   public DrawRainbow()
   {
      setBackground( Color.WHITE ); // configura o fundo como branco
   } // fim do construtor DrawRainbow
        
   // desenha um arco-íris utilizando círculos concêntricos
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      int radius = 20; // raio de um arco
      
      // desenha o arco-íris perto da parte central inferior
      int centerX = getWidth() / 2;
      int centerY = getHeight() - 10;

      // desenha arcos preenchidos com o mais externo
      for ( int counter = colors.length; counter > 0; counter-- )
      {
         // configura a cor para o arco atual
         g.setColor( colors[ counter - 1 ] );
         
         // preenche o arco de 0 a 180 graus
         g.fillArc( centerX - counter * radius,
            centerY - counter * radius, 
            counter * radius * 2, counter * radius * 2, 0, 180 );
      } // for final
   } // fim do método paintComponent
} // fim da classe DrawRainbow


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