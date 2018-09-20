// Fig. 3.8: GradeBookTest.Java
// Cria e manipula um objeto GradeBook.

package ch03.fig03_07_08;

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

      // exibe valor inicial de courseName
      System.out.printf( "Initial course name is: %s\n\n",
         myGradeBook.getCourseName() );

      // solicita e lê o nome do curso
      System.out.println( "Please enter the course name:" );
      String theName = input.nextLine(); // lê uma linha de texto
      myGradeBook.setCourseName( theName ); // configura o nome do curso
      System.out.println(); // gera saída de uma linha em branco

      // exibe mensagem de boas-vindas depois de especificar nome do curso
      myGradeBook.displayMessage();
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
