// Fig. 14.28: ReadRandomFile.java
// Esse programa lê um arquivo de acesso aleatório sequencialmente e
// exibe o conteúdo de um registro por vez em campos de texto.

package ch14.fig14_28_29;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.deitel.jhtp6.ch14.RandomAccessAccountRecord;

public class ReadRandomFile
{
   private RandomAccessFile input;

   // permite que o usuário selecione o arquivo a abrir
   public void openFile()
   {
      try // abre o arquivo
      {
         input = new RandomAccessFile( "clients.dat", "r" );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "File does not exist." );
      } // fim do catch
   } // fim do método openFile
   
   // lê e grava registros
   public void readRecords()
   {
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      System.out.printf( "%-10s%-15s%-15s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );
   
      try // lê um registro e exibe
      {
         while ( true )
         {
            do
            {
               record.read( input );
            } while ( record.getAccount() == 0 );

            // exibe o conteúdo de registro
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",
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
   
   // fecha o arquivo e termina o aplicativo
   public void closeFile() 
   {
      try // fecha o arquivo e encerra
      {
         if ( input != null )
            input.close();
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método closeFile
} // fim da classe ReadRandomFile


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