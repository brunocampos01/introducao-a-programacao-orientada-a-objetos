// Fig. 15.15: TowersOfHanoi.java
// O programa resolve o problema torres de Hanói, e
// demonstra a recursão.

package ch15.fig15_15_16;

public class TowersOfHanoi
{
   int numDisks; // número de discos a serem movidos

   public TowersOfHanoi( int disks )
   {
      numDisks = disks;
   } // fim do construtor TowersOfHanoi

   // move os discos recursivamente pelas torres
   public void solveTowers( int disks, int sourcePeg, int destinationPeg,
      int tempPeg )                                                      
   {                                                                     
      // caso básico -- somente um disco a ser movido
      if ( disks == 1 )                                                  
      {                                                                  
         System.out.printf( "\n%d --> %d", sourcePeg, destinationPeg );  
         return;                                                         
      } // fim do if                                                        
                                                                         
      // passo de recursão -- move o disco p/ tempPeg, e depois p/ destinationPeg
      // move ( disks  - 1 ) discos de sourcePeg para tempPeg recursivamente
      solveTowers( disks - 1, sourcePeg, tempPeg, destinationPeg );      
                                                                         
      // move o último disco de sourcePeg para destinationPeg
      System.out.printf( "\n%d --> %d", sourcePeg, destinationPeg );     
                                                                         
      // move ( disks  - 1 ) discos de tempPeg para destinationPeg
      solveTowers( disks - 1, tempPeg, destinationPeg, sourcePeg );      
   } // fim do método solveTowers
} // fim da classe TowersOfHanoi 


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