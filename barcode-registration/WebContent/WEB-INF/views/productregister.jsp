<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
 <div align="center">
  <h1>Product Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Barcode</td>
     <td><input type="text" name="Barcode" /></td>
    </tr>
    <tr>
     <td>ProductName</td>
     <td><input type="text" name="ProductName" /></td>
    </tr>
    <tr>
     <td>ProductColour</td>
     <td><input type="text" name="ProductColour" /></td>
    </tr>
    <tr>
     <td>ProductDescription</td>
     <td><input type="password" name="ProductDescription" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>