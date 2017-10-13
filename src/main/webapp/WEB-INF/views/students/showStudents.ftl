<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "*/header.ftl">
<div class="table-responsive">
    <caption>Students info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${student.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${student.name}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${student.price}</td>
        </tr>

    </table>
</div>
<a type="button" href="all" class="button">Back</a>
</body>
