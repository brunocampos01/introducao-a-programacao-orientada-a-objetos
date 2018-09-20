// Fig. 24.18: DeitelMessengerServer.java
// DeitelMessengerServer é um servidor de bate-papo com múltiplas threads, baseado em socket e em
// pacotes.
package com.deitel.messenger.sockets.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import com.deitel.messenger.MessageListener;
import static com.deitel.messenger.sockets.SocketMessengerConstants.*;

public class DeitelMessengerServer implements MessageListener
{
   private ExecutorService serverExecutor; // executor para o servidor
   
   // inicia o servidor de bate-papo
   public void startServer() 
   {
      // cria o executor para executáveis de servidor
      serverExecutor = Executors.newCachedThreadPool();

      try // cria o servidor e gerencia novos clientes
      {
         // cria ServerSocket para conexões entrantes
         ServerSocket serverSocket = 
            new ServerSocket( SERVER_PORT, 100 );
         
         System.out.printf( "%s%d%s", "Server listening on port ", 
            SERVER_PORT, " ..." );
         
         // ouve clientes constantemente
         while ( true ) 
         {
            // aceita nova conexão de cliente
            Socket clientSocket = serverSocket.accept();
            
            // cria MessageReceiver para receber mensagens do cliente
            serverExecutor.execute(                                     
               new MessageReceiver( this, clientSocket ) );             
            
            // imprime informações sobre a conexão
            System.out.println( "Connection received from: " +
               clientSocket.getInetAddress() );
         } // fim do while
      } // fim do try
      catch ( IOException ioException )
      {
         ioException.printStackTrace();
      } // fim do catch
   } // fim do método startServer
   
   // quando nova mensagem é recebida, transmite a mensagem para os clientes
   public void messageReceived( String from, String message ) 
   {          
      // cria String que contém uma mensagem inteira
      String completeMessage = from + MESSAGE_SEPARATOR + message;
      
      // cria e inicia MulticastSender para transmitir mensagens
      serverExecutor.execute(                                  
         new MulticastSender( completeMessage.getBytes() ) );  
   } // fim do método messageReceived
} // fim da classe DeitelMessengerServer


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