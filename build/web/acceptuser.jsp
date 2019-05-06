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
<%String u = request.getParameter("uname");%>
<%String p = request.getParameter("perm_id");%>
<sql:update var="x" dataSource="${db}"> 
    UPDATE userpermetion  SET   states = '1' WHERE uname= ? and perm_id= ? ;
    <sql:param value="<%= u%>" />
    <sql:param value="<%= p%>" />
</sql:update>"
<% request.removeAttribute("uname");%>
<% request.removeAttribute("perm_id");%>
<% response.sendRedirect("ManageUsers.jsp");%>