// Fig. 8.8: Employee.java
// Classe Employee com referência a outros objetos.

package ch08.fig08_07_09;

public class Employee 
{
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date hireDate;

   // construtor para inicializar nome, data de nascimento e data de contratação
   public Employee( String first, String last, Date dateOfBirth, 
      Date dateOfHire )
   {
      firstName = first;
      lastName = last;
      birthDate = dateOfBirth;
      hireDate = dateOfHire;
   } // fim do construtor Employee

   // converte Employee em formato de String
   public String toString()
   {
      return String.format( "%s, %s  Hired: %s  Birthday: %s", 
         lastName, firstName, hireDate, birthDate );
   } // fim do método toString
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