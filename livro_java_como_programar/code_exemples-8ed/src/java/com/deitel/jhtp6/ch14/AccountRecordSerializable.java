// Fig. 14.17: AccountRecordSerializable.java
// Uma classe que representa um registro das informações.
package com.deitel.jhtp6.ch14; // empacotada para reutilização

import java.io.Serializable;

public class AccountRecordSerializable implements Serializable
{
   private int account;
   private String firstName;
   private String lastName;
   private double balance;
   
   // construtor sem argumentos chama outro construtor com valores padrão
   public AccountRecordSerializable() 
   {
      this( 0, "", "", 0.0 );
   } // fim do construtor sem argumentos AccountRecordSerializable
  
   // construtor com quatro argumentos inicializa um registro
   public AccountRecordSerializable( 
      int acct, String first, String last, double bal )
   {
      setAccount( acct );
      setFirstName( first );
      setLastName( last );
      setBalance( bal );
   } // fim do construtor de AccountRecordSerializable com quatro argumentos

   // configura o número de conta
   public void setAccount( int acct )
   {
      account = acct;
   } // fim do método setAccount

   // obtém número de conta
   public int getAccount() 
   { 
      return account; 
   } // fim do método getAccount
   
   // configura o nome 
   public void setFirstName( String first )
   {
      firstName = first;
   } // fim do método setFirstName

   // obtém o primeiro nome
   public String getFirstName() 
   { 
      return firstName; 
   } // fim do método getFirstName
   
   // configura o sobrenome 
   public void setLastName( String last )
   {
      lastName = last;
   } // fim do método setLastName

   // obtém o ultimo nome
   public String getLastName() 
   {
      return lastName; 
   } // fim do método getLastName
   
   // configura saldo
   public void setBalance( double bal )
   {
      balance = bal;
   } // fim do método setBalance

   // obtém saldo
   public double getBalance() 
   { 
      return balance; 
   } // fim do método getBalance
} // fim da classe AccountRecordSerializable


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