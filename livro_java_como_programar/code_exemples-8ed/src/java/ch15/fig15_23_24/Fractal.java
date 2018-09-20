// Fig. 15.23: Fractal.java
// Demonstra a interface com o usuário para desenhar um fractal.

package ch15.fig15_23_24;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;

public class Fractal extends JFrame
{
   private final int WIDTH = 400;  // define a largura de GUI
   private final int HEIGHT = 480; // define a altura de GUI
   private final int MIN_LEVEL = 0, MAX_LEVEL = 15;
   private Color color = Color.BLUE;

   private JButton changeColorJButton, increaseLevelJButton,
      decreaseLevelJButton;
   private JLabel levelJLabel;
   private FractalJPanel drawSpace;
   private JPanel mainJPanel, controlJPanel;

   // configura a GUI
   public Fractal()
   {
      super( "Fractal" );

      // configura o painel de controle
      controlJPanel = new JPanel();
      controlJPanel.setLayout( new FlowLayout() );

      // configura o botão de cor e registra o ouvinte
      changeColorJButton = new JButton( "Color" );
      controlJPanel.add( changeColorJButton );
      changeColorJButton.addActionListener(
         new ActionListener() // classe interna anônima
         {
            // processa o evento changeColorJButton 
            public void actionPerformed( ActionEvent event )
            {
               color = JColorChooser.showDialog(
                  Fractal.this, "Choose a color", color );

               // configura a cor padrão, se nenhuma cor for retornada
               if ( color == null )
                  color = Color.BLUE;

               drawSpace.setColor( color );
            } // fim do método actionPerformed
         }  // fim da classe interna anônima
      ); // fim de addActionListener 

      // configura o botão decrease level para adicionar no controlJPanel
      // ouvinte registrado
      decreaseLevelJButton = new JButton( "Decrease Level" );
      controlJPanel.add( decreaseLevelJButton );
      decreaseLevelJButton.addActionListener(
         new ActionListener() // classe interna anônima
         {
            // processa o evento decreaseLevelJButton 
            public void actionPerformed( ActionEvent event )
            {
               int level = drawSpace.getLevel();
               level--; // diminui o nível por um

               // modifica o nível se possível
               if ( ( level >= MIN_LEVEL ) &&
                  ( level <= MAX_LEVEL ) )
               {
                  levelJLabel.setText( "Level: " + level );
                  drawSpace.setLevel( level );             
                  repaint();                               
               } // fim do if
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim de addActionListener 

      // configura o botão increase level para adicionar no controlJPanel
      // e registra o ouvinte 
      increaseLevelJButton = new JButton( "Increase Level" );
      controlJPanel.add( increaseLevelJButton );
      increaseLevelJButton.addActionListener(
         new ActionListener() // classe interna anônima
         {
            // processa evento increaseLevelJButton 
            public void actionPerformed( ActionEvent event )
            {
               int level = drawSpace.getLevel();
               level++; // aumenta nível por um

               // modifica o nível se possível
               if ( ( level >= MIN_LEVEL ) &&
                  ( level <= MAX_LEVEL ) )
               {
                  levelJLabel.setText( "Level: " + level );
                  drawSpace.setLevel( level );             
                  repaint();                               
               } // fim do if
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim de addActionListener 

      // configura levelJLabel para adicionar ao controlJPanel
      levelJLabel = new JLabel( "Level: 0" );
      controlJPanel.add( levelJLabel );

      drawSpace = new FractalJPanel( 0 );
 
      // cria mainJPanel para conter controlJPanel e drawSpace
      mainJPanel = new JPanel();
      mainJPanel.add( controlJPanel );
      mainJPanel.add( drawSpace );

      add( mainJPanel ); // adiciona JPanel ao JFrame

      setSize( WIDTH, HEIGHT ); // configura o tamanho de JFrame
      setVisible( true ); // exibe JFrame 
   } // fim do construtor Fractal

   public static void main( String args[] )
   {
      Fractal demo = new Fractal();
      demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // fim de main
} // fim da classe Fractal 

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
