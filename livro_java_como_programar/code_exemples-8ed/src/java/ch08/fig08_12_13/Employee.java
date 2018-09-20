// Fig. 8.12: Employee.java
// Variável estática utilizada para manter uma contagem do número de
// objetos Employee na memória.

package ch08.fig08_12_13;

public class Employee 
{
   private String firstName;
   private String lastName;
   private static int count = 0; // número de objetos na memória

   // inicializa Employee, adiciona 1 a static count e
   // gera a saída de String indicando que o construtor foi chamado
   public Employee( String first, String last )
   {
      firstName = first;
      lastName = last;

      count++;  // incrementa contagem estática de empregados
      System.out.printf( "Employee constructor: %s %s; count = %d\n",
         firstName, lastName, count );
   } // fim do construtor Employee

   // subtrai 1 de static count quando o coletor de lixo
   // chama finalize para limpar o objeto;
   // confirma se finalize foi chamado
   protected void finalize()
   {
      count--; // decrementa contagem estática de empregados
      System.out.printf( "Employee finalizer: %s %s; count = %d\n",
         firstName, lastName, count );
   } // fim do método finalize

   // obtém o primeiro nome
   public String getFirstName() 
   { 
      return firstName; 
   } // fim do método getFirstName

   // obtém o ultimo nome
   public String getLastName() 
   { 
      return lastName; 
   } // fim do método getLastName

   // método estático obter valor de contagem de estática
   public static int getCount()              
   {                                         
      return count;                          
   } // fim do método getCount
} // fim da classe Employee


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