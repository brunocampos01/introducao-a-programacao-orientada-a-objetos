// Fig. 24.28: ClientGUI.java
// A ClientGUI fornece uma interface com o usuário para enviar e receber
// mensagens para e do DeitelMessengerServer.
package com.deitel.messenger;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

public class ClientGUI extends JFrame 
{   
   private JMenu serverMenu; // para conectar/desconectar o servidor
   private JTextArea messageArea; // exibe as mensagens
   private JTextArea inputArea; // gera a saída das mensagens
   private JButton connectButton; // botão para conectar
   private JMenuItem connectMenuItem; // item de menu para conectar
   private JButton disconnectButton; // botão para desconectar
   private JMenuItem disconnectMenuItem; // item de menu para desconectar
   private JButton sendButton; // envia mensagens
   private JLabel statusBar; // rótulo para o status da conexão
   private String userName; // userName para adicionar a mensagens enviadas
   private MessageManager messageManager; // comunica-se com o servidor    
   private MessageListener messageListener; // recebe mensagens entrantes
 
   // Construtor ClientGUI
   public ClientGUI( MessageManager manager ) 
   {       
      super( "Deitel Messenger" );
      
      messageManager = manager; // configura o MessageManager
      
      // cria MyMessageListener para receber mensagens
      messageListener = new MyMessageListener();        
      
      serverMenu = new JMenu ( "Server" ); // cria o JMenu do servidor
      serverMenu.setMnemonic( 'S' ); // configura o mnemônico para o menu de servidor
      JMenuBar menuBar = new JMenuBar(); // cria JMenuBar
      menuBar.add( serverMenu ); // adiciona o menu de servidor à barra de menus
      setJMenuBar( menuBar ); // adiciona JMenuBar ao aplicativo
      
      // cria ImageIcon para botões de conexão
      Icon connectIcon = new ImageIcon( 
         getClass().getResource( "images/Connect.gif" ) );
      
      // cria connectButton e connectMenuItem
      connectButton = new JButton( "Connect", connectIcon );
      connectMenuItem = new JMenuItem( "Connect", connectIcon );  
      connectMenuItem.setMnemonic( 'C' );
      
      // cria ConnectListener para botões de conexão
      ActionListener connectListener = new ConnectListener();
      connectButton.addActionListener( connectListener );
      connectMenuItem.addActionListener( connectListener ); 
      
      // cria ImageIcon para botões de desconexão
      Icon disconnectIcon = new ImageIcon( 
         getClass().getResource( "images/Disconnect.gif" ) );
      
      // cria disconnectButton e disconnectMenuItem
      disconnectButton = new JButton( "Disconnect", disconnectIcon );
      disconnectMenuItem = new JMenuItem( "Disconnect", disconnectIcon );
      disconnectMenuItem.setMnemonic( 'D' );
      
      // desativa o botão de desconexão e o item de menu
      disconnectButton.setEnabled( false );
      disconnectMenuItem.setEnabled( false );
      
      // cria DisconnectListener para botões de desconexão
      ActionListener disconnectListener = new DisconnectListener();
      disconnectButton.addActionListener( disconnectListener );
      disconnectMenuItem.addActionListener( disconnectListener );
      
      // adiciona os JMenuItems de conexão e desconexão ao fileMenu
      serverMenu.add( connectMenuItem );
      serverMenu.add( disconnectMenuItem );           
  
      // adiciona JButtons de conexão e conexão ao buttonPanel
      JPanel buttonPanel = new JPanel();
      buttonPanel.add( connectButton );
      buttonPanel.add( disconnectButton );
     
      messageArea = new JTextArea(); // exibe as mensagens
      messageArea.setEditable( false ); // desativa a edição
      messageArea.setWrapStyleWord( true ); // configura o estilo de quebra de linha
      messageArea.setLineWrap( true ); // ativa a quebra de linha
      
      // coloca a messageArea no JScrollPane para permitir rolagem
      JPanel messagePanel = new JPanel();
      messagePanel.setLayout( new BorderLayout( 10, 10 ) );
      messagePanel.add( new JScrollPane( messageArea ), 
         BorderLayout.CENTER );
      
      inputArea = new JTextArea( 4, 20 ); // para inserir novas mensagens
      inputArea.setWrapStyleWord( true ); // configura o estilo de quebra de linha
      inputArea.setLineWrap( true ); // ativa a quebra de linha
      inputArea.setEditable( false ); // desativa a edição
      
      // cria Icon para sendButton
      Icon sendIcon = new ImageIcon( 
         getClass().getResource( "images/Send.gif" ) );
      
      sendButton = new JButton( "Send", sendIcon ); // criar o botão de enviar
      sendButton.setEnabled( false ); // desativa o botão de enviar
      sendButton.addActionListener(
         new ActionListener() 
         {
            // envia uma nova mensagem quando usuário ativa o sendButton
            public void actionPerformed( ActionEvent event )
            {
               messageManager.sendMessage( userName,      
                  inputArea.getText() ); // envia a mensagem
               inputArea.setText( "" ); // limpa a inputArea
            } // fim do método actionPerformed
         } // fim da classe interna anônima
      ); // fim da chamada para addActionListener
      
      Box box = new Box( BoxLayout.X_AXIS ); // cria uma nova caixa para layout
      box.add( new JScrollPane( inputArea ) ); // adiciona a área de entrada à caixa
      box.add( sendButton ); // adiciona o botão Enviar à caixa
      messagePanel.add( box, BorderLayout.SOUTH ); // adiciona a caixa ao painel
      
      // cria um JLabel para statusBar com uma borda reentrante
      statusBar = new JLabel( "Not Connected" );
      statusBar.setBorder( new BevelBorder( BevelBorder.LOWERED ) );

      add( buttonPanel, BorderLayout.NORTH ); // adiciona o painel de botões
      add( messagePanel, BorderLayout.CENTER ); // adiciona o painel de mensagens
      add( statusBar, BorderLayout.SOUTH ); // adiciona a barra de status
      
      // adiciona WindowListener para desconectar quando o usuário sair
      addWindowListener ( 
         new WindowAdapter () 
         {
            // desconecta-se do servidor e encerra o aplicativo
            public void windowClosing ( WindowEvent event ) 
            {
               messageManager.disconnect( messageListener );
               System.exit( 0 );
            } // fim do método windowClosing
         } // fim da classe interna anônima
      ); // fim da chamada a addWindowListener
   } // fim do construtor ClientGUI
   
   // ConnectListener ouve solicitações do usuário para conectar ao servidor
   private class ConnectListener implements ActionListener 
   {
      // conecta-se ao servidor e ativa/desativa componentes GUI
      public void actionPerformed( ActionEvent event )
      {
         // conecta-se ao servidor e roteia mensagens para messageListener
         messageManager.connect( messageListener );                

         // solicita o userName                  
         userName = JOptionPane.showInputDialog(
            ClientGUI.this, "Enter user name:" );
         
         messageArea.setText( "" ); // limpa a messageArea
         connectButton.setEnabled( false ); // desativa conectar
         connectMenuItem.setEnabled( false ); // desativa conectar
         disconnectButton.setEnabled( true ); // ativa desconectar
         disconnectMenuItem.setEnabled( true ); // ativa desconectar
         sendButton.setEnabled( true ); // ativa o botão Enviar
         inputArea.setEditable( true ); // ativa a edição para a área de entrada
         inputArea.requestFocus(); // configura foco para a área de entrada
         statusBar.setText( "Connected: " + userName ); // configura o texto
      } // fim do método actionPerformed
   } // fim da classe interna ConnectListener
   
   // DisconnectListener ouve solicitações do usuário para desconectar-se
   // do DeitelMessengerServer
   private class DisconnectListener implements ActionListener 
   {
      // desconecta-se do servidor e ativa/desativa componentes GUI
      public void actionPerformed( ActionEvent event )
      {
         // desconecta-se do servidor e pára de rotear mensagens
         messageManager.disconnect( messageListener );      
         sendButton.setEnabled( false ); // desativa o botão de enviar
         disconnectButton.setEnabled( false ); // desativa desconectar
         disconnectMenuItem.setEnabled( false ); // desativa desconectar
         inputArea.setEditable( false ); // desativa a edição
         connectButton.setEnabled( true ); // ativa conectar
         connectMenuItem.setEnabled( true ); // ativa conectar
         statusBar.setText( "Not Connected" ); // configure o texto da barra de status
      } // fim do método actionPerformed
   } // fim da classe interna DisconnectListener 
   
   // MyMessageListener ouve novas mensagens do MessageManager e
   // exibe as mensagens na messageArea utilizando o MessageDisplayer.
   private class MyMessageListener implements MessageListener 
   {
      // quando recebida, exibe novas mensagens na messageArea     
      public void messageReceived( String from, String message )
      {                                                         
         // acrescenta a mensagem utilizando o MessageDisplayer               
         SwingUtilities.invokeLater(                            
            new MessageDisplayer( from, message ) );            
      } // fim do método messageReceived
   } // fim da classe interna MyMessageListener 
   
   // Exibe nova mensagem acrescentando a mensagem à JTextArea.  Deve
   // ser executado somente na thread Event; modifica componente Swing ativo
   private class MessageDisplayer implements Runnable
   {
      private String fromUser; // usuário do qual a mensagem veio
      private String messageBody; // corpo da mensagem
      
      // Construtor MessageDisplayer
      public MessageDisplayer( String from, String body )
      {
         fromUser = from; // armazena o usuário que origina a mensagem
         messageBody = body; // armazena o corpo da mensagem
      } // fim do construtor MessageDisplayer
      
      // exibe nova mensagem na messageArea
      public void run() 
      {
         // acrescenta nova mensagem
         messageArea.append( "\n" + fromUser + "> " + messageBody );
      } // fim do método run
   } // fim da classe interna MessageDisplayer
} // fim da classe ClientGUI


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
