package ch04.ex04_26;

public class Mystery3 
{
   public static void main( String args[] )
   {
      int row = 10;
      int column;

      while ( row >= 1 ) 
      {
         column = 1;

         while ( column <= 10 ) 
         {
            System.out.print( row % 2 == 1 ? "<" : ">" );
            ++column;
         } // fim do while

         --row;
         System.out.println();
      } // fim do while
   } // fim de main

} // fim da classe Mystery3


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