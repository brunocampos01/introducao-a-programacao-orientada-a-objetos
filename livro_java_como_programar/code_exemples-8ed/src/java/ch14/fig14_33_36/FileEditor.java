// Fig. 14.34: FileEditor.java
// Essa classe declara os métodos que manipulam contas bancárias
// registra em um arquivo de acesso aleatório.

package ch14.fig14_33_36;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import com.deitel.jhtp6.ch14.RandomAccessAccountRecord;

public class FileEditor
{
   RandomAccessFile file; // referência ao arquivo
   Scanner input = new Scanner( System.in );
   
   // abre o arquivo
   public FileEditor( String fileName ) throws IOException
   {
      file = new RandomAccessFile( fileName, "rw" );
   } // fim do construtor de FileEditor
   
   // fecha o arquivo
   public void closeFile() throws IOException
   {
      if ( file != null )
         file.close();
   } // fim do método closeFile
   
   // obtém um registro do arquivo
   public RandomAccessAccountRecord getRecord( int accountNumber )
      throws IllegalArgumentException, NumberFormatException, IOException
   {
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      if ( accountNumber < 1 || accountNumber > 100 )
         throw new IllegalArgumentException( "Out of range" );

      // busca o registro apropriado no arquivo
      file.seek( ( accountNumber - 1 ) * RandomAccessAccountRecord.SIZE );
      
      record.read( file );

      return record;
   } // fim do método getRecord
   
   // atualiza o registro no arquivo
   public void updateRecord( int accountNumber, double transaction )
      throws IllegalArgumentException, IOException
   {
      RandomAccessAccountRecord record = getRecord( accountNumber );

      if ( record.getAccount() == 0 )
         throw new IllegalArgumentException( "Account does not exist" );

      // busca o registro apropriado no arquivo
      file.seek( ( accountNumber - 1 ) * RandomAccessAccountRecord.SIZE );

      record = new RandomAccessAccountRecord(
         record.getAccount(), record.getFirstName(),
         record.getLastName(), record.getBalance() + transaction );
         
      record.write( file ); // grava o registro atualizado no arquivo
   } // fim do método updateRecord
   
   // adiciona o registro ao arquivo
   public void newRecord( int accountNumber, String firstName, 
      String lastName, double balance )
      throws IllegalArgumentException, IOException
   {
      RandomAccessAccountRecord record = getRecord( accountNumber );
      
      if ( record.getAccount() != 0 )
         throw new IllegalArgumentException( "Account already exists" );

      // busca o registro apropriado no arquivo
      file.seek( ( accountNumber - 1 ) * RandomAccessAccountRecord.SIZE );

      record = new RandomAccessAccountRecord( accountNumber, 
         firstName, lastName, balance );
         
      record.write( file ); // grava o registro no arquivo
   } // fim do método newRecord
   
   // exclui o registro do arquivo
   public void deleteRecord( int accountNumber )
      throws IllegalArgumentException, IOException
   {
      RandomAccessAccountRecord record = getRecord( accountNumber );
      
      if ( record.getAccount() == 0 )
         throw new IllegalArgumentException( "Account does not exist" );
      
      // busca o registro apropriado no arquivo
      file.seek( ( accountNumber - 1 ) * RandomAccessAccountRecord.SIZE );

      // cria um registro em branco a gravar no arquivo
      record = new RandomAccessAccountRecord();
      record.write( file );
   } // fim do método deleteRecord

   // lê e grava registros
   public void readRecords()
   {
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      System.out.printf( "%-10s%-15s%-15s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );
   
      try // lê um registro e exibe
      {
         file.seek( 0 );

         while ( true )
         {
            do
            {
               record.read( file );
            } while ( record.getAccount() == 0 );

            // exibe o conteúdo do registro
            System.out.printf( "%-10d%-15s%-15s%10.2f\n",
               record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
         } // fim do while
      } // fim do try
      catch ( EOFException eofException ) // fecha o arquivo
      {
         return; // fim do arquivo foi alcançado
      } // fim do catch
      catch ( IOException ioException )
      {
         System.err.println( "Error reading file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método readRecords
} // fim da classe FileEditor


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