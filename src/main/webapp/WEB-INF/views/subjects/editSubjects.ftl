<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit subjects</title>
</head>
<body class="container">
<#include "*/header.ftl">


<form action="update" method="post" name="subjects" class="form-group">
    <input title="Id" type="number" name="id" value="${subjects.id}" hidden/>
    Status
    <input title="status" type="boolean" name="status" value="${subjects.status?c}"/>
    Time
    <input title="time" type="number" name="time" value="${subjects.time}"/>
    Teachers
    <input title="student" type="number" name="student" value="${subjects.student.id}"/>
    Students
    <input title="user" type="number" name="user" value="${subjects.user.id}"/>
    <input type="submit" value="Update"/>
</form>
<a type="button" href="/subjects/all" class="button">Back</a>
</body>
</html>
