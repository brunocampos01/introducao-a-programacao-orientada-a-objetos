// Fig. 12.19: LinesRectsOvals.java
// Desenhando linhas, retângulos e elipses.

package ch12.fig12_18_19;

import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // criar frame para LinesRectsOvalsJPanel
      JFrame frame = 
         new JFrame( "Drawing lines, rectangles and ovals" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
      LinesRectsOvalsJPanel linesRectsOvalsJPanel = 
         new LinesRectsOvalsJPanel(); 
      linesRectsOvalsJPanel.setBackground( Color.WHITE ); 
      frame.add( linesRectsOvalsJPanel ); // adiciona painel ao frame
      frame.setSize( 400, 210 ); // configura o tamanho do frame
      frame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe LinesRectsOvals


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