// Fig. 14.18: CreateSequentialFile.java
// Gravando objetos sequencialmente em um arquivo com a classe ObjectOutputStream.

package ch14.fig14_18_19;

import java.io.FileOutputStream;        
import java.io.IOException;             
import java.io.ObjectOutputStream;      
import java.util.NoSuchElementException;
import java.util.Scanner;               

import com.deitel.jhtp6.ch14.AccountRecordSerializable;

public class CreateSequentialFile
{
   private ObjectOutputStream output; // gera saída dos dados no arquivo

   // permite que o usuário especifique o nome de arquivo
   public void openFile()
   {
      try // abre o arquivo
      {
         output = new ObjectOutputStream(           
            new FileOutputStream( "clients.ser" ) );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error opening file." );
      } // fim do catch
   } // fim do método openFile

   // adiciona registros ao arquivo
   public void addRecords()
   {
      AccountRecordSerializable record; // objeto a ser gravado no arquivo
      int accountNumber = 0; // número de conta para o objeto de registro
      String firstName; // primeiro nome para o objeto de registro
      String lastName; // sobrenome para o objeto de registro
      double balance; // saldo para objeto de registro

      Scanner input = new Scanner( System.in );

      System.out.printf( "%s\n%s\n%s\n%s\n\n",
         "To terminate input, type the end-of-file indicator ",
         "when you are prompted to enter input.",
         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
         "On Windows type <ctrl> z then press Enter" );

      System.out.printf( "%s\n%s", 
         "Enter account number (> 0), first name, last name and balance.",
         "? " );

      while ( input.hasNext() ) // faz um loop até o indicador de fim de arquivo
      {
         try // gera saída dos valores para o arquivo
         {
            accountNumber = input.nextInt(); // lê o número de conta
            firstName = input.next(); // lê o primeiro nome
            lastName = input.next(); // lê o sobrenome
            balance = input.nextDouble(); // lê o saldo

            if ( accountNumber > 0 )
            {
               // cria um novo registro
               record = new AccountRecordSerializable( accountNumber,
                  firstName, lastName, balance );                    
               output.writeObject( record ); // gera a saída de registro
            } // fim do if
            else
            {
               System.out.println(
                  "Account number must be greater than 0." );
            } // fim do else
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

         System.out.printf( "%s %s\n%s", "Enter account number (>0),",
            "first name, last name and balance.", "? " );
      } // fim do while
   } // fim do método addRecords

   // fecha o arquivo e termina o aplicativo
   public void closeFile() 
   {
      try // fecha o arquivo
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
} // fim da classe CreateSequentialFile


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