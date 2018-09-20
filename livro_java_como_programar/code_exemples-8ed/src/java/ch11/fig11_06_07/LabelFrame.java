// Fig. 11.6: LabelFrame.java
// Demonstrando a classe JLabel.

package ch11.fig11_06_07;

import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; // interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens

public class LabelFrame extends JFrame
{
   private JLabel label1; // JLabel apenas com texto               
   private JLabel label2; // JLabel construído com texto e ícone
   private JLabel label3; // JLabel com texto e ícone adicionados

   // construtor LabelFrame adiciona JLabels a JFrame
   public LabelFrame()
   {
      super( "Testing JLabel" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      // Construtor JLabel com um argumento de string
      label1 = new JLabel( "Label with text" );   
      label1.setToolTipText( "This is label1" );  
      add( label1 ); // adiciona o label1 ao JFrame

      // construtor JLabel com string, Icon e argumentos de alinhamento  
      Icon bug = new ImageIcon( getClass().getResource(  "bug1.GIF" ) );
      label2 = new JLabel( "Label with text and icon", bug,             
         SwingConstants.LEFT );                                         
      label2.setToolTipText( "This is label2" );                        
      add( label2 ); // adiciona label2 ao JFrame

      label3 = new JLabel(); // Construtor JLabel sem argumentos
      label3.setText( "Label with icon and text at bottom" );   
      label3.setIcon( bug ); // adiciona o ícone ao JLabel
      label3.setHorizontalTextPosition( SwingConstants.CENTER );
      label3.setVerticalTextPosition( SwingConstants.BOTTOM );  
      label3.setToolTipText( "This is label3" );                
      add( label3 ); // adiciona label3 ao JFrame
   } // fim do construtor LabelFrame
} // fim da classe LabelFrame


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