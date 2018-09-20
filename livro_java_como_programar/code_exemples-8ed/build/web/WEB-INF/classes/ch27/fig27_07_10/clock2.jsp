<!-- Fig. 27.10: clock2.jsp                        -->
<!-- data e hora a incluir em outro documento -->

<table>
   <tr>
      <td style = "background-color: black;">
         <p class = "big" style = "color: cyan; font-size: 3em; 
            font-weight: bold;">

            <%-- script para determinar local de cliente e --%>
            <%-- formatar data de maneira correspondente               --%>
            <%                                               
               // obtém o local do cliente
               java.util.Locale locale = request.getLocale();
                                                             
               // obtém DateFormat para o Locale do cliente         
               java.text.DateFormat dateFormat =             
                  java.text.DateFormat.getDateTimeInstance(  
                     java.text.DateFormat.LONG,              
                     java.text.DateFormat.LONG, locale );    
                                                             
            %>  <%-- fim de script --%>                         
                                               
            <%-- saída da data --%>
            <%= dateFormat.format( new java.util.Date() ) %>
         </p> 
      </td>
   </tr>
</table>

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