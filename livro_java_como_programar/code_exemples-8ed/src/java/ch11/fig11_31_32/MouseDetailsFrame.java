// Fig. 11.31: MouseDetailsFrame.java
// Demonstrando cliques de mouse e distinguindo entre botões do mouse.

package ch11.fig11_31_32;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame 
{
   private String details; // representação String
   private JLabel statusBar; // JLabel que aparece na parte inferior da janela

   // construtor configura String de barra de título e registra o listener de mouse
   public MouseDetailsFrame()
   {
      super( "Mouse clicks and buttons" );

      statusBar = new JLabel( "Click the mouse" );
      add( statusBar, BorderLayout.SOUTH );
      addMouseListener( new MouseClickHandler() ); // adiciona handler
   } // fim do construtor MouseDetailsFrame

   // classe interna para tratar eventos de mouse
   private class MouseClickHandler extends MouseAdapter 
   {
      // trata evento de clique de mouse e determina qual botão foi pressionado
      public void mouseClicked( MouseEvent event )
      {
         int xPos = event.getX(); // obtém posição x do mouse
         int yPos = event.getY(); // obtém posição y do mouse

         details = String.format( "Clicked %d time(s)", 
            event.getClickCount());
      
         if (event.isMetaDown()) // botão direito do mouse
            details += " with right mouse button";
         else if (event.isAltDown()) // botão do meio do mouse
            details += " with center mouse button";
         else // botão esquerdo do mouse
            details += " with left mouse button";

         statusBar.setText( details ); // exibe mensagem em statusBar
      } // fim do método mouseClicked
   } // fim da classe interna private MouseClickHandler
} // fim da classe MouseDetailsFrame


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