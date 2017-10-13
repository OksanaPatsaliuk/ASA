<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "*/header.ftl">
<div class="table-responsive" style="background-color:chartreuse">
    <caption>Students list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Buttons</th>
        </tr>
    <#list students as student>
        <tr>
            <td><a href="/students/${student.id}">${student.id}</a></td>
            <td>${student.name}</td>
            <td>${student.price}</td>

            <td><a href="delete/${student.id}">Delete</a>
                <a href="${student.id}?edit=true">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
</div>
<a href="create">Create new</a>
</body>
</html>