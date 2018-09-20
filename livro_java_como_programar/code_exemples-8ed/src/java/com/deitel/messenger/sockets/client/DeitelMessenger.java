// Fig. 24.29: DeitelMessenger.java
// DeitelMessenger é um aplicativo de bate-papo que utiliza um ClientGUI
// e um SocketMessageManager para se comunicar com o DeitelMessengerServer.
package com.deitel.messenger.sockets.client;

import com.deitel.messenger.MessageManager;
import com.deitel.messenger.ClientGUI;

public class DeitelMessenger
{   
   public static void main( String args[] ) 
   {
      MessageManager messageManager; // declara MessageManager
      
      if ( args.length == 0 )
         // conecta-se ao host local
         messageManager = new SocketMessageManager( "localhost" );
      else
         // conecta-se utilizando o argumento de linha de comando
         messageManager = new SocketMessageManager( args[ 0 ] );  
      
      // cria a GUI para SocketMessageManager
      ClientGUI clientGUI = new ClientGUI( messageManager );
      clientGUI.setSize( 300, 400 ); // configura o tamanho da janela
      clientGUI.setResizable( false ); // desativa o redimensionamento
      clientGUI.setVisible( true ); // mostra a janela
   } // fim de main
} // fim da classe DeitelMessenger


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