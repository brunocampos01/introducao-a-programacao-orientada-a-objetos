// Fig. 14.7: CreateTextFile.java
// Gravando dados em um arquivo de texto com a classe Formatter.

package ch14.fig14_07_09;

import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

import com.deitel.jhtp6.ch14.AccountRecord;

public class CreateTextFile
{
   private Formatter output; // objeto utilizado para gerar saída de texto no arquivo

   // permite ao usuário abrir o arquivo
   public void openFile()
   {
      try
      {
         output = new Formatter( "clients.txt" );
      } // fim do try
      catch ( SecurityException securityException )
      {
         System.err.println(
            "You do not have write access to this file." );
         System.exit( 1 );
      } // fim do catch
      catch ( FileNotFoundException filesNotFoundException )
      {
         System.err.println( "Error creating file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método openFile

   // adiciona registros ao arquivo
   public void addRecords()
   {
      // objeto a ser gravado no arquivo
      AccountRecord record = new AccountRecord();

      Scanner input = new Scanner( System.in );

      System.out.printf( "%s\n%s\n%s\n%s\n\n",
         "To terminate input, type the end-of-file indicator ",
         "when you are prompted to enter input.",
         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
         "On Windows type <ctrl> z then press Enter" );

      System.out.printf( "%s\n%s", 
         "Enter account number (> 0), first name, last name and balance.",
         "? " );

      while (input.hasNext()) // faz um loop até o indicador de fim de arquivo
      {
         try // gera saída dos valores para o arquivo
         {
            // recupera os dados para saída
            record.setAccount( input.nextInt() ); // lê o número de conta
            record.setFirstName( input.next() ); // lê o primeiro nome
            record.setLastName( input.next() ); // lê o sobrenome
            record.setBalance( input.nextDouble() ); // lê o saldo

            if ( record.getAccount() > 0 )
            {
               // grava um novo registro
               output.format( "%d %s %s %.2f\n", record.getAccount(),
                  record.getFirstName(), record.getLastName(),       
                  record.getBalance() );                             
            } // fim do if
            else
            {
               System.out.println(
                  "Account number must be greater than 0." );
            } // fim do else
         } // fim do try
         catch ( FormatterClosedException formatterClosedException )
         {
            System.err.println( "Error writing to file." );
            return;
         } // fim do catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // descarta entrada para o usuário tentar de novo
         } // fim do catch

         System.out.printf( "%s %s\n%s", "Enter account number (>0),",
            "first name, last name and balance.", "? " );
      } // fim do while
   } // fim do método addRecords

   // fecha o arquivo
   public void closeFile()
   {
      if ( output != null )
         output.close();
   } // fim do método closeFile
} // fim da classe CreateTextFile


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