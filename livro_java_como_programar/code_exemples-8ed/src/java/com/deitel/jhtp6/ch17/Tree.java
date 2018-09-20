// Fig. 17.17: Tree.java
// Definição da classe TreeNode e classe Tree.
package com.deitel.jhtp6.ch17;

// definição da classe TreeNode
class TreeNode
{
   // membros de acesso de pacote
   TreeNode leftNode; // nó esquerdo
   int data; // valor do nó
   TreeNode rightNode; // nó direito

   // construtor inicializa os dados e os torna um nó-folha
   public TreeNode( int nodeData )
   { 
      data = nodeData;              
      leftNode = rightNode = null; // o nó não tem nenhum filho
   } // fim construtor sem argumento TreeNode

   // localiza ponto de inserção e insere novo nó; ignora os valores duplicados
   public void insert( int insertValue )
   {
      // insere na subárvore esquerda
      if ( insertValue < data ) 
      {
         // insere novo TreeNode
         if ( leftNode == null )
            leftNode = new TreeNode( insertValue );
         else // continua percorrendo subárvore esquerda
            leftNode.insert( insertValue ); 
      } // fim do if
      else if ( insertValue > data ) // insere na subárvore direita
      {
         // insere novo TreeNode
         if ( rightNode == null )
            rightNode = new TreeNode( insertValue );
         else // continua percorrendo subárvore direita
            rightNode.insert( insertValue ); 
      } // fim de else if
   } // fim do método insert
} // fim da classe TreeNode

// definição da classe Tree
public class Tree
{
   private TreeNode root;

   // construtor inicializa uma Tree de inteiros vazia
   public Tree() 
   { 
      root = null; 
   } // fim construtor sem argumento Tree

   // insere um novo nó na árvore de pesquisa binária
   public void insertNode( int insertValue )
   {
      if ( root == null )
         root = new TreeNode( insertValue ); // cria o nó raiz aqui
      else
         root.insert( insertValue ); // chama o método insert
   } // fim do método insertNode

   // inicia percurso na pré-ordem
   public void preorderTraversal()
   { 
      preorderHelper( root ); 
   } // fim do método preorderTraversal

   // método recursivo para realizar percurso na pré-ordem
   private void preorderHelper( TreeNode node )
   {
      if ( node == null )
         return;

      System.out.printf( "%d ", node.data ); // gera saída de dados do nó
      preorderHelper( node.leftNode );       // percorre subárvore esquerda
      preorderHelper( node.rightNode );      // percorre subárvore direita
   } // fim do método preorderHelper

   // inicia percurso na ordem
   public void inorderTraversal()
   { 
      inorderHelper( root ); 
   } // fim do método inorderTraversal

   // método recursivo para realizar percurso na ordem
   private void inorderHelper( TreeNode node )
   {
      if ( node == null )
         return;

      inorderHelper( node.leftNode );        // percorre subárvore esquerda
      System.out.printf( "%d ", node.data ); // gera saída de dados do nó
      inorderHelper( node.rightNode );       // percorre subárvore direita
   } // fim do método inorderHelper

   // inicia percurso na pós-ordem
   public void postorderTraversal()
   { 
      postorderHelper( root ); 
   } // fim do método postorderTraversal

   // método recursivo para realizar percurso na pós-ordem
   private void postorderHelper( TreeNode node )
   {
      if ( node == null )
         return;
  
      postorderHelper( node.leftNode );      // percorre subárvore esquerda
      postorderHelper( node.rightNode );     // percorre subárvore direita
      System.out.printf( "%d ", node.data ); // gera saída de dados do nó
   } // fim do método postorderHelper
} // fim da classe Tree


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