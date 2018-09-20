// Fig. 9.15: CommissionEmployee4.java
// Classe CommissionEmployee4 representa um empregado comissionado.

package ch09.fig09_15_17;

public class CommissionEmployee4
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private double grossSales; // vendas brutas semanais       
   private double commissionRate; // porcentagem da comissão

   // construtor de cinco argumentos
   public CommissionEmployee4( String first, String last, String ssn, 
      double sales, double rate )
   {
      // chamada implícita para o construtor Object ocorre aqui
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      setGrossSales( sales ); // valida e armazena as vendas brutas       
      setCommissionRate( rate ); // valida e armazena a taxa de comissão

      System.out.printf(                                    
         "\nCommissionEmployee4 constructor:\n%s\n", this );
   } // fim do construtor CommissionEmployee4 de cinco argumentos

   // configura o nome 
   public void setFirstName( String first )
   {
      firstName = first;
   } // fim do método setFirstName

   // retorna o nome
   public String getFirstName()
   {
      return firstName;
   } // fim do método getFirstName

   // configura o sobrenome 
   public void setLastName( String last )
   {
      lastName = last;
   } // fim do método setLastName

   // retorna o sobrenome
   public String getLastName()
   {
      return lastName;
   } // fim do método getLastName

   // configura o CIC 
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // deve validar
   } // fim do método setSocialSecurityNumber

   // retorna o CIC
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // fim do método getSocialSecurityNumber

   // configura a quantidade de vendas brutas
   public void setGrossSales( double sales )
   {
      grossSales = ( sales < 0.0 ) ? 0.0 : sales;
   } // fim do método setGrossSales

   // retorna a quantidade de vendas brutas 
   public double getGrossSales()
   {
      return grossSales;
   } // fim do método getGrossSales
   
   // configura a taxa de comissão
   public void setCommissionRate( double rate )
   {
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   } // fim do método setCommissionRate

   // retorna a taxa de comissão
   public double getCommissionRate()
   {
      return commissionRate;
   } // fim do método getCommissionRate

   // calcula os lucros                 
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } // fim do método earnings

   // retorna a representação String de objeto CommissionEmployee4
   public String toString()
   {
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate() );
   } // fim do método toString
} // fim da classe CommissionEmployee4 


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