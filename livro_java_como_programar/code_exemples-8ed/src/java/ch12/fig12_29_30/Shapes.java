// Fig. 12.30: Shapes.java
// Demonstrando algumas formas 2D Java.

package ch12.fig12_29_30;

import javax.swing.JFrame;

public class Shapes
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // cria frame para ShapesJPanel
      JFrame frame = new JFrame( "Drawing 2D shapes" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      // cria ShapesJPanel
      ShapesJPanel shapesJPanel = new ShapesJPanel();

      frame.add( shapesJPanel ); // adiciona shapesJPanel ao frame
      frame.setSize( 425, 200 ); // configura o tamanho do frame
      frame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe Shapes


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