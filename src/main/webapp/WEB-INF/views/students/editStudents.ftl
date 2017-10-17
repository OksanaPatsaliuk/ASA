<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit students</title>
</head>
<body class="container">
<#include "*/header.ftl">

<form action="update" method="post" name="students" class="form-group">
    <input title="Id" type="number" name="id" value="${students.id}" hidden/>
    Name
    <input title="Name" type="text" name="name" value="${students.name}"/>
    Price
    <input title="Price" type="number" name="price" value="${students.price}"/>
    <input type="submit" value="Update"/>
</form>
<a type="button" href="/students/all" class="button">Back</a>
</body>
</html>
