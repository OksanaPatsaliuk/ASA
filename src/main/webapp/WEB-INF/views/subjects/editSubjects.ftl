<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit subjects</title>
</head>
<body class="container">
<#include "*/header.ftl">


<form action="update" method="post" name="subjects" class="form-group">
    <input title="Id" type="number" name="id" value="${subject.id}" hidden/>
    Status
    <input title="status" type="text" name="status" value="${subject.status}"/>
    Time
    <input title="time" type="number" name="time" value="${subject.time}"/>
    Teachers
    <input title="studentsId_id" type="number" name="studentsId" value="${subject.studentsId_id}"/>
    Students
    <input title="userId_id" type="number" name="userId" value="${subject.userId_id}"/>
    <input type="submit" value="Update"/>
</form>
<a type="button" href="/subjects/all" class="button">Back</a>
</body>
</html>
