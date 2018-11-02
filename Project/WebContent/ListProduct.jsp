<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

	<div class="w3-container w3-teal">
		<h1>Mobile Store</h1>
	</div>

	<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}
</style>
</head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ProductList</title>
</head>
<body>
<table border="2">
<tr ><td><b>Product Id</b></td><td><b>Product Name</b></td><td><b>Quantity</b></td><td><b>Price</b></td></tr>

 <logic:iterate id="product" name="dynaCustomerListForm" property="productlist"> 
<%-- <logic:iterate id="product" name="productlist"> --%>
<tr>
<td><bean:write name="product" property="productId"/></td>
<td><bean:write name="product" property="productName"/></td>
<td><bean:write name="product" property="productQuantity"/></td>
<td><bean:write name="product" property="productCost"/></td>
 

</tr>
</logic:iterate> 

</table>
<a href="ProductHome.jsp" ><button>Home</button></a>

</body>
</html>