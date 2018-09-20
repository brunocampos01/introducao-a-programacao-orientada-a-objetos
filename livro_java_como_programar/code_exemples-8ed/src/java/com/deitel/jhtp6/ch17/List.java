// Fig. 17.3: List.java
// Definições da classe ListNode e List.
package com.deitel.jhtp6.ch17;

// classe para representar um nó em uma lista
class ListNode
{
   // membros de acesso de pacote; List pode acessar esses diretamente
   Object data;    
   ListNode nextNode;

   // construtor cria um ListNode que referencia o objeto
   ListNode( Object object ) 
   { 
      this( object, null ); 
   } // fim do construtor de um argumento ListNode

   // construtor cria ListNode que referencia
   // Object e o próximo ListNode
   ListNode( Object object, ListNode node )
   {
      data = object;    
      nextNode = node;  
   } // fim do construtor de dois argumentos ListNode

   // retorna referência aos dados no nó
   Object getObject() 
   { 
      return data; // retorna Object nesse nó
   } // fim do método getObject

   // retorna referência ao próximo nó na lista
   ListNode getNext() 
   { 
      return nextNode; // obtém próximo nó
   } // fim do método getNext
} // fim da classe ListNode

// definição da classe List
public class List
{
   private ListNode firstNode;
   private ListNode lastNode;
   private String name; // string como "lista" usada na impressão

   // construtor cria List vazia com "list" como o nome
   public List() 
   { 
      this( "list" ); 
   } // fim do construtor sem argumentos List

   // construtor cria uma List vazia com um nome
   public List( String listName )
   {
      name = listName;
      firstNode = lastNode = null;
   } // fim do construtor de um argumento List

   // insere Object na frente de List
   public void insertAtFront( Object insertItem )
   {
      if ( isEmpty() ) // firstNode e lastNode referenciam o mesmo objeto
         firstNode = lastNode = new ListNode( insertItem );
      else // firstNode referenciam o novo nó
         firstNode = new ListNode( insertItem, firstNode );
   } // fim do método insertAtFront

   // insere Object no fim de List
   public void insertAtBack( Object insertItem )
   {
      if ( isEmpty() ) // firstNode e lastNode referenciam o mesmo Object
         firstNode = lastNode = new ListNode( insertItem );
      else // nextNode do lastNode referencia o novo nó
         lastNode = lastNode.nextNode = new ListNode( insertItem );
   } // fim do método insertAtBack

   // remove o primeiro nó de List
   public Object removeFromFront() throws EmptyListException
   {
      if ( isEmpty() ) // lança exceção se List estiver vazia
         throw new EmptyListException( name );

      Object removedItem = firstNode.data; // recupera dados sendo removidos

      // atualiza referências firstNode e lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; // retorna dados de nó removidos
   } // fim do método removeFromFront

   // remove o último nó de List
   public Object removeFromBack() throws EmptyListException
   {
      if ( isEmpty() ) // lança exceção se List estiver vazia
         throw new EmptyListException( name );

      Object removedItem = lastNode.data; // recupera dados sendo removidos

      // atualiza referências firstNode e lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else // localiza o novo último nó
      { 
         ListNode current = firstNode;

         // faz loop enquanto nó atual não referencia lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;
   
         lastNode = current; // atual é novo lastNode
         current.nextNode = null;
      } // fim de else

      return removedItem; // retorna dados de nó removidos
   } // fim do método removeFromBack

   // determina se a lista estiver vazia
   public boolean isEmpty()
   { 
      return firstNode == null; // retorna true se List estiver vazia
   } // fim do método isEmpty

   // gera saída do conteúdo de List
   public void print()
   {
      if ( isEmpty() ) 
      {
         System.out.printf( "Empty %s\n", name );
         return;
      } // fim do if

      System.out.printf( "The %s is: ", name );
      ListNode current = firstNode;

      // enquanto não estiver no fim de lista, gera saída dos dados do nó atual
      while ( current != null ) 
      {
         System.out.printf( "%s ", current.data );
         current = current.nextNode;
      } // fim do while

      System.out.println( "\n" );
   } // fim do método print
} // fim da classe List


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