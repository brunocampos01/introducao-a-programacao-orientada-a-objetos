<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<!-- Fig. 27.7: include.jsp -->

<html xmlns = "http://www.w3.org/1999/xhtml">

   <head>
      <title>Using jsp:include</title>

      <style type = "text/css">
         body 
         {
            font-family: tahoma, helvetica, arial, sans-serif; 
         }

         table, tr, td 
         {
            font-size: .9em;
            border: 3px groove;
            padding: 5px;
            background-color: #dddddd; 
         }
      </style>
   </head>

   <body>
      <table>
         <tr>
            <td style = "width: 160px; text-align: center">
               <img src = "images/logotiny.png" 
                  width = "140" height = "93" 
                  alt = "Deitel & Associates, Inc. Logo" />
            </td>
            <td>
               <%-- inclui banner.html nessa JSP --%> 
               <jsp:include page = "banner.html"        
                  flush = "true" />                     
            </td>
         </tr>
         <tr>
            <td style = "width: 160px">
               <%-- inclui toc.html nessa JSP --%>           
               <jsp:include page = "toc.html" flush = "true" />
            </td>
            <td style = "vertical-align: top"> 
               <%-- inclui clock2.jsp nessa JSP --%> 
               <jsp:include page = "clock2.jsp"        
                  flush = "true" />                    
            </td>
         </tr>
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