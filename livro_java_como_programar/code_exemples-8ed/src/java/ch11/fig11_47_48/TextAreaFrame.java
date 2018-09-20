// Fig. 11.47: TextAreaFrame.java
// Copiando texto selecionado de um textarea para outro. 

package ch11.fig11_47_48;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame 
{
   private JTextArea textArea1; // exibe a string demo
   private JTextArea textArea2; // texto destacado é copiado aqui
   private JButton copyJButton; // começa a copiar o texto

   // construtor sem argumento
   public TextAreaFrame() 
   {
      super( "TextArea Demo" ); 
      Box box = Box.createHorizontalBox(); // cria box
      String demo = "This is a demo string to\n" + 
         "illustrate copying text\nfrom one textarea to \n" +
         "another textarea using an\nexternal event\n";

      textArea1 = new JTextArea( demo, 10, 15 ); // cria textarea1
      box.add( new JScrollPane( textArea1 ) ); // adiciona scrollpane

      copyJButton = new JButton( "Copy >>>" ); // cria botão de cópia
      box.add( copyJButton ); // adiciona o botão de cópia à box
      copyJButton.addActionListener(

         new ActionListener() // classe interna anônima
         {   
            // configura texto em textArea2 como texto selecionado de textArea1
            public void actionPerformed( ActionEvent event )
            {
               textArea2.setText( textArea1.getSelectedText() );
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim da chamada para addActionListener

      textArea2 = new JTextArea( 10, 15 ); // cria segundo textarea
      textArea2.setEditable( false ); // desativa a edição
      box.add( new JScrollPane( textArea2 ) ); // adiciona scrollpane

      add( box ); // adiciona box ao frame
   } // fim do construtor TextAreaFrame
} // fim da classe TextAreaFrame


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