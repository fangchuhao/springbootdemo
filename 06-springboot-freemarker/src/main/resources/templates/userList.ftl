<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>名字</th>
            <th>性别</th>
            <th>年龄</th>
        </tr>
        <#list users as user>
            <tr align="center">
                <td>${user.username}</td>
                <td>${user.sex}</td>
                <td>${user.age}</td>
            </tr>
        </#list>
    </table>
</body>
</html>