// Fig. 24.24: MessageManager.java
// MessageManager é uma interface para objetos capazes de gerenciar
// comunicações com um servidor de mensagens.
package com.deitel.messenger;

public interface MessageManager 
{      
   // conecta-se ao servidor de mensagens e roteia as mensagens entrantes
   // para um dado MessageListener                             
   public void connect( MessageListener listener );        
   
   // desconecta-se de um servidor de mensagens e p�ra de rotear
   // mensagens entrantes para um dado MessageListener      
   public void disconnect( MessageListener listener );
   
   // envia a mensagem para o servidor de mensagens                      
   public void sendMessage( String from, String message );
} // fim da interface MessageManager


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