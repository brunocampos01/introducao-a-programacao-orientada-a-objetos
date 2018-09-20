// Exercícios 6.6: Sphere.java
// Calcula o volume de uma esfera.

package ch06.ex06_06;

import java.util.Scanner;

public class Sphere
{
   // obtém o raio a parti do usuário e exibe o volume da esfera
   public void determineSphereVolume()
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter radius of sphere: " );
      double radius = input.nextDouble();

      System.out.printf( "Volume is %f\n", sphereVolume( radius ) );
   } // fim do método determineSphereVolume

   // calcula e retorna o volume da esfera
   public double sphereVolume( double radius )
   {
      double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
      return volume;
   } // fim do método sphereVolume
} // fim da classe Sphere


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