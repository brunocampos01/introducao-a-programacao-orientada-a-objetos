// Fig. 11.43: GridLayoutFrame.java
// Demonstrando GridLayout.

package ch11.fig11_43_44;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame implements ActionListener 
{
   private JButton buttons[]; // array de botões
   private final String names[] = 
      { "one", "two", "three", "four", "five", "six" };
   private boolean toggle = true; // alterna entre dois layouts
   private Container container; // contâiner do frame
   private GridLayout gridLayout1; // primeiro gridlayout
   private GridLayout gridLayout2; // segundo gridlayout

   // construtor sem argumento
   public GridLayoutFrame()
   {
      super( "GridLayout Demo" );
      gridLayout1 = new GridLayout( 2, 3, 5, 5 ); // 2 por 3; lacunas de 5
      gridLayout2 = new GridLayout( 3, 2 ); // 3 por 2; nenhuma lacuna
      container = getContentPane(); // obtém painel de conteúdo
      setLayout( gridLayout1 ); // configura o layout JFrame
      buttons = new JButton[ names.length ]; // cria array de JButtons

      for ( int count = 0; count < names.length; count++ )
      {
         buttons[ count ] = new JButton( names[ count ] );
         buttons[ count ].addActionListener( this ); // registra o listener
         add( buttons[ count ] ); // adiciona o botõo ao JFrame
      } // for final
   } // fim do construtor GridLayoutFrame

   // trata eventos de botão alternando entre layouts
   public void actionPerformed( ActionEvent event )
   { 
      if ( toggle )
         container.setLayout( gridLayout2 ); // configura layout como segundo
      else
         container.setLayout( gridLayout1 ); // configura layout como primeiro

      toggle = !toggle; // alterna para valor oposto
      container.validate(); // refaz o layout do contâiner
   } // fim do método actionPerformed
} // fim da classe GridLayoutFrame


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