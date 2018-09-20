// Fig. 7.14: GradeBook.java
// Grade book utilizando um array para armazenar notas de teste.

package ch07.fig07_14_15;

public class GradeBook
{
   private String courseName; // nome do curso que essa GradeBook representa
   private int grades[]; // array de notas de aluno
   
   // construtor de dois argumentos inicializa courseName e array de notas
   public GradeBook( String name, int gradesArray[])
   {
      courseName = name; // inicializa courseName
      grades = gradesArray; // níveis de armazenamento
   } // fim do construtor GradeBook de dois argumentos

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

   // exibe uma mensagem de boas-vindas para o usuário GradeBook
   public void displayMessage()
   {
      // getCourseName obtém o nome do curso
      System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
         getCourseName() );
   } // fim do método displayMessage

   // realiza várias operações nos dados
   public void processGrades()
   {
      // gera saída de array de notas
      outputGrades();

      // chama método getAverage para calcular a média
      System.out.printf( "\nClass average is %.2f\n", getAverage()); 

      // chama métodos getMinimum e getMaximum
      System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",
         getMinimum(),getMaximum());

      // chama outputBarChart para imprimir gráfico de distribuição de nota
      outputBarChart();
   } // fim do método processGrades

   // localiza nota mínima
   public int getMinimum()
   { 
      int lowGrade = grades[ 0 ]; // assume que grades[ 0 ] é a menor nota

      // faz um loop pelo array de notas
      for ( int grade : grades )                               
      {                                                        
         // se nota for mais baixa que lowGrade, atribui-a a lowGrade
         if ( grade < lowGrade )                               
            lowGrade = grade; // nova nota mais baixa
      } // for final

      return lowGrade; // retorna nota mais baixa
   } // fim do método getMinimum

   // localiza nota máxima
   public int getMaximum()
   { 
      int highGrade = grades[ 0 ]; // assume que grades[ 0 ] é a maior nota

      // faz um loop pelo array de notas
      for ( int grade : grades )
      {
         // se a nota for maior que highGrade, atribui essa nota a highGrade
         if ( grade > highGrade )
            highGrade = grade; // nova nota mais alta
      } // for final

      return highGrade; // retorna nota mais alta
   } // fim do método getMaximum

   // determina média para o teste
   public double getAverage()
   {      
      int total = 0; // inicializa o total
 
      // soma notas de um aluno
      for ( int grade : grades )   
         total += grade;           

      // retorna média de notas
      return (double) total / grades.length;
   } // fim do método getAverage

   // gera a saída do gráfico de barras exibindo distribui��o de notas
   public void outputBarChart()
   {
      System.out.println( "Grade distribution:" );

      // armazena freq��ncia de notas em cada intervalo de 10 notas
      int frequency[] = new int[ 11 ];
      
      // para cada nota, incrementa a freq��ncia apropriada
      for ( int grade : grades )                            
         ++frequency[ grade / 10 ];                         

      // para cada freq��ncia de nota, imprime barra no gr�fico
      for ( int count = 0; count < frequency.length; count++ )
      {
         // gera sa�da do r�tulo de barra ( "00-09: ", ..., "90-99: ", "100: " )
         if ( count == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               count * 10, count * 10 + 9  ); 
         
         // imprime a barra de asteriscos
         for ( int stars = 0; stars < frequency[ count ]; stars++ )
            System.out.print( "*" );

         System.out.println(); // inicia uma nova linha de sa�da
      } // fim do for externo 
   } // fim do m�todo outputBarChart

   // gera a sa�da do conte�do do array de notas
   public void outputGrades()
   {    
      System.out.println( "The grades are:\n" );

      // gera a sa�da da nota de cada aluno
      for ( int student = 0; student < grades.length; student++ )
         System.out.printf( "Student %2d: %3d\n",                
            student + 1, grades[ student ] );                    
   } // fim do m�todo outputGrades
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