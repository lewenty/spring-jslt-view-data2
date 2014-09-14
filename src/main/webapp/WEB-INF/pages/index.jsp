<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h5>index page...</h5>
<hr/>

<%--kullanım 1--%>
<c:forEach var="bilgi" items="${bilgiler}">
    <c:choose>
        <c:when test="${bilgi.adi!=null && bilgi.adi!=''}">
            <p> Adi :  ${bilgi.adi} &nbsp;</p>
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${bilgi.soyadi!=null && bilgi.soyadi!=''}">
            <p> Soyadi :  ${bilgi.soyadi} &nbsp;</p>
        </c:when>
    </c:choose>
</c:forEach>

<hr/>

<%--kullanım2--%>
<c:if test="${not empty diller}">

    <ul>
        <c:forEach var="listLangs" items="${diller}">
            <li>${listLangs}</li>
        </c:forEach>
    </ul>

</c:if>
</body>
</html>