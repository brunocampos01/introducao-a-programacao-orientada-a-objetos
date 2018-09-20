// Fig. 24.26: MessageSender.java
// Envia uma mensagem para o servidor de bate-papo em um executável separado.
package com.deitel.messenger.sockets.client;

import java.io.IOException;
import java.util.Formatter;
import java.net.Socket;

import static com.deitel.messenger.sockets.SocketMessengerConstants.*;

public class MessageSender implements Runnable 
{
   private Socket clientSocket; // Socket pelo qual enviar a mensagem
   private String messageToSend; // mensagem a enviar

   public MessageSender( Socket socket, String userName, String message ) 
   {
      clientSocket = socket; // armazena o socket para o cliente
      
      // cria uma mensagem a ser enviada
      messageToSend = userName + MESSAGE_SEPARATOR + message;
   } // fim do construtorMessageSender
   
   // envia a mensagem e finaliza
   public void run() 
   {
      try // envia a mensagem e esvazia PrintWriter
      {     
         Formatter output =                                     
            new Formatter( clientSocket.getOutputStream() );    
         output.format( "%s\n", messageToSend ); // envia a mensagem
         output.flush(); // esvazia a saída
      } // fim do try
      catch ( IOException ioException ) 
      {
         ioException.printStackTrace();
      } // fim do catch
   } // fim do método run
} // fim da classe MessageSender


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