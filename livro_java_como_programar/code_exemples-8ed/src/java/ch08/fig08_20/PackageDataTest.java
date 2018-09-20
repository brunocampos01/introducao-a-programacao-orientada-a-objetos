// Fig. 8.20: PackageDataTest.java
// Membros de acesso de pacote de uma classe permanecem acessíveis a outras
// classes no mesmo pacote.

package ch08.fig08_20;

public class PackageDataTest 
{
   public static void main( String args[] )
   {
      PackageData packageData = new PackageData();

      // gera saída da representação String de packageData
      System.out.printf( "After instantiation:\n%s\n", packageData );

      // muda os dados de acesso de pacote no objeto packageData
      packageData.number = 77;                           
      packageData.string = "Goodbye";                    

      // gera saída da representação String de packageData
      System.out.printf( "\nAfter changing values:\n%s\n", packageData );
   } // fim de main
} // fim da classe PackageDataTest

// classe com variáveis de instância de acesso de pacote
class PackageData 
{
   int number; // variável de instância de acesso de pacote
   String string; // variável de instância de acesso de pacote

   // construtor
   public PackageData() 
   { 
      number = 0; 
      string = "Hello";
   } // fim do construtor PackageData

   // retorna a representação String do objeto PackageData
   public String toString() 
   {
      return String.format( "number: %d; string: %s", number, string );
   } // fim do método toString
} // fim da classe PackageData


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