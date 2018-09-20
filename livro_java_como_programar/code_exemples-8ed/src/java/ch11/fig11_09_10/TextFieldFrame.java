// Fig. 11.9: TextFieldFrame.java
// Demonstrando a classe JTextField.
package ch11.fig11_09_10;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame 
{
   private JTextField textField1; // campo de texto com tamanho configurado
   private JTextField textField2; // campo de texto construído com texto
   private JTextField textField3; // campo de texto com texto e tamanho
   private JPasswordField passwordField; // campo de senha com texto

   // construtor TextFieldFrame adiciona JTextFields a JFrame
   public TextFieldFrame()
   {
      super( "Testing JTextField and JPasswordField" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      // constrói textfield com 10 colunas
      textField1 = new JTextField( 10 );    
      add( textField1 ); // adiciona textField1 ao JFrame

      // constrói campo de texto com texto padrão
      textField2 = new JTextField( "Enter text here" );
      add( textField2 ); // adiciona textField2 ao JFrame

      // constrói textfield com o texto padrão e 21 colunas
      textField3 = new JTextField( "Uneditable text field", 21 );
      textField3.setEditable( false ); // desativa a edição
      add( textField3 ); // adiciona textField3 ao JFrame

      // constrói passwordfield com o texto padrão
      passwordField = new JPasswordField( "Hidden text" );
      add( passwordField ); // adiciona passwordField ao JFrame

      // handlers de evento registradores
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener( handler );          
      textField2.addActionListener( handler );          
      textField3.addActionListener( handler );          
      passwordField.addActionListener( handler );       
   } // fim do construtor TextFieldFrame

   // classe interna private para tratamento de evento
   private class TextFieldHandler implements ActionListener
   {
      // processa eventos de campo de texto
      public void actionPerformed( ActionEvent event )
      {
         String string = ""; // declara string a ser exibida

         // usuário pressionou Enter no JTextField textField1
         if (event.getSource() == textField1)
            string = String.format( "textField1: %s",
               event.getActionCommand());

         // usuário pressionou Enter no JTextField textField2
         else if (event.getSource() == textField2)
            string = String.format( "textField2: %s",
               event.getActionCommand());

         // usuário pressionou Enter no JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format( "textField3: %s", 
               event.getActionCommand());

         // usuário pressionou Enter no JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format( "passwordField: %s", 
               new String(passwordField.getPassword()) );

         // exibe o conteúdo de JTextField
         JOptionPane.showMessageDialog( null, string ); 
      } // fim do método actionPerformed
   } // fim da classe TextFieldHandler interna private
} // fim da classe TextFieldFrame


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