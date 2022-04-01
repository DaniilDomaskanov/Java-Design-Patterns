<%--
  Created by IntelliJ IDEA.
  User: DaniilDamaskanau
  Date: 4/1/2022
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
 <jsp:useBean id="studentDetails" type="com.udemy.patterns.StudentVO" scope="request"/>
 Student id : <jsp:getProperty name="studentDetails" property="id"/>
 Student name : <jsp:getProperty name="studentDetails" property="name"/>
</body>
</html>
