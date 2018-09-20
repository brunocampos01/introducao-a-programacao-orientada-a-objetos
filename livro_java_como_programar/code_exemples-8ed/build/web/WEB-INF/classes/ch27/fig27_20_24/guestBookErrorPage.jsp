<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EM"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<!-- Fig. 27.24: guestBookErrorPage.jsp -->

<%-- configurações de página --%>
<%@ page isErrorPage = "true" %>  
<%@ page import = "java.util.*" %>
<%@ page import = "java.sql.*" %>

<html xmlns = "http://www.w3.org/1999/xhtml">
   <head>
      <title>Error!</title>
      <style type = "text/css">
         .bigRed 
         {
            font-size: 2em;
            color: red; 
            font-weight: bold;
         }
      </style>
   </head>
   <body>
      <p class = "bigRed"> 
      <% // scriptlet para determinar o tipo de exceção
         // e gera saída do começo da mensagem de erro
         if ( exception instanceof SQLException )
         {                                       
      %>                                         

            A SQLException
      
      <%                                                        
         } // fim do if                                            
         else if ( exception instanceof ClassNotFoundException )
         {                                                      
      %>                                                        

            A ClassNotFoundException
      
      <%                 
         } // fim de else if
         else            
         {               
      %>                 

            An exception

      <%              
         } // fim de else
      %>              
      <%-- fim de scriptlet para inserir de dados de template fixa --%> 

         <%-- continua saída de mensagem de erro --%> 
         occurred while interacting with the guestbook database. 
      </p>
      <p class = "bigRed">
         The error message was:<br />
         <%= exception.getMessage() %>
      </p>
      <p class = "bigRed">Please try again later</p>
   </body>
</html>

<!--
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
-->