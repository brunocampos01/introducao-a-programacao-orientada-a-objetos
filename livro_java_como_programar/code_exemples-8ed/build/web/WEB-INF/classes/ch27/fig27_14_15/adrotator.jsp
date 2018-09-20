<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EM"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<!-- Fig. 27.15: adrotator.jsp -->

<jsp:useBean id = "rotator" scope = "session"      
   class = "com.deitel.jhtp6.jsp.beans.Rotator" />

<html xmlns = "http://www.w3.org/1999/xhtml">
   <head>
      <title>AdRotator Example</title>
      <style type = "text/css">
         .big { font-family: helvetica, arial, sans-serif;
                font-weight: bold;
                font-size: 2em }
      </style>
      <%-- atualiza anúncio --%>
      <% rotator.nextAd(); %>
   </head>
   <body>
      <p class = "big">AdRotator Example</p>
      <p> 
         <a href = "<jsp:getProperty name = "rotator" 
            property = "link" />">

            <img src = "<jsp:getProperty name = "rotator"
               property = "image" />" alt = "advertisement" />
         </a>
      </p>
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