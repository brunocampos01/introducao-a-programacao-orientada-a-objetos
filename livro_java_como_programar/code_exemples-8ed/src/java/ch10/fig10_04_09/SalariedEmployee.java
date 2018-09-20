// Fig. 10.5: SalariedEmployee.java
// Classe SalariedEmployee estende Employee.

package ch10.fig10_04_09;

public class SalariedEmployee extends Employee
{
   private double weeklySalary;

   // construtor com quatro argumentos
   public SalariedEmployee( String first, String last, String ssn, 
      double salary )
   {
      super( first, last, ssn ); // passa para o construtor Employee
      setWeeklySalary( salary ); // valida e armazena o salário
   } // fim do construtor SalariedEmployee com quatro argumentos

   // configura o salário
   public void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } // fim do método setWeeklySalary

   // retorna o salário
   public double getWeeklySalary()
   {
      return weeklySalary;
   } // fim do método getWeeklySalary

   // calcula os rendimentos; sobrescreve o método earnings em Employee
   public double earnings()                                            
   {                                                                   
      return getWeeklySalary();                                        
   } // fim do método earnings

   // retorna a representação String do objeto SalariedEmployee
   public String toString()                                     
   {                                                            
      return String.format( "salaried employee: %s\n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary() );
   } // fim do método toString
} // fim da classe SalariedEmployee


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