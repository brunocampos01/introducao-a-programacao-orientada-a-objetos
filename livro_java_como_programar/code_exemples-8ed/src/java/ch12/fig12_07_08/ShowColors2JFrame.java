// Fig. 12.7: ShowColors2JFrame.Java
// Escolhendo cores com JColorChooser.

package ch12.fig12_07_08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame 
{
   private JButton changeColorJButton;
   private Color color = Color.LIGHT_GRAY;
   private JPanel colorJPanel;

   // configura a GUI
   public ShowColors2JFrame()
   {
      super( "Using JColorChooser" );

      // cria JPanel para exibir as cores
      colorJPanel = new JPanel();
      colorJPanel.setBackground( color );

      // configura changeColorJButton e registra seu handler de evento
      changeColorJButton = new JButton( "Change Color" );
      changeColorJButton.addActionListener(

         new ActionListener() // classe interna an�nima
         {
            // exibe JColorChooser quando o usu�rio clica no bot�o
            public void actionPerformed( ActionEvent event )
            {
               color = JColorChooser.showDialog(                    
                  ShowColors2JFrame.this, "Choose a color", color );

               // configura cor padr�o, se nenhuma cor for retornada
               if ( color == null )
                  color = Color.LIGHT_GRAY;

               // muda a cor de fundo do painel de conte�do
               colorJPanel.setBackground( color );
            } // fim do m�todo actionPerformed
         } // fim da classe interna an�nima
      ); // fim da chamada para addActionListener
 
      add( colorJPanel, BorderLayout.CENTER ); // adiciona colorJPanel
      add( changeColorJButton, BorderLayout.SOUTH ); // adiciona bot�o

      setSize( 400, 130 ); // configura o tamanho do frame
      setVisible( true ); // exibe o frame
   } // fim do construtor ShowColor2JFrame
} // fim da classe ShowColors2JFrame


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