// Fig. 8.22: DrawPanel.java
// Programa que utiliza a classe MyLine
// para desenhar linhas aleatórias.

package ch08.fig08_21_23;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   private Random randomNumbers = new Random();   
   private MyLine lines[]; // array de linhas

   // construtor, cria um painel com formas aleatórias
   public DrawPanel()
   {
      setBackground( Color.WHITE );
      
      lines = new MyLine[ 5 + randomNumbers.nextInt( 5 ) ];

      // cria linhas
      for ( int count = 0; count < lines.length; count++ )
      {
         // gera coordenadas aleatórias
         int x1 = randomNumbers.nextInt( 300 );
         int y1 = randomNumbers.nextInt( 300 );
         int x2 = randomNumbers.nextInt( 300 );
         int y2 = randomNumbers.nextInt( 300 );
         
         // gera uma cor aleatória
         Color color = new Color( randomNumbers.nextInt( 256 ), 
            randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
         
         // adiciona a linha à lista de linhas a ser exibida
         lines[ count ] = new MyLine( x1, y1, x2, y2, color );
      } // for final
   } // fim do construtor DrawPanel

   // para cada array de forma, desenha as formas individuais
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      // desenha as linhas
      for ( MyLine line : lines )
         line.draw( g );
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