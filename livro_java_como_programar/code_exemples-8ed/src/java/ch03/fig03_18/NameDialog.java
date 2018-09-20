// Fig. 3.18: NameDialog.Java
// Entrada básica com uma caixa de diálogo.

package ch03.fig03_18;

import javax.swing.JOptionPane;

public class NameDialog
{
   public static void main( String args[] )
   {
      // pede para o usuário inserir seu nome
      String name =
         JOptionPane.showInputDialog( "What is your name?" );
      
      // cria a mensagem
      String message =                                              
         String.format( "Welcome, %s, to Java Programming!", name );

      // exibe a mensagem para cumprimentar o usuário pelo nome
      JOptionPane.showMessageDialog( null, message );
   } // fim de main
} // termina NameDialog


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