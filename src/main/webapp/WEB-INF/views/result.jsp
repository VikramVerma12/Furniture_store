<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Submitted product Information</h2>
   <table>
    <tr>
        <td>Product ID</td>
        <td>${Product_Id}</td>
    </tr>
    <tr>
        <td>Group_Name</td>
        <td>${Group_Name}</td>
    </tr>
     <tr>
        <td>Product_Name</td>
        <td>${Name}</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${Price}</td>
    </tr>
    <tr>
        <td>Quantity</td>
        <td>${Qty}</td>
    </tr>
    <tr>
        <td>Image</td>
        <td>${Image_path}</td>
    </tr>
</table>  
</body>
</html>
