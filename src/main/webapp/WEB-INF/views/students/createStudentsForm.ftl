<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "*/header.ftl">

<form action="create" method="post" name="students" class="form-group">
    Name
    <input title="Name" type="text" name="name" "/>
   Price
    <input title="Price" type="number" name="price"/>
    <input type="submit" value="Create"/>
</form>
<a type="button" href="/students/all" class="button">Back</a>
</body>
</html>
