<%-- 
    Document   : menu
    Created on : 26/12/2017, 11:46:03
    Author     : renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu de opções</title>
    </head>
    <body>
        <div align="center">
            <H1>Seja bem vindo ao sistema AcademicNet!</H1>
            <a href="cadastroAluno.xhtml">Manter Aluno JSF</a><br>
            <a href="aluno.jsp">Manter Aluno</a><br>
            <a href="AlunoServlet?acao=Listar">Listar Alunos</a><br>
            <a href="professor.jsp">Manter Professor</a><br>
            <a href="ProfessorServlet?acao=Listar">Listas Professor</a><br>
            <a href="usuario.jsp">Manter Usuario</a><br>
            <a href="UsuarioServlet?acao=Listar">Listar Usuario</a><br>
            <a href="turma.jsp">Manter Turma</a><br>
            <a href="TurmaServlet?acao=Listar">Listar Turma</a><br>
        </div>
    </body>
</html>
