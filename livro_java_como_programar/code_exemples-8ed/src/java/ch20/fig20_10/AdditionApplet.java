// Fig. 20.10: AdditionApplet.java
// Adicionando dois números de ponto flutuante.
import java.awt.Graphics;       // o programa utiliza a classe Graphics
import javax.swing.JApplet;     // o programa utiliza a classe JApplet
import javax.swing.JOptionPane; // o programa utiliza a classe JOptionPane

public class AdditionApplet extends JApplet 
{
   private double sum; // soma dos valores inseridos pelo usuário

   // inicializa um applet obtendo os valores inseridos pelo usuário
   public void init()
   {
      String firstNumber;  // primeira string inserida pelo usuário
      String secondNumber; // segunda string inserida pelo usuário

      double number1; // primeiro número a adicionar
      double number2; // segundo número a adicionar

      // obtém do usuário o primeiro número
      firstNumber = JOptionPane.showInputDialog(
         "Enter first floating-point value" );

      // obtém do usuário o segundo número 
      secondNumber = JOptionPane.showInputDialog(
         "Enter second floating-point value" );

      // converte os números de tipo String para tipo double
      number1 = Double.parseDouble( firstNumber );      
      number2 = Double.parseDouble( secondNumber );     

      sum = number1 + number2; // soma os números
   } // fim do método init

   // desenha os resultados em um retângulo sobre o fundo do applet
   public void paint( Graphics g )
   {
      super.paint( g ); // chama a versão da superclasse do método paint

      // desenha um retângulo iniciando em (15, 10) que tem 270
      // pixels de largura e 20 pixels de altura
      g.drawRect( 15, 10, 270, 20 );

      // desenha os resultados como uma String em (25, 25)
      g.drawString( "The sum is " + sum, 25, 25 );
   } // fim do método paint
} // fim da classe AdditionApplet


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