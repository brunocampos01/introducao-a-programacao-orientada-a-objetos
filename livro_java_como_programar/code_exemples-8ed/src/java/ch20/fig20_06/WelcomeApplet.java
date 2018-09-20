// Fig. 20.6: WelcomeApplet.java
// Um primeiro applet em Java.

package ch20.fig20_06;

import java.awt.Graphics;   // o programa utiliza a classe Graphics
import javax.swing.JApplet; // o program utiliza class JApplet

public class WelcomeApplet extends JApplet
{
   // desenha texto sobre o fundo do applet
   public void paint( Graphics g )                           
   {                                                         
      // chama a versão da superclasse do método paint
      super.paint( g );                                      
                                                             
      // desenha uma String nas coordenadas x 25 e y 25
      g.drawString( "Welcome to Java Programming!", 25, 25 );
   } // fim do método paint
} // fim da classe WelcomeApplet


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