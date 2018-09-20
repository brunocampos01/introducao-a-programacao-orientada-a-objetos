// Fig. 10.9: PayrollSystemTest.java
// Programa de teste da hierarquia Employee.

package ch10.fig10_04_09;

public class PayrollSystemTest 
{
   public static void main( String args[] ) 
   {
      // cria objetos de subclasse                                           
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );  
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", 10000, .06 );                     
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );                 

      System.out.println( "Employees processed individually:\n" );

      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         salariedEmployee, "earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings() );

      // cria um array Employee de quatro elementos
      Employee employees[] = new Employee[ 4 ];

      // inicializa o array com Employees          
      employees[ 0 ] = salariedEmployee;          
      employees[ 1 ] = hourlyEmployee;            
      employees[ 2 ] = commissionEmployee;        
      employees[ 3 ] = basePlusCommissionEmployee;

      System.out.println( "Employees processed polymorphically:\n" );

      // processa genericamente cada elemento no employees
      for ( Employee currentEmployee : employees ) 
      {
         System.out.println(currentEmployee); // invoca toString

         // determina se elemento é um BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast da referência de Employee para
            // referência a BasePlusCommissionEmployee
            BasePlusCommissionEmployee employee = 
                ( BasePlusCommissionEmployee ) currentEmployee;

            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary( 1.10 * oldBaseSalary );
            System.out.printf( 
               "new base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary() );
         } // fim do if

         System.out.printf( 
            "earned $%,.2f\n\n", currentEmployee.earnings());
      } // for final

      // obtém o nome do tipo de cada objeto no array employees
      for ( int j = 0; j < employees.length; j++ )      
         System.out.printf( "Employee %d is a %s\n", j,
            employees[ j ].getClass().getName() );      
   } // fim de main
} // fim da classe PayrollSystemTest


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