// Fig. 8.21: MyLine.java
// Declaração da classe MyLine.

package ch08.fig08_21_23;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
   private int x1; // coordenada x da primeira extremidade final
   private int y1; // coordenada y da primeira extremidade final
   private int x2; // coordenada x da segunda extremidade final
   private int y2; // coordenada y da segunda extremidade final
   private Color myColor; // cor dessa forma

   // construtor com valores de entrada
   public MyLine( int x1, int y1, int x2, int y2, Color color )
   {
      this.x1 = x1; // configura a coordenada x da primeira extremidade final
      this.y1 = y1; // configura a coordenada y da primeira extremidade final
      this.x2 = x2; // configura a coordenada x da segunda extremidade final
      this.y2 = y2; // configura a coordenada y da segunda extremidade final
      myColor = color; // configura a cor
   } // fim do construtor MyLine
   
   // Desenha a linha na cor especificada
   public void draw( Graphics g )
   {
      g.setColor( myColor );
      g.drawLine( x1, y1, x2, y2 );
   } // fim do m�todo draw
} // fim da classe MyLine


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