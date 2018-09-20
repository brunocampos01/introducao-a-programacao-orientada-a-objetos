// Fig. 24.23: MulticastSender.java
// MulticastSender transmite uma mensagem de bate-papo utilizando um datagrama de multicast.
package com.deitel.messenger.sockets.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static com.deitel.messenger.sockets.SocketMessengerConstants.*;

public class MulticastSender implements Runnable
{   
   private byte[] messageBytes; // dados da mensagem
   
   public MulticastSender( byte[] bytes ) 
   { 
      messageBytes = bytes; // cria a mensagem
   } // fim do construtor MulticastSender

   // entrega a mensagem para o MULTICAST_ADDRESS via um DatagramSocket
   public void run() 
   {
      try // entrega a mensagem
      {         
         // cria o DatagramSocket para enviar a mensagem    
         DatagramSocket socket =                         
            new DatagramSocket( MULTICAST_SENDING_PORT );
          
         // utiliza o InetAddress reservado para grupo de multicast                
         InetAddress group = InetAddress.getByName( MULTICAST_ADDRESS );
         
         // cria o DatagramPacket contendo a mensagem               
         DatagramPacket packet = new DatagramPacket( messageBytes,
            messageBytes.length, group, MULTICAST_LISTENING_PORT );
         
         socket.send( packet ); // envia o pacote para o grupo de multicast
         socket.close(); // fecha o socket   
      } // fim do try
      catch ( IOException ioException ) 
      { 
         ioException.printStackTrace();
      } // fim do catch
   } // fim do método run
} // fim da classe MulticastSender


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