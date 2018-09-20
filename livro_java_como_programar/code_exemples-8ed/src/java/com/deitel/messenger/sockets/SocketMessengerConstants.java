// Fig. 24.20: SocketMessengerConstants.java
// SocketMessengerConstants define as constantes para os números de porta
// e o endereço de multicast em DeitelMessenger
package com.deitel.messenger.sockets;

public interface SocketMessengerConstants 
{   
   // endereço para datagramas de multicast
   public static final String MULTICAST_ADDRESS = "239.0.0.1";
   
   // porta para ouvir datagramas de multicast           
   public static final int MULTICAST_LISTENING_PORT = 5555;
   
   // porta para enviar datagramas de multicast               
   public static final int MULTICAST_SENDING_PORT = 5554;
   
   // porta para conexões de Socket com o DeitelMessengerServer
   public static final int SERVER_PORT = 12345;           
   
   // String que indica desconexão
   public static final String DISCONNECT_STRING = "DISCONNECT";

   // String que separa o nome de usuário do corpo da mensagem
   public static final String MESSAGE_SEPARATOR = ">>>";       

   // tamanho da mensagem (em bytes)                 
   public static final int MESSAGE_SIZE = 512;
} // fim da interface SocketMessengerConstants


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