// Fig. 9.19: LabelDemo.java
// Demonstra o uso de rótulos.

package ch09.fig09_19;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo
{
   public static void main( String args[] )
   {
      // Cria um rótulo com texto simples
      JLabel northLabel = new JLabel( "North" );
      
      // cria um ícone de uma imagem para podermos colocar em um JLabel
      ImageIcon labelIcon = new ImageIcon( "GUItip.gif" );

      // cria um rótulo com um Icon em vez de texto
      JLabel centerLabel = new JLabel( labelIcon );
      
      // cria outro rótulo com um Icon
      JLabel southLabel = new JLabel( labelIcon );
      
      // configura o rótulo para exibir texto (bem como um ícone)
      southLabel.setText( "South" );
      
      // cria um quadro para armazenar os rótulos
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      // adiciona os rótulos ao frame; o segundo argumento especifica
      // onde adicionar o rótulo no frame
      application.add( northLabel, BorderLayout.NORTH );
      application.add( centerLabel, BorderLayout.CENTER );      
      application.add( southLabel, BorderLayout.SOUTH );      

      application.setSize( 300, 300 ); // configura o tamanho do frame
      application.setVisible( true ); // mostra o frame
   } // fim de main
} // fim da classe LabelDemo 


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