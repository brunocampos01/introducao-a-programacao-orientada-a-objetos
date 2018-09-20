// Fig. 10.4: Employee.java
// Superclasse abstrata Employee.

package ch10.fig10_04_09;

public abstract class Employee
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // construtor com três argumentos
   public Employee( String first, String last, String ssn )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } // fim do construtor Employee com três argumentos

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

   // retorna a representação de String do objeto Employee
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber() );
   } // fim do método toString

   // método abstrato sobrescrito pelas subclasses
   public abstract double earnings(); // nenhuma implementação aqui
} // fim da classe abstrata Employee 


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