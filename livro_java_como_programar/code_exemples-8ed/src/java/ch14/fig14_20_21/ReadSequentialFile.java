// Fig. 14.20: ReadSequentialFile.java
// Esse programa lê um arquivo de objetos sequencialmente
// e exibe cada registro.

package ch14.fig14_20_21;

import java.io.EOFException;     
import java.io.FileInputStream;  
import java.io.IOException;      
import java.io.ObjectInputStream;

import com.deitel.jhtp6.ch14.AccountRecordSerializable;

public class ReadSequentialFile
{
   private ObjectInputStream input;

   // permite que o usuário selecione o arquivo a abrir
   public void openFile()
   {
      try // abre o arquivo
      {
         input = new ObjectInputStream(            
            new FileInputStream( "clients.ser" ) );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error opening file." );
      } // fim do catch
   } // fim do método openFile

   // lê o registro no arquivo
   public void readRecords()
   {
      AccountRecordSerializable record;
      System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );

      try // insere os valores do arquivo
      {
         while ( true )
         {
            record = ( AccountRecordSerializable ) input.readObject();

            // exibe o conteúdo de registro
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",  
               record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
         } // fim do while
      } // fim do try
      catch ( EOFException endOfFileException )
      {
         return; // fim do arquivo foi alcançado
      } // fim do catch
      catch ( ClassNotFoundException classNotFoundException )
      {
         System.err.println( "Unable to create object." );
      } // fim do catch
      catch ( IOException ioException )
      {
         System.err.println( "Error during reading from file." );
      } // fim do catch
   } // fim do método readRecords

   // fecha o arquivo e termina o aplicativo
   public void closeFile()
   {
      try // fecha o arquivo e encerra
      {
         if ( input != null )
            input.close();
            System.exit( 0 );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método closeFile
} // fim da classe ReadSequentialFile


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
