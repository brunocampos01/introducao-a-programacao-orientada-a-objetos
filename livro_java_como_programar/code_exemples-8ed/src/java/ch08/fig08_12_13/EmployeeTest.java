// Fig. 8.13: EmployeeTest.java
// Demonstração do membro static.

package ch08.fig08_12_13;

public class EmployeeTest 
{
   public static void main( String args[] )
   {
      // mostra que a contagem é 0 antes de criar Employees
      System.out.printf( "Employees before instantiation: %d\n",
         Employee.getCount());

      // cria dois Employees; a contagem deve ser 2
      Employee e1 = new Employee( "Susan", "Baker" );
      Employee e2 = new Employee( "Bob", "Blue" );   
    
      // mostra que a contagem é 2 depois de criar dois Employees
      System.out.println( "\nEmployees after instantiation: " );
      System.out.printf( "via e1.getCount(): %d\n", e1.getCount());
      System.out.printf( "via e2.getCount(): %d\n", e2.getCount());
      System.out.printf( "via Employee.getCount(): %d\n", 
         Employee.getCount());
   
      // obtém nomes de Employees
      System.out.printf( "\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n",
         e1.getFirstName(), e1.getLastName(), 
         e2.getFirstName(), e2.getLastName() );

      // nesse exemplo, há somente uma referência a cada Employee,
      // assim as duas instruções a seguir fazem com que a JVM marque cada
      // objeto Employee para coleta de lixo
      e1 = null;                                                       
      e2 = null;                                                       

      System.gc(); // pede que a coleta de lixo ocorra agora

      // mostra a contagem de Employee depois de chamar o coletor de lixo; contagem
      // exibida pode ser 0, 1 ou 2 com base na execução do coletor de lixo
      // imediata e número de objetos Employees coletados
      System.out.printf( "\nEmployees after System.gc(): %d\n", 
         Employee.getCount());
   } // fim de main
} // fim da classe EmployeeTest


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