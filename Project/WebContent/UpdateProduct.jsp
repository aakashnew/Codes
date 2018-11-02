<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
input[type=text] {
   width: 25%;
   padding: 12px 20px;
   margin: 8px 0;
   box-sizing: border-box;
   border: 1px solid black;
   border-radius: 4px;
}
textarea {
   width: 25%;
   height: 150px;
   padding: 12px 20px;
   box-sizing: border-box;
   border: 1px solid black;
   border-radius: 4px;
   background-color: #f8f8f8;
   font-size: 16px;
   resize: none;
}
/* Set a style for all buttons */
input[type=submit],input[type=reset] {
   background-color: #4CAF50;
   color: white;
   padding: 14px 20px;
   margin: 8px 0;
   border: none;
   cursor: pointer;
   width: 100%;
   
}

</style>
</head>
<body>
<div style="padding:24px"> 
<html:form action="/updateProduct.do" focus="productId">
<table>
<tr>
<td>productId</td>

<td><html:text property="productId"/></td>

<td><html:submit value="Update Product"/></td>
</tr>
</table>

</html:form>
<a href="ProductHome.jsp" ><button>Home</button></a>

</div>

</body>
</html>