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
<h2>Product Information</h2>
<form:form method="POST" action="/dispatcher-servlet/addproduct">
   <table>
    <tr>
  
        <td><form:label path="Product_Id">Product ID</form:label></td>
        <td><form:input path="Product_Id" /></td>
    </tr>
    <tr>
        <td><form:label path="Group_Name">Group_Name</form:label></td>
        <td><form:input path="Group_Name" /></td>
    </tr>
    <tr>
        <td><form:label path="Name">PRODUCT_NAME</form:label></td>
        <td><form:input path="Name" /></td>
    </tr>
     <tr>
        <td><form:label path="Qty">PRODUCT_QTY</form:label></td>
        <td><form:input path="Qty" /></td>
    </tr>
       <tr>
        <td><form:label path="Image_path">IMAGE</form:label></td>
        <td><form:input path="Image_path" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>