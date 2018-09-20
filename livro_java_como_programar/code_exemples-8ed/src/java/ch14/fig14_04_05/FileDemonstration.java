// Fig. 14.4: FileDemonstration.java
// Demonstrando a classe File.

package ch14.fig14_04_05;

import java.io.File;

public class FileDemonstration
{
   // exibe informações sobre o arquivo que o usuário especifica
   public void analyzePath( String path )
   {
      // cria o objeto File com base na entrada de usuário
      File name = new File( path );

      if (name.exists()) // se o nome existir, gera saída das informações sobre ele
      {
         // exibe informações sobre o arquivo (ou diretório)
         System.out.printf(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            name.getName(), " exists",
            ( name.isFile() ? "is a file" : "is not a file" ),
            ( name.isDirectory() ? "is a directory" : 
               "is not a directory" ),
            ( name.isAbsolute() ? "is absolute path" : 
               "is not absolute path" ), "Last modified: ",
            name.lastModified(), "Length: ", name.length(), 
            "Path: ", name.getPath(), "Absolute path: ",
            name.getAbsolutePath(), "Parent: ", name.getParent());

         if (name.isDirectory()) // listagem de diretório de saída
         {
            String directory[] = name.list();
            System.out.println( "\n\nDirectory contents:\n" );
   
            for ( String directoryName : directory )
               System.out.printf( "%s\n", directoryName );
         } // fim do else
      } // fim do if externo
      else // não for arquivo ou diretório, gera saída da mensagem de erro
      {
         System.out.printf( "%s %s", path, "does not exist." );
      } // fim do else
   } // fim do método analyzePath
} // fim da classe FileDemonstration


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