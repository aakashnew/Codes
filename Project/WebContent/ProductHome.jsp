<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
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
<title>Product Home</title>
</head>
<body>
<h2>
 <html:link action="/AddProductPage.do"><button>Add Product</button></html:link> 
</h2>

<h2>

 <html:link action="/DeleteProductPage.do"><button>Delete Product</button></html:link> 

</h2>
<h2>

 <html:link action="/ListProductPage.do"><button>List All Product</button></html:link> 

</h2>

<h2>
 <html:link action="/UpdateProductPage.do"><button>Update Product</button></html:link> 

</h2>


</body>
</html>
