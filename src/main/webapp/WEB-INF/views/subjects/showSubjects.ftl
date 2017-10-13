<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show subjects</title>
</head>
<body class="container">
<#include "*/header.ftl">
<caption>Subjects info</caption>
<table class="table table-striped">
    <tr>
        <td>Id</td>
        <td>${subject.id}</a></td>
    </tr>
    <tr>
        <td>Status</td>
        <td>${subject.status}</td>
    </tr>
    <tr>
        <td>Time</td>
        <td>${subject.time}</td>
    </tr>
    <tr>
        <td>Teachers</td>
        <td>${subject.studentsId_id}</td>
    </tr>
    <tr>
        <td>Students</td>
        <td>${subject.userId_id}</td>
    </tr>
</table>
</div>
<a type="button" href="all" class="button">Back</a>
</body>
</html>