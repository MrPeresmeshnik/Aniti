<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<div id="body">
    <c:forEach items="${requestScope.animeList}" var="animeInf">
    <div class="rated">
        <div class="img">
            <img width="225" height="310" src=
                <c:out value="${animeInf.getImg()}"/>
                    </div>
            <div class="title">
                <c:out value="${animeInf.getName_en()}"/>
            </div>
            <div class="description">
                <c:out value="${animeInf.getDescription()}"/>
            </div>
        </div>
        </c:forEach>
    </div>


    <form class="CubeImg">
        <a href="/random">
            <img src="smile.gif"/>
        </a>
    </form>


</body>
</html>
