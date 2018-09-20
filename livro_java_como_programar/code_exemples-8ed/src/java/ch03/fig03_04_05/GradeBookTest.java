// Fig. 3.5: GradeBookTest.Java
// Cria objeto GradeBook e passa uma String para
// seu método displayMessage.

package ch03.fig03_04_05;

import java.util.Scanner; // programa utiliza Scanner

public class GradeBookTest
{
   // método main inicia a execução de programa
   public static void main( String args[] )
   { 
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      // cria um objeto GradeBook e o atribui a myGradeBook
      GradeBook myGradeBook = new GradeBook(); 

      // prompt para entrada do nome do curso
      System.out.println( "Please enter the course name:" );
      String courseName = input.nextLine(); // lê uma linha de texto
      System.out.println(); // gera saída de uma linha em branco

      // chama método displayMessage de myGradeBook
      // e passa courseName como um argumento
      myGradeBook.displayMessage( courseName );
   } // fim de main

} // fim da classe GradeBookTest


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
