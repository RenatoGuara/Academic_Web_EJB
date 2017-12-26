<%-- 
    Document   : sucesso
    Created on : 26/12/2017, 11:39:57
    Author     : renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Sucesso</title>
    </head>
    <body>
        <H1>Mensagem JSTL:	<c:out value="${mensagem}" /></H1>	
            <jsp:include page="alunoLista.jsp"/>
    </body>
</html>
