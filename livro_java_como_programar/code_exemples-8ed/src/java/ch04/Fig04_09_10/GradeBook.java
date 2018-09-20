// Fig. 4.9: GradeBook.java
// Classe GradeBook que resolve o programa da média da classe utilizando
// repetição controlado por sentinela.

package ch04.Fig04_09_10;

import java.util.Scanner; // programa utiliza a classe Scanner

public class GradeBook 
{
   private String courseName; // nome do curso que essa GradeBook representa

   // construtor inicializa courseName
   public GradeBook( String name )
   {
      courseName = name; // inicializa courseName
   } // fim do construtor

   // método para configurar o nome do curso
   public void setCourseName( String name )
   {
      courseName = name; // armazena o nome do curso
   } // fim do método setCourseName

   // método para recuperar o nome do curso
   public String getCourseName()
   {
      return courseName;
   } // fim do método getCourseName

   // exibe uma mensagem de boas-vindas para o usuério GradeBook
   public void displayMessage()
   {
      // getCourseName obtém o nome do curso
      System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
         getCourseName() );
   } // fim do método displayMessage

   // determina a média de um número arbitrário de notas
   public void determineClassAverage()
   {
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      int total; // soma das notas
      int gradeCounter; // número de notas inseridas
      int grade; // valor da nota
      double average; // número com ponto de fração decimal para a média

      // fase de inicialização
      total = 0; // inicializa o total
      gradeCounter = 0; // inicializa o contador de loops
      
      // fase de processamento
      // solicita entrada e lê a nota do usuário
      System.out.print( "Enter grade or -1 to quit: " );
      grade = input.nextInt();                          

      // faz um loop até ler o valor de sentinela inserido pelo usu�rio
      while ( grade != -1 ) 
      {
         total = total + grade; // adiciona grade a total
         gradeCounter = gradeCounter + 1; // incrementa counter

         // solicita entrada e lê a próxima nota fornecida pelo usu�rio
         System.out.print( "Enter grade or -1 to quit: " );
         grade = input.nextInt();                          
      } // fim do while

      // fase de término
      // se usuário inseriu pelo menos uma nota...
      if ( gradeCounter != 0 ) 
      {
         // calcula a média de todas as notas inseridas
         average = (double) total / gradeCounter;  

         // exibe o total e a média (com dois dígitos de precis�o)
         System.out.printf( "\nTotal of the %d grades entered is %d\n", 
            gradeCounter, total );
         System.out.printf( "Class average is %.2f\n", average ); 
      } // fim do if
      else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
         System.out.println( "No grades were entered" ); 
   } // fim do método determineClassAverage

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
