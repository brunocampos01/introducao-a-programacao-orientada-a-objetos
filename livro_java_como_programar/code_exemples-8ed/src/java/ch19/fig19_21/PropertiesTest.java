// Fig. 19.21: PropertiesTest.java
// Demonstra classe Properties do pacote java.util.

package ch19.fig19_21;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest  
{
   private Properties table;

   // configura GUI para testar a tabela Properties
   public PropertiesTest()
   {
      table = new Properties();// cria tabela Properties

      // configura propriedades                    
      table.setProperty( "color", "blue" );
      table.setProperty( "width", "200" );

      System.out.println( "After setting properties" );
      listProperties(); // exibe os valores da propriedade

      // substitui o valor de propriedade           
      table.setProperty( "color", "red" );

      System.out.println( "After replacing properties" );
      listProperties(); // exibe os valores da propriedade

      saveProperties(); // salva as propriedades

      table.clear(); // tabela vazia

      System.out.println( "After clearing properties" );
      listProperties(); // exibe os valores da propriedade
      
      loadProperties(); // carrega propriedades 

      // obtém valor de cor da propriedade
      Object value = table.getProperty( "color" );

      // verifica se o valor está na tabela
      if ( value != null )
         System.out.printf( "Property color's value is %s\n", value );
      else
         System.out.println( "Property color is not in table" );
   } // fim do construtor PropertiesTest

   // salva as propriedades em um arquivo
   public void saveProperties()
   {
      // salva o conteúdo de tabela
      try
      {
         FileOutputStream output = new FileOutputStream( "props.dat" );
         table.store( output, "Sample Properties" );// salva as propriedades
         output.close();
         System.out.println( "After saving properties" );
         listProperties();
      } // fim do try
      catch ( IOException ioException )
      {
         ioException.printStackTrace();
      } // fim do catch
   } // fim do método saveProperties

   // carrega as propriedades de um arquivo
   public void loadProperties()
   {
      // carrega o conteúdo de tabela
      try
      {
         FileInputStream input = new FileInputStream( "props.dat" );
         table.load( input );// carrega propriedades 
         input.close();
         System.out.println( "After loading properties" );
         listProperties(); // exibe os valores da propriedade
      } // fim do try
      catch ( IOException ioException )
      {
         ioException.printStackTrace();
      } // fim do catch
   } // fim do método loadProperties

   // gera saída de valores de propriedade
   public void listProperties()
   {
      Set< Object > keys = table.keySet(); // obtém nomes de propriedade
 
      // gera saída de pares nome/valor
      for ( Object key : keys )
      {
         System.out.printf( 
            "%s\t%s\n", key, table.getProperty( ( String ) key ));
      } // fim do for

      System.out.println();
   } // fim do método listProperties

   public static void main( String args[] )
   {
      new PropertiesTest();
   } // fim de main
} // fim da classe PropertiesTest


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