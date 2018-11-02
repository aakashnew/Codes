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
<title>Insert title here</title>
</head>
<body>
<div style="color:red">
	<html:errors/>
</div>

<html:form  action="AddProduct.do" >

<center>
<div>
	<div>
		<bean:message key="product.label.productname" /> 
	</div> 
    <div>
	<html:text  property="productName"/>
	</div>
</div>
<div>
	<div>
		<bean:message key="product.label.productquantity" /> : 
	</div> 
    <div>
	<html:text  property="productQuantity" />
	</div>
</div>

 <div>
	<div>
		<bean:message key="product.label.productcost" /> : 
	</div> 
    <div>
	<html:text  property="productCost"/>
	</div>
</div>
	<div style="margin-top: 20px;">
		<html:submit>
             <bean:message key="product.label.button.submit" />
        </html:submit>
       </div>
	

</center>


	
	
   

</html:form>
<a href="ProductHome.jsp" ><button>Home</button></a>

</body>
</html>