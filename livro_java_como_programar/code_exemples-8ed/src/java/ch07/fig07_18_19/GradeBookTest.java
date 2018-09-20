// Fig. 7.19: GradeBookTest.Java
// Cria objeto GradeBook utilizando um array bidimensional de notas.

package ch07.fig07_18_19;

public class GradeBookTest
{
   // método main inicia a execução de programa
   public static void main( String args[] )
   {
      // array bidimensional de notas de aluno
      int gradesArray[][] = { { 87, 96, 70 },
                              { 68, 87, 90 },
                              { 94, 100, 90 },
                              { 100, 81, 82 },
                              { 83, 65, 85 },
                              { 78, 87, 65 },
                              { 85, 75, 83 },
                              { 91, 94, 100 },
                              { 76, 72, 84 },
                              { 87, 93, 73 } };
      
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