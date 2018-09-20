// Fig. 10.6: HourlyEmployee.java
// Classe HourlyEmployee estende Employee.

package ch10.fig10_04_09;

public class HourlyEmployee extends Employee
{
   private double wage; // salário por hora
   private double hours; // horas trabalhadas durante a semana

   // construtor de cinco argumentos
   public HourlyEmployee( String first, String last, String ssn,
      double hourlyWage, double hoursWorked )
   {
      super( first, last, ssn );
      setWage( hourlyWage ); // valida a remuneração por hora
      setHours( hoursWorked ); // valida as horas trabalhadas
   } // fim do construtor HourlyEmployee com cinco argumentos

   // configura a remuneração
   public void setWage( double hourlyWage )
   {
      wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
   } // fim do método setWage

   // retorna a remuneração
   public double getWage()
   {
      return wage;
   } // fim do método getWage

   // configura as horas trabalhadas
   public void setHours( double hoursWorked )
   {
      hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
         hoursWorked : 0.0;
   } // fim do método setHours

   // retorna as horas trabalhadas
   public double getHours()
   {
      return hours;
   } // fim do método getHours

   // calcula os rendimentos; sobrescreve o método earnings em Employee
   public double earnings()                                            
   {                                                                   
      if ( getHours() <= 40 ) // nenhuma hora extra                           
         return getWage() * getHours();                                
      else                                                             
         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
   } // fim do método earnings

   // retorna a representação de String do objeto HourlyEmployee
   public String toString()                                              
   {                                                                     
      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),                     
         "hours worked", getHours() );                                   
   } // fim do método toString
} // fim da classe HourlyEmployee


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
