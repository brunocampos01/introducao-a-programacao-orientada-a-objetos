// Fig. 14.14: CreditInquiry.java
// Esse programa lê um arquivo sequencialmente e exibe o
// conteúdo baseado no tipo de conta que o usuário solicita
// (saldo credor, saldo devedor ou saldo zero).

package ch14.fig14_13_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.jhtp6.ch14.AccountRecord;

public class CreditInquiry
{
   private MenuOption accountType;
   private Scanner input;
   private MenuOption choices[] = { MenuOption.ZERO_BALANCE,
      MenuOption.CREDIT_BALANCE, MenuOption.DEBIT_BALANCE,
      MenuOption.END };

   // lê registros de arquivo e exibe somente os registros do tipo apropriado
   private void readRecords()
   {
      // objeto a ser gravado no arquivo
      AccountRecord record = new AccountRecord();

      try // lê registros
      {
         // abre o arquivo para leitura a partir do início
         input = new Scanner( new File( "clients.txt" ) );

         while (input.hasNext()) // insere os valores do arquivo
         {
            record.setAccount( input.nextInt() ); // lê o número de conta
            record.setFirstName( input.next() ); // lê o primeiro nome
            record.setLastName( input.next() ); // lê o sobrenome
            record.setBalance( input.nextDouble() ); // lê o saldo

            // se o tipo for a conta adequada, exibe o registro
            if ( shouldDisplay( record.getBalance() ) )       
               System.out.printf( "%-10d%-12s%-12s%10.2f\n",  
                  record.getAccount(), record.getFirstName(),
                  record.getLastName(), record.getBalance() );
         } // fim do while
      } // fim do try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "File improperly formed." );
         input.close();
         System.exit( 1 );
      } // fim do catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error reading from file." );
         System.exit( 1 );
      } // fim do catch
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "File cannot be found." );
         System.exit( 1 );
      } // fim do catch
      finally
      {
         if ( input != null )
            input.close(); // fecha a Scanner e o arquivo
      } // fim do finally 
   } // fim do método readRecords

   // usa o tipo de registro para determinar se o registro deve ser exibido
   private boolean shouldDisplay( double balance )
   {
      if ( ( accountType == MenuOption.CREDIT_BALANCE )
         && ( balance < 0 ) )
         return true;

      else if ( ( accountType == MenuOption.DEBIT_BALANCE )
         && ( balance > 0 ) )
         return true;

      else if ( ( accountType == MenuOption.ZERO_BALANCE )
         && ( balance == 0 ) )
         return true;

      return false;
   } // fim do método shouldDisplay

   // obtém a solicitação do usuário
   private MenuOption getRequest()
   {
      Scanner textIn = new Scanner( System.in );
      int request = 1;

      // exibe opções de solicitação
      System.out.printf( "\n%s\n%s\n%s\n%s\n%s\n",
         "Enter request", " 1 - List accounts with zero balances",
         " 2 - List accounts with credit balances",
         " 3 - List accounts with debit balances", " 4 - End of run" );

      try // tenta inserir a escolha de menu
      {
         do // insere a solicitação de usuário
         {
            System.out.print( "\n? " );
            request = textIn.nextInt();
         } while ( ( request < 1 ) || ( request > 4 ) );
      } // fim do try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "Invalid input." );
         System.exit( 1 );
      } // fim do catch

      return choices[ request - 1 ]; // retorna o valor enum da opção
   } // fim do método getRequest

   public void processRequests()
   {
      // obtém a solicitação do usuário (por exemplo, saldo zero, credor ou devedor)
      accountType = getRequest();

      while ( accountType != MenuOption.END )
      {
         switch ( accountType )
         {
            case ZERO_BALANCE:
               System.out.println( "\nAccounts with zero balances:\n" );
               break;
            case CREDIT_BALANCE:
               System.out.println( "\nAccounts with credit balances:\n" );
               break;
            case DEBIT_BALANCE:
               System.out.println( "\nAccounts with debit balances:\n" );
               break;
         } // switch final

         readRecords();
         accountType = getRequest();
      } // fim do while
   } // fim do método processRequests
} // fim da classe CreditInquiry


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
