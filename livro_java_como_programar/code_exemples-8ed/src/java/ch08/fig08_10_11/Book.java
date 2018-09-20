// Fig. 8.10: Book.java
// Declarando um tipo enum com um construtor e campos de instância explícitos
// e métodos de acesso para esses campos

package ch08.fig08_10_11;

public enum Book 
{
   // declara constantes do tipo enum
   JHTP6( "Java How to Program 6e", "2005" ),                       
   CHTP4( "C How to Program 4e", "2004" ),                          
   IW3HTP3( "Internet & World Wide Web How to Program 3e", "2004" ),
   CPPHTP4( "C++ How to Program 4e", "2003" ),                      
   VBHTP2( "Visual Basic .NET How to Program 2e", "2002" ),         
   CSHARPHTP( "C# How to Program", "2002" );                        

   // campos de instância
   private final String title; // título de livro
   private final String copyrightYear; // ano dos direitos autorais

   // construtor enum
   Book( String bookTitle, String year ) 
   { 
      title = bookTitle;
      copyrightYear = year;
   } // fim do construtor enum Book

   // método de acesso para título de campo
   public String getTitle()
   {
      return title;
   } // fim do método getTitle

   // método de acesso para o campo copyrightYear
   public String getCopyrightYear()
   {
      return copyrightYear;
   } // fim do método getCopyrightYear
} // fim do enum Book


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