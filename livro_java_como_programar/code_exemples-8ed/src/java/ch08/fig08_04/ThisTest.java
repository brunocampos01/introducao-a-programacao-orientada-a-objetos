// Fig. 8.4: ThisTest.java
// this utilizado implícita e explicitamente para referência a membros de um objeto.

package ch08.fig08_04;

public class ThisTest 
{
   public static void main( String args[] )
   {
      SimpleTime time = new SimpleTime( 15, 30, 19 );
      System.out.println( time.buildString() );
   } // fim de main
} // fim da classe ThisTest

// classe SimpleTime demonstra a referência "this"
class SimpleTime 
{
   private int hour;   // 0-23
   private int minute; // 0-59
   private int second; // 0-59 

   // se o construtor utilizar nomes de parâmetro idênticos a
   // nomes de variáveis de instância a referência "this" será
   // exigida para distinguir entre nomes
   public SimpleTime( int hour, int minute, int second )
   {
      this.hour = hour;      // configura a hora do objeto "this" 
      this.minute = minute;  // configura os minuto do objeto "this" 
      this.second = second;  // configura os segundo do objeto "this" 
   } // fim do construtor SimpleTime

   // utilizam "this" explícito e implícito para chamar toUniversalString
   public String buildString()
   {
      return String.format( "%24s: %s\n%24s: %s", 
         "this.toUniversalString()", this.toUniversalString(),
         "toUniversalString()",toUniversalString());
   } // fim do método buildString

   // converte em String no formato de data/hora universal (HH:MM:SS)
   public String toUniversalString()
   {
      // "this" não é requerido aqui para acessar variáveis de instância,
      // porque o método não tem variáveis locais com os mesmos
      // nomes das variáveis de instância
      return String.format( "%02d:%02d:%02d", 
         this.hour, this.minute, this.second );
   } // fim do método do toUniversalString
} // fim da classe SimpleTime


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