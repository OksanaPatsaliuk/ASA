<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Subjects list</title>
</head>
<body class="container">
<#include "*/header.ftl">
<div class="table-responsive" style="background-color:gold">
    <caption> Subjects list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Status</th>
            <th>Time</th>
            <th>Teachers</th>
            <th>Students</th>
            <th>Buttons</th>
            
        </tr>
    <#list subjects as subject>
        <tr>
            <td><a href="/subjects/${subject.id}">${subject.id}</a></td>
            <td>${subject.status?c}</td>
            <td>${subject.time}</td>
            <td>${subject.student.id}</td>
            <td>${subject.user.id}</td>
            <td><a href="delete/${subject.id}">Delete</a>
                <a href="${subject.id}?edit=true">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
</div>

<a href="create">Create new</a>
</body>
</html>