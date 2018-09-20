// Fig. 19.10: TimeComparator.java
// Classe Comparator personalizada que compara dois objetos Time2.

package ch19.fig19_10_11;

import java.util.Comparator;

public class TimeComparator implements Comparator< Time2 >
{
   public int compare(Time2 time1, Time2 time2)
   {
      int hourCompare = time1.getHour() - time2.getHour(); // compara hora 
         
      // testa a primeira hora 
      if ( hourCompare != 0 )
         return hourCompare;
         
      int minuteCompare = 
         time1.getMinute() - time2.getMinute(); // compara minuto 
         
      // então testa o minuto
      if ( minuteCompare != 0 )
         return minuteCompare;
         
      int secondCompare = 
         time1.getSecond() - time2.getSecond(); // compara segundo 

      return secondCompare; // retorna o resultado da comparação de segundos
   } // fim do método compare
} // fim da classe TimeComparator 


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
