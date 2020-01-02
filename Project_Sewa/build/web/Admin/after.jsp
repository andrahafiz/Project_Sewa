<%-- 
    Document   : after
    Created on : Jan 3, 2020, 12:00:19 AM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String pesan = (String) request.getAttribute("pesan");%>
<!DOCTYPE html>
<html>
    <head>
      
        <!--        <META HTTP-EQUIV="REFRESH" 
                      CONTENT="0; URL='Admin/index.jsp?hlm=barang">-->

    </head>
    <body onload="redirect()">
       
        <script type="text/javascript">
            function redirect() {
          window.location = "Admin/index.jsp?hlm=<%=pesan%>";
            }
        </script>
    </body>
</html>
