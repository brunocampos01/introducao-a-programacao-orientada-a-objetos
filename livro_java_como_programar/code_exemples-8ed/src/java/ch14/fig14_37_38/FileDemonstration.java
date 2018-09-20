// Fig. 14.37: FileDemonstration.java
// Demonstrando a classe File.

package ch14.fig14_37_38;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileDemonstration extends JFrame
{
   private JTextArea outputArea; // utilizado para saída
   private JScrollPane scrollPane; // utilizado para fornecer rolagem para saída
   
   // configura a GUI
   public FileDemonstration()
   {
      super( "Testing class File" );

      outputArea = new JTextArea();

      // adiciona outputArea a scrollPane
      scrollPane = new JScrollPane( outputArea ); 

      add( scrollPane, BorderLayout.CENTER ); // adiciona scrollPane a GUI

      setSize( 400, 400 ); // configura o tamanho da GUI
      setVisible( true ); // exibe a GUI

      analyzePath(); // cria e analisa o objeto File
   } // fim do construtor de FileDemonstration

   // permite que o usuário especifique o nome de arquivo
   private File getFile()
   {
      // exibe o diálogo de arquivo para o usuário escolher o arquivo a abrir
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setFileSelectionMode(             
         JFileChooser.FILES_AND_DIRECTORIES );      

      int result = fileChooser.showOpenDialog( this );

      // se o usuário clicou no botão Cancel no diálogo, retorna
      if (result == JFileChooser.CANCEL_OPTION)
         System.exit( 1 );

      File fileName = fileChooser.getSelectedFile(); // obtém o arquivo selecionado

      // exibe erro se inválido
      if ( ( fileName == null ) || ( fileName.getName().equals( "" ) ) )
      {
         JOptionPane.showMessageDialog( this, "Invalid File Name",
            "Invalid File Name", JOptionPane.ERROR_MESSAGE );
         System.exit( 1 );
      } // fim do if

      return fileName;
   } // fim do método getFile

   // exibe informações sobre o arquivo que o usuário especifica
   public void analyzePath()
   {
      // cria o objeto File com base na entrada de usuário
      File name = getFile();

      if ( name.exists() ) // se o nome existir, dá saída das informações sobre ele
      {
         // exibe informações sobre o arquivo (ou diretório)
         outputArea.setText( String.format(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            name.getName(), " exists",
            ( name.isFile() ? "is a file" : "is not a file" ),
            ( name.isDirectory() ? "is a directory" : 
               "is not a directory" ),
            ( name.isAbsolute() ? "is absolute path" : 
               "is not absolute path" ), "Last modified: ",
            name.lastModified(), "Length: ", name.length(), 
            "Path: ", name.getPath(), "Absolute path: ",
            name.getAbsolutePath(), "Parent: ", name.getParent() ) );

         if ( name.isDirectory() ) // listagem de diretório de saída
         {
            String directory[] = name.list();
            outputArea.append( "\n\nDirectory contents:\n" );
   
            for ( String directoryName : directory )
               outputArea.append( directoryName + "\n" );
         } // fim do else
      } // fim do if externo
      else // não for arquivo ou diretório, gera saída da mensagem de erro
      {
         JOptionPane.showMessageDialog( this, name +
            " does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE );
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