<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<!-- Fig. 27.23: guestBookView.jsp -->

<%-- configurações de página --%>
<%@ page errorPage = "guestBookErrorPage.jsp" %>   
<%@ page import = "java.util.*" %>                 
<%@ page import = "com.deitel.jhtp6.jsp.beans.*" %>

<%-- GuestDataBean para obter lista de convidado --%> 
<jsp:useBean id = "guestData" scope = "request"         
   class = "com.deitel.jhtp6.jsp.beans.GuestDataBean" />

<html xmlns = "http://www.w3.org/1999/xhtml">
   <head>
      <title>Guest List</title>
      <style type = "text/css">
         body 
         {
            font-family: tahoma, helvetica, arial, sans-serif; 
         }
         table, tr, td, th
         { 
            text-align: center;
            font-size: .9em;
            border: 3px groove;
            padding: 5px;
            background-color: #dddddd;
         }
      </style>
   </head>
   <body>
      <p style = "font-size: 2em;">Guest List</p>
      <table>
         <thead>
            <tr>
               <th style = "width: 100px;">Last name</th>
               <th style = "width: 100px;">First name</th>
               <th style = "width: 200px;">Email</th>
            </tr>
         </thead>
         <tbody>
         <% // inicia o scriptlet                                   
            List guestList = guestData.getGuestList();         
            Iterator guestListIterator = guestList.iterator();
            GuestBean guest;                                   
                                                               
            while ( guestListIterator.hasNext() )              
            {                                                  
               guest = ( GuestBean ) guestListIterator.next();
         %> <%-- fim do scriptlet; insere de dados de template fixa --%> 
               <tr>
                  <td><%= guest.getLastName() %></td>
                  <td><%= guest.getFirstName() %></td>
                  <td>
                     <a href = "mailto: <%= guest.getEmail() %>">
                        <%= guest.getEmail() %></a>
                  </td>
               </tr>
         <% // continua scriptlet                                
            } // fim do while
         %> <%-- fim de scriptlet --%>
         </tbody>
      </table>
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