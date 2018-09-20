// Fig. 14.23: RandomAccessAccountRecord.java
// Subclasse de AccountRecord para programas com arquivos de acesso aleatório.
package com.deitel.jhtp6.ch14; // empacotada para reutilização

import java.io.RandomAccessFile;
import java.io.IOException;     

public class RandomAccessAccountRecord extends AccountRecord
{  
    public static final int SIZE = 72;

   // construtor sem argumentos chama outro construtor com valores padrão
   public RandomAccessAccountRecord()
   {
      this( 0, "", "", 0.0 );
   } // fim do construtor de RandomAccessAccountRecord sem argumentos

   // inicializa uma RandomAccessAccountRecord
   public RandomAccessAccountRecord( int account, String firstName, 
      String lastName, double balance )
   {
      super( account, firstName, lastName, balance );
   } // fim do construtor de quatro argumentos da classe RandomAccessAccountRecord

   // lê um registro em um RandomAccessFile especificado
   public void read( RandomAccessFile file ) throws IOException
   {
      setAccount(file.readInt());
      setFirstName( readName( file ) );
      setLastName( readName( file ) );
      setBalance(file.readDouble());
   } // fim do método read

   // assegura que o nome tenha um comprimento adequado
   private String readName( RandomAccessFile file ) throws IOException
   {
      char name[] = new char[ 15 ], temp;

      for ( int count = 0; count < name.length; count++ )
      {
         temp = file.readChar();
         name[ count ] = temp;
      } // for final
      
      return new String( name ).replace( '\0', ' ' );
   } // fim do método readName

   // grava um registro no RandomAccessFile especificado
   public void write( RandomAccessFile file ) throws IOException
   {
      file.writeInt( getAccount() );
      writeName( file, getFirstName() );
      writeName( file, getLastName() );
      file.writeDouble( getBalance() );
   } // fim do método write

   // grava um nome no arquivo; máximo de 15 caracteres
   private void writeName( RandomAccessFile file, String name )
      throws IOException                                       
   {
      StringBuffer buffer = null;

      if ( name != null ) 
         buffer = new StringBuffer( name );
      else 
         buffer = new StringBuffer( 15 );

      buffer.setLength( 15 );
      file.writeChars( buffer.toString() );
   } // fim do método writeName
} // fim da classe RandomAccessAccountRecord


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