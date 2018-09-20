// Fig. 3.7: GradeBook.java
// classe GradeBook que contÉm uma variÁvel de instÂncia courseName
// e métodos para configurar e obter seu valor.

package ch03.fig03_07_08;

public class GradeBook
{
   private String courseName; // nome do curso para esse GradeBook
 
   // método para configurar o nome do curso
   public void setCourseName( String name )      
   {                                             
      courseName = name; // armazena o nome do curso
   } // termina o método setCourseName

   // método para recuperar o nome do curso
   public String getCourseName()        
   {                                    
      return courseName;                
   } // termina o método getCourseName

   // exibe uma mensagem de boas-vindas para o usuário GradeBook
   public void displayMessage()
   {
      // essa instrução chama getCourseName para obter o
      // nome do curso que esse GradeBook representa
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
   } // termina o método displayMessage

} // fim da classe GradeBook


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
