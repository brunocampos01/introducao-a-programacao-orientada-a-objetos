// Fig. 14.5: FileDemonstrationTest.java
// Testando a classe FileDemonstration.

package ch14.fig14_04_05;

import java.util.Scanner;

public class FileDemonstrationTest
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );
      FileDemonstration application = new FileDemonstration();

      System.out.print( "Enter file or directory name here: " );
      application.analyzePath( input.nextLine() );
   } // fim de main
} // fim da classe FileDemonstrationTest


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