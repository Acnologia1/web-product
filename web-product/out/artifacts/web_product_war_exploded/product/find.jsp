<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>find product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Name: </td>
            <td>${requestScope["product"].getName()}</td>
        </tr>
        <tr>
            <td>Price : </td>
            <td>${requestScope["product"].getPrice()}</td>
        </tr>
        <tr>
            <td>Desscribe : </td>
            <td>${requestScope["product"].getDesscribe()}</td>
        </tr>
        <tr>
            <td>Producer: </td>
            <td>${requestScope["product"].getProducer()}</td>
        </tr>
        <tr>
            <td>Avatar: </td>
            <td>
                <img src="<%request.getServletContext().getRealPath("");%>/uploadDir/${product.getAvatar()}" id="uploadDir">
            </td>
        </tr>

    </table>
</form>
</body>
</html>