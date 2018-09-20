// Fig. 11.19: RadioButtonFrame.java
// Criando botões de opção utilizando ButtonGroup e JRadioButton.

package ch11.fig11_19_20;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame 
{
   private JTextField textField; // utilizado para exibir alterações de fonte
   private Font plainFont; // fonte para texto simples
   private Font boldFont; // fonte para texto em negrito
   private Font italicFont; // fonte para texto em itálico
   private Font boldItalicFont; // fonte para texto em negrito e itálico
   private JRadioButton plainJRadioButton; // seleciona texto simples
   private JRadioButton boldJRadioButton; // seleciona texto em negrito
   private JRadioButton italicJRadioButton; // seleciona texto em itálico
   private JRadioButton boldItalicJRadioButton; // negrito e itálico
   private ButtonGroup radioGroup; // buttongroup para armazenar botões de opção

   // construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
   public RadioButtonFrame()
   {
      super( "RadioButton Test" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      textField = new JTextField( "Watch the font style change", 25 );
      add( textField ); // adiciona textField ao JFrame

      // cria botões de opção
      plainJRadioButton = new JRadioButton( "Plain", true );            
      boldJRadioButton = new JRadioButton( "Bold", false );             
      italicJRadioButton = new JRadioButton( "Italic", false );         
      boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false );
      add( plainJRadioButton ); // adiciona botão no estilo simples ao JFrame
      add( boldJRadioButton ); // adiciona botão de negrito ao JFrame
      add( italicJRadioButton ); // adiciona botão de itálico ao JFrame
      add( boldItalicJRadioButton ); // adiciona botão de negrito e itálico

      // cria relacionamento lógico entre JRadioButtons
      radioGroup = new ButtonGroup(); // cria ButtonGroup
      radioGroup.add( plainJRadioButton ); // adiciona simples ao grupo
      radioGroup.add( boldJRadioButton ); // adiciona negrito ao grupo
      radioGroup.add( italicJRadioButton ); // adiciona itálico ao grupo
      radioGroup.add( boldItalicJRadioButton ); // adiciona negrito e itálico

      // cria fonte objetos
      plainFont = new Font( "Serif", Font.PLAIN, 14 );
      boldFont = new Font( "Serif", Font.BOLD, 14 );
      italicFont = new Font( "Serif", Font.ITALIC, 14 );
      boldItalicFont = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
      textField.setFont( plainFont ); // configura a fonte inicial como simples
      
      // registra eventos para JRadioButtons
      plainJRadioButton.addItemListener(            
         new RadioButtonHandler( plainFont ) );     
      boldJRadioButton.addItemListener(             
         new RadioButtonHandler( boldFont ) );      
      italicJRadioButton.addItemListener(           
         new RadioButtonHandler( italicFont ) );    
      boldItalicJRadioButton.addItemListener(       
         new RadioButtonHandler( boldItalicFont ) );
   } // fim do construtor RadioButtonFrame

   // classe interna private para tratar eventos de botão de opção
   private class RadioButtonHandler implements ItemListener
   {
      private Font font; // fonte associada com esse listener

      public RadioButtonHandler( Font f )
      {
         font = f; // configura a fonte desse listener
      } // fim do construtor RadioButtonHandler
           
      // trata eventos de botão de opção
      public void itemStateChanged( ItemEvent event )
      {
         textField.setFont( font ); // configura fonte de textField
      } // fim do método itemStateChanged
   } // fim da classe RadioButtonHandler interna private
} // fim da classe RadioButtonFrame


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