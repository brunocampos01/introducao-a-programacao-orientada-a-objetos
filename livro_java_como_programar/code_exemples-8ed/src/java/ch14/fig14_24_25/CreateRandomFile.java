// Fig. 14.24: CreateRandomFile.java
// Cria arquivo de acesso aleatório gravando 100 registros vazios no disco.

package ch14.fig14_24_25;

import java.io.IOException;
import java.io.RandomAccessFile;

import com.deitel.jhtp6.ch14.RandomAccessAccountRecord;

public class CreateRandomFile
{    
   private static final int NUMBER_RECORDS = 100;

   // permite que o usuário selecione o arquivo a abrir
   public void createFile()
   {
      RandomAccessFile file = null;

      try // abre o arquivo para leitura e gravação
      {
         file = new RandomAccessFile( "clients.dat", "rw" );

         RandomAccessAccountRecord blankRecord = 
            new RandomAccessAccountRecord();

         // grava 100 registros vazios
         for ( int count = 0; count < NUMBER_RECORDS; count++ )
            blankRecord.write( file );

         // exibe uma mensagem de que o arquivo foi criado
         System.out.println( "Created file clients.dat." );

         System.exit( 0 ); // termina o programa
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error processing file." );
         System.exit( 1 );
      } // fim do catch
      finally
      {
         try
         {
            if ( file != null )
               file.close(); // fecha o arquivo
         } // fim do try
         catch ( IOException ioException )
         {
            System.err.println( "Error closing file." );
            System.exit( 1 );
         } // fim do catch
      } // fim do finally 
   } // fim do método createFile
} // fim da classe CreateRandomFile


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