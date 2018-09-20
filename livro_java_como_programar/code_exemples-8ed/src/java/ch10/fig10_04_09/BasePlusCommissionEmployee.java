// Fig. 10.8: BaseplusCommissionEmployee.java
// Classe BasePlusCommissionEmployee estende a CommissionEmployee.

package ch10.fig10_04_09;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // salário de base por semana

   // construtor de seis argumentos
   public BasePlusCommissionEmployee( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); // valida e armazena salário-base
   } // fim do construtor BasePlusCommissionEmployee de seis argumentos

   // configura o salário-base
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // não-negativo
   } // fim do método setBaseSalary

   // retorna o salário-base
   public double getBaseSalary()
   {
      return baseSalary;
   } // fim do método getBaseSalary

   // calcula os vencimentos; sobrescreve o método earnings em CommissionEmployee
   public double earnings()                                             
   {                                                                    
      return getBaseSalary() + super.earnings();                        
   } // fim do método earnings

   // retorna a representação String do objeto BasePlusCommissionEmployee
   public String toString()                                            
   {                                                                   
      return String.format( "%s %s; %s: $%,.2f",                       
         "base-salaried", super.toString(),                            
         "base salary", getBaseSalary() );                             
   } // fim do método toString
} // fim da classe BasePlusCommissionEmployee 


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