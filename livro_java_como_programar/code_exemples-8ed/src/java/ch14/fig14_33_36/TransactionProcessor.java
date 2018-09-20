// Fig. 14.35: TransactionProcessor.java
// Um programa de processamento de transações c/ arquivos de acesso aleatório.

package ch14.fig14_33_36;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.jhtp6.ch14.RandomAccessAccountRecord;

public class TransactionProcessor
{
   private FileEditor dataFile;
   private RandomAccessAccountRecord record;
   private MenuOption choices[] = { MenuOption.PRINT,
      MenuOption.UPDATE, MenuOption.NEW,
      MenuOption.DELETE, MenuOption.END };

   private Scanner input = new Scanner( System.in );

   // obt�m o nome de arquivo e abre o arquivo
   private boolean openFile()
   {
      try // tenta abrir o arquivo
      {
         // chama o m�todo auxiliar para abrir o arquivo
         dataFile = new FileEditor( "clients.dat" ); 
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error opening file." );
         return false;
      } // fim do catch
       
      return true;
   } // fim do método openFile

   // fecha o arquivo e termina o aplicativo
   private void closeFile() 
   {
      try // fecha o arquivo
      {
         dataFile.closeFile();
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método closeFile

   // cria, atualiza ou exclui o registro
   private void performAction( MenuOption action )
   {
      int accountNumber = 0; // número de conta do registro
      String firstName; // primeiro nome da conta
      String lastName; // sobrenome da conta
      double balance; // saldo da conta
      double transaction; // valor monetário a alterar no saldo

      try // tenta manipular arquivos com base na opção selecionada
      {
         switch ( action ) // comuta com base na opção selecionada
         {
            case PRINT:
               System.out.println();
               dataFile.readRecords();
               break;
            case NEW:
               System.out.printf( "\n%s%s\n%s\n%s",
                  "Enter account number,",
                  " first name, last name and balance.",
                  "(Account number must be 1 - 100)", "? " );

               accountNumber = input.nextInt(); // lê o número de conta
               firstName = input.next(); // lê o primeiro nome
               lastName = input.next(); // lê o sobrenome
               balance = input.nextDouble(); // lê o saldo

               dataFile.newRecord( accountNumber, firstName,  
                  lastName, balance ); // cria um novo registro   
               break;
            case UPDATE:
               System.out.print(
                  "\nEnter account to update ( 1 - 100 ): " );
               accountNumber = input.nextInt();
               record = dataFile.getRecord( accountNumber );

               if ( record.getAccount() == 0 )
                  System.out.println( "Account does not exist." );
               else
               {
                  // exibe o conteúdo de registro
                  System.out.printf( "%-10d%-12s%-12s%10.2f\n\n",
                     record.getAccount(), record.getFirstName(),
                     record.getLastName(), record.getBalance() );

                  System.out.print(
                     "Enter charge ( + ) or payment ( - ): " );
                  transaction = input.nextDouble();
                  dataFile.updateRecord( accountNumber, // atualiza o registro
                     transaction );                                     

                  // recupera o registro atualizado
                  record = dataFile.getRecord( accountNumber );

                  // exibição o registro atualizado
                  System.out.printf( "%-10d%-12s%-12s%10.2f\n",
                     record.getAccount(), record.getFirstName(),
                     record.getLastName(), record.getBalance() );
               } // fim do else
               break;
            case DELETE:
               System.out.print(
                  "\nEnter an account to delete (1 - 100): " );
               accountNumber = input.nextInt();
         
               dataFile.deleteRecord( accountNumber ); // exclui o registro
               break;
            default:
               System.out.println( "Invalid action." );
               break;
         } // fim do switch
      } // fim do try
      catch ( NumberFormatException format )
      {
         System.err.println( "Bad input." );
      } // fim do catch
      catch ( IllegalArgumentException badAccount )
      {
         System.err.println( badAccount.getMessage() );
      } // fim do catch
      catch ( IOException ioException )
      {
         System.err.println( "Error writing to the file." );
      } // fim do catch
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "Invalid input. Please try again." );
         input.nextLine(); // descarta entrada para o usu�rio tentar de novo
      } // fim do catch
   } // fim do método performAction

   // permite ao usuário inserir escolhas de menu
   private MenuOption enterChoice()
   {
      int menuChoice = 1;

      // exibe opções disponíveis
      System.out.printf( "\n%s\n%s\n%s\n%s\n%s\n%s",
         "Enter your choice", "1 - List accounts",
         "2 - Update an account", "3 - Add a new account",
         "4 - Delete an account", "5 - End program\n? " );

      try
      {
         menuChoice = input.nextInt();
      }
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "Invalid input." );
         System.exit( 1 );
      } // fim do catch

      return choices[ menuChoice - 1 ]; // retorna a escolha do usuário
   } // fim do enterChoice

   public void processRequests()
   {
      openFile();

      // obtém a solicitação do usuário
      MenuOption choice = enterChoice();

      while ( choice != MenuOption.END )
      {
         performAction( choice );
         choice = enterChoice();
      } // fim do while
 
      closeFile();
   } // fim do método processRequests
} // fim da classe TransactionProcessor


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
