// Fig. 11.25: MultipleSelectionFrame.java
// Copiando itens de uma Lista para outra.

package ch11.fig11_25_26;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame 
{
   private JList colorJList; // lista para armazenar nomes de cor
   private JList copyJList; // lista para copiar nomes de cor em
   private JButton copyJButton; // botão para copiar nomes selecionados
   private final String colorNames[] = { "Black", "Blue", "Cyan", 
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow" };

   // construtor MultipleSelectionFrame
   public MultipleSelectionFrame()
   {
      super( "Multiple Selection Lists" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      colorJList = new JList( colorNames ); // armazena nomes de todas as cores
      colorJList.setVisibleRowCount( 5 ); // mostra cinco linhas
      colorJList.setSelectionMode(                        
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
      add( new JScrollPane( colorJList ) ); // adiciona lista com scrollpane

      copyJButton = new JButton( "Copy >>>" ); // cria botão de cópia
      copyJButton.addActionListener(

         new ActionListener() // classe interna anônima
         {  
            // trata evento de botão
            public void actionPerformed( ActionEvent event )
            {
               // coloca valores selecionados na copyJList
               copyJList.setListData( colorJList.getSelectedValues() );
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim da chamada para addActionListener

      add( copyJButton ); // adiciona botão de cópia ao JFrame

      copyJList = new JList(); // cria lista para armazenar nomes de cor copiados
      copyJList.setVisibleRowCount( 5 ); // mostra 5 linhas
      copyJList.setFixedCellWidth( 100 ); // configura a largura
      copyJList.setFixedCellHeight( 15 ); // configura a altura
      copyJList.setSelectionMode(                       
         ListSelectionModel.SINGLE_INTERVAL_SELECTION );
      add( new JScrollPane( copyJList ) ); // adiciona lista com scrollpane
   } // fim do construtor MultipleSelectionFrame
} // fim da classe MultipleSelectionFrame


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