// Fig. 12.16: Metrics.java
// Exibindo a métrica da fonte.

package ch12.fig12_15_16;

import javax.swing.JFrame;

public class Metrics 
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // criar frame para MetricsJPanel
      JFrame frame = new JFrame( "Demonstrating FontMetrics" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      MetricsJPanel metricsJPanel = new MetricsJPanel(); 
      frame.add( metricsJPanel ); // adiciona metricsJPanel ao frame
      frame.setSize( 510, 250 ); // configura o tamanho do frame
      frame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe Metrics


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