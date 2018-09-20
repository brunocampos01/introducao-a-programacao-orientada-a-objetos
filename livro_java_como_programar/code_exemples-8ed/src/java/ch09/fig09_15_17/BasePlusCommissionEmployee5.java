// Fig. 9.16: BasePlusCommissionEmployee5.java
// Declaração de classe BasePlusCommissionEmployee5.

package ch09.fig09_15_17;

public class BasePlusCommissionEmployee5 extends CommissionEmployee4
{
   private double baseSalary; // salário-base por semana

   // construtor de seis argumentos
   public BasePlusCommissionEmployee5( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); // valida e armazena salário-base
   
      System.out.printf(                                            
         "\nBasePlusCommissionEmployee5 constructor:\n%s\n", this );
   } // fim do construtor BasePlusCommissionEmployee5 de seis argumentos
   
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
      return getBaseSalary() + super.earnings();
   } // fim do método earnings

   // retorna a representação String de BasePlusCommissionEmployee5
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "base-salaried", 
         super.toString(), "base salary", getBaseSalary() );
   } // fim do método toString
} // fim da classe BasePlusCommissionEmployee5 


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