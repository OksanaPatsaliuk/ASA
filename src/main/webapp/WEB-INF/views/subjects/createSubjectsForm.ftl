<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create subjects</title>
</head>
<body class="container">
<#include "*/header.ftl">

<form action="create" method="post" name="subjects" class="form-group">
    Status
    <input title="status" type="text" name="status" "/>
    Time
    <input title="time" type="Time" name="time" "/>
    Teachers
    <input title="students_id" type="number" name="students_id"/>
    Students
    <input title="user_id" type="number" name="user_id"/>
    <input type="submit" value="Create"/>
</form>
<a type="button" href="/subjects/all" class="button">Back</a>
</body>
</html>
