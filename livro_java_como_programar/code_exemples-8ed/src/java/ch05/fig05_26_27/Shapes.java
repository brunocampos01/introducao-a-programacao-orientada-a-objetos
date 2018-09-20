// Fig. 5.26: Shapes.java
// Demonstra o desenho de diferentes formas.

package ch05.fig05_26_27;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
   private int choice; // escolha do usuário de qual forma desenhar
   
   // construtor configura a escolha do usuário
   public Shapes( int userChoice )
   {
      choice = userChoice;
   } // fim do construtor Shapes
   
   // desenha uma cascata de formas que iniciam do canto superior esquerdo 
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      for ( int i = 0; i < 10; i++ )
      {
         // seleciona a forma com base na escolha do usuário
         switch ( choice )
         {
            case 1: // desenha retângulos 
               g.drawRect( 10 + i * 10, 10 + i * 10,
                  50 + i * 10, 50 + i * 10 );        
               break;
            case 2: // desenha elipses 
               g.drawOval( 10 + i * 10, 10 + i * 10,
                  50 + i * 10, 50 + i * 10 );        
               break;
         } // switch final
      } // for final
   } // fim do método paintComponent
} // fim da classe Shapes


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