// Fig. 4.12: Analysis.Java
// Análise dos resultados dos exames.

package ch04.Fig04_12_13;

import java.util.Scanner; // classe utiliza a classe Scanner

public class Analysis 
{
   public void processExamResults()
   {
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      // inicializando variáveis nas declarações
      int passes = 0; // número de aprovações
      int failures = 0; // número de reprovações
      int studentCounter = 1; // contador de alunos
      int result; // um resultado do exame (obtém o valor a partir do usuário)

      // processa 10 alunos utilizando o loop controlado por contador
      while ( studentCounter <= 10 ) 
      {
         // solicita ao usuário uma entrada e obtém valor fornecido pelo usuário
         System.out.print( "Enter result (1 = pass, 2 = fail): " );
         result = input.nextInt();

         // if...else aninhado em while
         if ( result == 1 )          // if resultar 1,
            passes = passes + 1;     // incrementa aprovações;
         else                        // else resultado não é 1, então
            failures = failures + 1; // incrementa reprovações

         // incrementa studentCounter até o loop terminar
         studentCounter = studentCounter + 1;  
      } // fim do while

      // fase de término; prepara e exibe os resultados
      System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

      // determina se mais de 8 alunos foram aprovados
      if ( passes > 8 )
         System.out.println( "Raise Tuition" );
   } // fim do método processExamResults

} // fim da classe Analysis


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
