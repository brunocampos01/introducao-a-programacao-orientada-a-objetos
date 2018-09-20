// Fig. 19.20: WordTypeCount.java
// Programa conta o número de ocorrências de cada palavra em uma string

package ch19.fig19_20;

import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount
{
   private Map< String, Integer > map;
   private Scanner scanner;

   public WordTypeCount()
   {
      map = new HashMap< String, Integer >();// cria HashMap
      scanner = new Scanner( System.in ); // cria scanner
      createMap(); // cria mapa baseado na entrada de usuário
      displayMap(); // exibe conteúdo do mapa
   } // fim do construtor WordTypeCount
   
   // cria mapa de entrada de usuário
   private void createMap() 
   {
      System.out.println( "Enter a string:" ); // solicita a entrada de usuário
      String input = scanner.nextLine();

      // cria StringTokenizer para a entrada
      StringTokenizer tokenizer = new StringTokenizer( input );
               
      // processamento texto de entrada 
      while ( tokenizer.hasMoreTokens() ) // enquanto houver mais entrada
      {
         String word = tokenizer.nextToken().toLowerCase(); // obtém palavra
                  
         // se o mapa contiver a palavra
         if (map.containsKey( word )) // palavra está no mapa
         {
            int count = map.get( word ); // obtém contagem atual
            map.put( word, count + 1 );// incrementa a contagem de 
         } // fim do if
         else 
            map.put( word, 1 );// adiciona nova palavra com uma contagem de 1 ao mapa
       } // fim do while
   } // fim do método createMap
   
   // exibe conteúdo do mapa
   private void displayMap() 
   {      
      Set< String > keys = map.keySet();// obtém as chaves

      // classifica as chaves 
      TreeSet< String > sortedKeys = new TreeSet< String >( keys );

      System.out.println( "Map contains:\nKey\t\tValue" );

      // gera saída de cada chave no mapa
      for ( String key : sortedKeys )
         System.out.printf( "%-10s%10s\n", key, map.get( key ));
      
      System.out.printf( 
         "\nsize:%d\nisEmpty:%b\n", map.size(),map.isEmpty());
   } // fim do método displayMap

   public static void main( String args[] )
   {
      new WordTypeCount();
   } // fim de main
} // fim da classe WordTypeCount 


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