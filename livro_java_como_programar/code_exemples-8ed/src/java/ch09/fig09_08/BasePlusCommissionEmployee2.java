// Fig. 9.8: BasePlusCommissionEmployee2.java
// BasePlusCommissionEmployee2 herda da classe CommissionEmployee.

package ch09.fig09_08;

public class BasePlusCommissionEmployee2 extends CommissionEmployee
{
   private double baseSalary; // salário-base por semana

   // construtor de seis argumentos
   public BasePlusCommissionEmployee2( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      // chamada explícita para o construtor CommissionEmployee da superclasse
      super( first, last, ssn, sales, rate );                      

      setBaseSalary( salary ); // valida e armazena salário-base
   } // fim do construtor BasePlusCommissionEmployee2 de seis argumentos
   
   // configura o salário-base
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
   } // fim do método setBaseSalary

   // retorna o salário-base
   public double getBaseSalary()
   {
      return baseSalary;
   } // fim do método getBaseSalary

   // calcula os lucros                 
   public double earnings()
   {
      // não permitido: commissionRate e grossSales private em superclasse
      return baseSalary + ( commissionRate * grossSales );               
   } // fim do método earnings

   // retorna a representação String de BasePlusCommissionEmployee2
   public String toString()
   {
      // não permitido: tenta acessar membros private da superclasse
      return String.format(                                           
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",           
         "base-salaried commission employee", firstName, lastName,    
         "social security number", socialSecurityNumber,              
         "gross sales", grossSales, "commission rate", commissionRate,
         "base salary", baseSalary );                                 
   } // fim do método toString
} // fim da classe BasePlusCommissionEmployee2 


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
