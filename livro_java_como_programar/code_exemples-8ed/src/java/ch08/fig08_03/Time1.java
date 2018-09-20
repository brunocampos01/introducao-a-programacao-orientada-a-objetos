// Fig. 8.1: Time1.java
// Declaração de classe Time1 mantém a data/hora no formato de 24 horas.

package ch08.fig08_03;

public class Time1  
{
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // configura um novo valor de data/hora usando UTC; assegura que
   // os dados permaneçam consistentes configurando valores inválidos como zero
   public void setTime( int h, int m, int s )
   {
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 );   // valida horas
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); // valida minutos
      second = ( ( s >= 0 && s < 60 ) ? s : 0 ); // valida segundos
   } // fim do método setTime

   // converte em String no formato de data/hora universal (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format( "%02d:%02d:%02d", hour, minute, second );
   } // fim do método do toUniversalString

   // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s",            
         ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
         minute, second, ( hour < 12 ? "AM" : "PM" ) );   
   } // fim do método toString
} // fim da classe Time1


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
