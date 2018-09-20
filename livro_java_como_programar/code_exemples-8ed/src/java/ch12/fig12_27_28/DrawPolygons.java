// Fig. 12.28: DrawPolygons.java
// Desenhando polígonos.

package ch12.fig12_27_28;

import javax.swing.JFrame;

public class DrawPolygons 
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // cria frame para PolygonsJPanel
      JFrame frame = new JFrame( "Drawing Polygons" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      PolygonsJPanel polygonsJPanel = new PolygonsJPanel(); 
      frame.add( polygonsJPanel ); // adiciona polygonsJPanel ao frame
      frame.setSize( 280, 270 ); // configura o tamanho do frame
      frame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe DrawPolygons


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