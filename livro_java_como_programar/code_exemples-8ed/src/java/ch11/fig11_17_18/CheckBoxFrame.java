// Fig. 11.17: CheckBoxFrame.java
// Creating JCheckBox buttons.

package ch11.fig11_17_18;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
   private JTextField textField; // exibe o texto na alteração de fontes
   private JCheckBox boldJCheckBox; // para selecionar/desselecionar negrito
   private JCheckBox italicJCheckBox; // para selecionar/desselecionar itálico

   // construtor CheckBoxFrame adiciona JCheckBoxes ao JFrame
   public CheckBoxFrame()
   {
      super( "JCheckBox Test" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      // configura JTextField e sua fonte
      textField = new JTextField( "Watch the font style change", 20 );
      textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      add( textField ); // adiciona textField ao JFrame

      boldJCheckBox = new JCheckBox( "Bold" ); // cria caixa de seleção p/ negrito
      italicJCheckBox = new JCheckBox( "Italic" ); // cria itálico
      add( boldJCheckBox ); // adiciona caixa de seleção de negrito ao JFrame
      add( italicJCheckBox ); // adiciona caixa de seleção de itálico ao JFrame

      // listeners registradores para JCheckBoxes
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener( handler );       
      italicJCheckBox.addItemListener( handler );     
   } // fim do construtor CheckBoxFrame

   // classe interna private para tratamento de evento ItemListener
   private class CheckBoxHandler implements ItemListener
   {
      private int valBold = Font.PLAIN; // controla o estilo de fonte negrito
      private int valItalic = Font.PLAIN; // controla o estilo de fonte itálico

      // responde aos eventos de caixa de seleção
      public void itemStateChanged( ItemEvent event )
      {
         // processa eventos da caixa de seleção de negrito
         if (event.getSource() == boldJCheckBox)
            valBold = 
               boldJCheckBox.isSelected()? Font.BOLD : Font.PLAIN;
               
         // processa eventos da caixa de seleção de itálico
         if (event.getSource() == italicJCheckBox)
            valItalic = 
               italicJCheckBox.isSelected()? Font.ITALIC : Font.PLAIN;

         // configura a fonte do campo de texto
         textField.setFont( 
            new Font( "Serif", valBold + valItalic, 14 ) );
      } // fim do método itemStateChanged
   } // fim da classe CheckBoxHandler interna private
} // fim da classe CheckBoxFrame


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