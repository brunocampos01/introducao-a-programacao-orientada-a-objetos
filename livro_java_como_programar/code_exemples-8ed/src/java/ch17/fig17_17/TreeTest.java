// Fig. 17.18: TreeTest.java
// Esse programa testa a classe Tree.

package ch17.fig17_17;

import java.util.Random;
import com.deitel.jhtp6.ch17.Tree;

public class TreeTest 
{
   public static void main( String args[] )
   {
      Tree tree = new Tree();
      int value;
      Random randomNumber = new Random();

      System.out.println( "Inserting the following values: " );

      // insere 10 inteiros aleatórios de 0-99 na árvore
      for ( int i = 1; i <= 10; i++ ) 
      {
         value = randomNumber.nextInt( 100 );
         System.out.print( value + " " );
         tree.insertNode( value );
      } // fim do for

      System.out.println ( "\n\nPreorder traversal" );
      tree.preorderTraversal(); // realiza percurso na pré-ordem da árvore

      System.out.println ( "\n\nInorder traversal" );
      tree.inorderTraversal(); // realiza percurso na ordem da árvore

      System.out.println ( "\n\nPostorder traversal" );
      tree.postorderTraversal(); // realiza percurso na pós-ordem da árvore
      System.out.println();
   } // fim de main
} // fim da classe TreeTest


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