// Fig. 7.15: GradeBookTest.Java
// Cria objeto GradeBook utilizando um array de notas.

package ch07.fig07_14_15;

public class GradeBookTest
{ 
   // método main inicia a execução de programa
   public static void main( String args[] )
   {
      // array de notas de aluno
      int gradesArray[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      
      GradeBook myGradeBook = new GradeBook( 
         "CS101 Introduction to Java Programming", gradesArray);
      myGradeBook.displayMessage();
      myGradeBook.processGrades();
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