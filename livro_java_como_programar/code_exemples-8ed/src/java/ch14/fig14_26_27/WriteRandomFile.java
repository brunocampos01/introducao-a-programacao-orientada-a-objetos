// Fig. 14.26: WriteRandomFile.java
// Esse programa recupera informações do usuário o
// teclado e grava essas informações em um arquivo de acesso aleatório.

package ch14.fig14_26_27;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.jhtp6.ch14.RandomAccessAccountRecord;

public class WriteRandomFile
{  
   private RandomAccessFile output;
   
   private static final int NUMBER_RECORDS = 100;

   // permite que o usuário escolha o arquivo a abrir
   public void openFile()
   {
      try // abre o arquivo
      {
         output = new RandomAccessFile( "clients.dat", "rw" );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "File does not exist." );
      } // fim do catch
   } // fim do método openFile

   // fecha o arquivo e termina o aplicativo
   public void closeFile() 
   {
      try // fecha o arquivo e encerra
      {
         if ( output != null )
            output.close();
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método closeFile

   // adiciona registros ao arquivo
   public void addRecords()
   {
      // objeto a ser gravado no arquivo
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      int accountNumber = 0; // número de conta para o objeto AccountRecord
      String firstName; // primeiro nome para o objeto AccountRecord
      String lastName; // sobrenome para objeto AccountRecord
      double balance; // saldo para objeto AccountRecord

      Scanner input = new Scanner( System.in );

      System.out.printf( "%s\n%s\n%s\n%s\n\n",
         "To terminate input, type the end-of-file indicator ",
         "when you are prompted to enter input.",
         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
         "On Windows type <ctrl> z then press Enter" );

      System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
         "first name, last name and balance.", "? " );

      while ( input.hasNext() ) // faz um loop até o indicador de fim de arquivo
      {
         try // gera a saída dos valores para o arquivo
         {
            accountNumber = input.nextInt(); // lê o número de conta
            firstName = input.next(); // lê o primeiro nome
            lastName = input.next(); // lê o sobrenome
            balance = input.nextDouble(); // lê o saldo

            if ( accountNumber > 0 && accountNumber <= NUMBER_RECORDS )
            {
               record.setAccount( accountNumber );
               record.setFirstName( firstName );  
               record.setLastName( lastName );    
               record.setBalance( balance );      

               output.seek( ( accountNumber - 1 ) * // posição para a localização
                  RandomAccessAccountRecord.SIZE ); // adequada do arquivo
               record.write( output );                                   
            } // fim do if
            else
               System.out.println( "Account must be between 0 and 100." );
         } // fim do try
         catch ( IOException ioException )
         {
            System.err.println( "Error writing to file." );
            return;
         } // fim do catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // descarta entrada para o usuário tentar de novo
         } // fim do catch

         System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
            "first name, last name and balance.", "? " );
      } // fim do while
   } // fim do método addRecords
} // fim da classe WriteRandomFile


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