<%-- 
    Document   :q4 Created on : Oct 24, 2017, 4:34:51 PM
    Author     : bsc3
--%>


<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name=(String)request.getParameter("str");
            int hr=LocalDateTime.now().getHour();
            
            if(hr<12){
                out.println("Good Morning"+name);
            }
            else if(hr>12&&hr<17){
                out.println("Good afternoon"+name);
            }
            else{
                out.println("Good evening"+name);
            }
            
            
        %>
    </body>
</html>