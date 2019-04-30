<%-- 
    Document   : newjsp
    Created on : May 1, 2019, 3:04:14 AM
    Author     : Nitro
--%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  url="jdbc:mysql://localhost/journal"  user="root"  password=""/>  
<%String u =request.getParameter("title");%>
 
<sql:update var="x" dataSource="${db}"> 
    UPDATE submission  SET   statepost = '2' WHERE  title= ? ;
    <sql:param value="<%= u %>" />
     
</sql:update>"
<% request.removeAttribute("title");
System.out.println("remoooooooooooooooooooooooooooooooooooooooooooo");
%>
 
<% response.sendRedirect("profile.jsp"); %>