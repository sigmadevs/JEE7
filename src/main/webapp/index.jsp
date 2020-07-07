<%@page import="java.util.Date"%>
<html>
   <head>
      <title> JEE 7</title>
   </head>
   <body>
         <h1> Hello world! </h1>
      <%
         Date date = new Date();
         out.print( "<h2>" +date.toString()+"</h2>");
      %>
   </body>
</html>
