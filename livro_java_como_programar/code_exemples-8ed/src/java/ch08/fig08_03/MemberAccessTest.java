// Fig. 8.3: MemberAccessTest.java
// Membros privados da classe Time1 não são acessíveis.

package ch08.fig08_03;

public class MemberAccessTest 
{
   public static void main( String args[] )
   {
      Time1 time = new Time1(); // cria e inicializa o objeto Time1

      time.hour = 7;    // erro: hour tem acesso privado em Time1  
      time.minute = 15; // erro: minute tem acesso privado em Time1
      time.second = 30; // erro: second tem acesso privado em in Time1
   } // fim de main
} // fim da classe MemberAccessTest


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