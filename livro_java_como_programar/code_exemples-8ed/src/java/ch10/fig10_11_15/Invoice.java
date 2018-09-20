// Fig. 10.12: Invoice.java
// Classe Invoice que implementa Payable.

package ch10.fig10_11_15;

public class Invoice implements Payable
{
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   // construtor com quatro argumentos
   public Invoice( String part, String description, int count, 
      double price )
   {
      partNumber = part;
      partDescription = description;
      setQuantity( count ); // valida e armazena a quantidade
      setPricePerItem( price ); // valida e armazena o preço por item
   } // fim do construtor Invoice de quatro argumentos

   // configura número de peças
   public void setPartNumber( String part )
   {
      partNumber = part;  
   } // fim do método setPartNumber

   // obtém o número da peça
   public String getPartNumber()
   {
      return partNumber;
   } // fim do método getPartNumber

   // configura a descrição
   public void setPartDescription( String description )
   {
      partDescription = description;
   } // fim do método setPartDescription

   // obtém a descrição
   public String getPartDescription()
   {
      return partDescription;
   } // fim do método getPartDescription

   // configura a quantidade
   public void setQuantity( int count )
   {
      quantity = ( count < 0 ) ? 0 : count; // quantidade não pode ser negativa
   } // fim do método setQuantity

   // obtém quantidade
   public int getQuantity()
   {
      return quantity;
   } // fim do método getQuantity

   // configura preço por item
   public void setPricePerItem( double price )
   {
      pricePerItem = ( price < 0.0 ) ? 0.0 : price; // valida preço
   } // fim do método setPricePerItem

   // obtém preço por item
   public double getPricePerItem()
   {
      return pricePerItem;
   } // fim do método getPricePerItem

   // retorno da representação de String do objeto Invoice
   public String toString()
   {
      return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem() );
   } // fim do método toString

   // método requerido para executar o contrato com a interface Payable
   public double getPaymentAmount()                                    
   {                                                                   
      return getQuantity() * getPricePerItem(); // calcula custo total
   } // fim do método getPaymentAmount
} // fim da classe Invoice


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