<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 13.12.2015
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <link rel="stylesheet" href="Style.css">
  <body>
  <form action="/add" method="POST" id="search" class="cf">
    <button type="submit">Поиск</button>
    <input name="search" type="text" placeholder="Введите название аниме"
           required>
  </form>

  <form class="CubeImg">
    <a href="/delete?id=1">
     <img src="Cube.png" />
    </a>
  </form>



  </body>
</html>
