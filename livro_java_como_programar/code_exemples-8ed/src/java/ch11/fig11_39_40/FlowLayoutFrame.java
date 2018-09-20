// Fig. 11.39: FlowLayoutFrame.java
// Demonstrando os alinhamentos de FlowLayout.

package ch11.fig11_39_40;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame 
{
   private JButton leftJButton; // botão para configurar alinhamento à esquerda
   private JButton centerJButton; // botão para configurar alinhamento centralizado
   private JButton rightJButton; // botão para configurar alinhamento à direita
   private FlowLayout layout; // objeto de layout
   private Container container; // contâiner para configurar layout
   
   // configura GUI e registra listeners de botão
   public FlowLayoutFrame()
   {
      super( "FlowLayout Demo" );

      layout = new FlowLayout(); // cria FlowLayout
      container = getContentPane(); // obtém contâiner para layout
      setLayout( layout ); // configura o layout de frame

      // configura leftJButton e registra listener
      leftJButton = new JButton( "Left" ); // cria botão Left
      add( leftJButton ); // adiciona o botão Left ao frame
      leftJButton.addActionListener(

         new ActionListener() // classe interna anônima
         {  
            // processa o evento leftJButton
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.LEFT );

               // realinha os componentes anexados
               layout.layoutContainer( container );
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim da chamada para addActionListener

      // configura centerJButton e registra o listener
      centerJButton = new JButton( "Center" ); // cria botão Center
      add( centerJButton ); // adiciona botão Center ao frame
      centerJButton.addActionListener(

         new ActionListener() // classe interna anônima
         { 
            // processa evento centerJButton
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.CENTER );

               // realinha os componentes anexados
               layout.layoutContainer( container );
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim da chamada para addActionListener

      // configura rightJButton e registra o listener
      rightJButton = new JButton( "Right" ); // cria botão Right
      add( rightJButton ); // adiciona botão Right ao frame
      rightJButton.addActionListener(

         new ActionListener() // classe interna anônima
         {  
            // processo evento rightJButton
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.RIGHT );

               // realinha os componentes anexados
               layout.layoutContainer( container );
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim da chamada para addActionListener
   } // fim do construtor FlowLayoutFrame
} // FlowLayoutFrame fim da classe


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