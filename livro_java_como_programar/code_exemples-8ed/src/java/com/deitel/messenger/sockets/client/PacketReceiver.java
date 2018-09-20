// Fig. 24.27: PacketReceiver.java
// PacketReceiver ouve DatagramPackets contendo
// mensagens de um DeitelMessengerServer.
package com.deitel.messenger.sockets.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;
import java.net.SocketTimeoutException;
import java.util.StringTokenizer;

import com.deitel.messenger.MessageListener;
import static com.deitel.messenger.sockets.SocketMessengerConstants.*;

public class PacketReceiver implements Runnable 
{
   private MessageListener messageListener; // recebe as mensagens
   private MulticastSocket multicastSocket; // recebe as mensagens de broadcast
   private InetAddress multicastGroup; // InetAddress do grupo de multicast
   private boolean keepListening = true; // termina o PacketReceiver
   
   public PacketReceiver( MessageListener listener ) 
   {
      messageListener = listener; // configure MessageListener
      
      try // conecta o MulticastSocket ao endereço de multicast e à porta
      {
         // cria um novo MulticastSocket         
         multicastSocket = new MulticastSocket(
            MULTICAST_LISTENING_PORT );        
         
         // utiliza InetAddress para obter o grupo de multicast                   
         multicastGroup = InetAddress.getByName( MULTICAST_ADDRESS );
         
         // associa-se ao grupo de multicast para receber mensagens
         multicastSocket.joinGroup( multicastGroup );
         
         // configura um tempo limite de 5 segundos ao esperar novos pacotes
         multicastSocket.setSoTimeout( 5000 );               
      } // fim do try
      catch ( IOException ioException ) 
      {
         ioException.printStackTrace();
      } // fim do catch
   } // fim do construtor PacketReceiver
   
   // ouve mensagens do grupo de multicast
   public void run() 
   {          
      // ouve mensagens até ser parado
      while ( keepListening ) 
      {
         // cria um buffer para mensagens entrantes    
         byte[] buffer = new byte[ MESSAGE_SIZE ];

         // cria DatagramPacket para mensagem entrante      
         DatagramPacket packet = new DatagramPacket( buffer,
            MESSAGE_SIZE );                                 

         try // recebe um novo DatagramPacket (chamada bloqueadora)
         {            
            multicastSocket.receive( packet );
         } // fim do try
         catch ( SocketTimeoutException socketTimeoutException ) 
         {
            continue; // continua para a próxima iteração para se manter ouvindo
         } // fim do catch
         catch ( IOException ioException ) 
         {
            ioException.printStackTrace();
            break;
         } // fim do catch

         // coloca os dados da mensagem em uma String
         String message = new String( packet.getData() );

         message = message.trim(); // apara o espaço em branco na mensagem

         // separa a mensagem em tokens para recuperar o nome do usuário e corpo da mensagem
         StringTokenizer tokenizer = new StringTokenizer(          
            message, MESSAGE_SEPARATOR );                          

         // ignora as mensagens que não contém um nome de usuário
         // e um corpo de mensagem
         if ( tokenizer.countTokens() == 2 ) 
         {
            // envia a mensagem para MessageListener         
            messageListener.messageReceived(           
               tokenizer.nextToken(), // nome de usuário
               tokenizer.nextToken() ); // corpo de mensagem
         } // fim do if
      } // fim do while

      try 
      {
         multicastSocket.leaveGroup( multicastGroup ); // sai do grupo
         multicastSocket.close(); // fecha o MulticastSocket           
      } // fim do try
      catch ( IOException ioException )
      { 
         ioException.printStackTrace();
      } // fim do catch
   } // fim do método run
   
   // pára de ouvir novas mensagens
   public void stopListening() 
   {
      keepListening = false;
   } // fim do método stopListening
} // fim da classe PacketReceiver


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