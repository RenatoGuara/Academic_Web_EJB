<%-- 
    Document   : aluno
    Created on : 26/12/2017, 11:27:27
    Author     : renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Aluno</title>
    </head>
    <body>
        <div align="center">
            <form method="post" action="AlunoServlet">
                <fieldset>
                    <legend>Cadastro de Alunos</legend>
                    <label>Matrícula: </label><input name="matricula" required
                                                     value="${aluno.matricula}"
                                                     placeholder="2236541" /><br /> 
                    <label>Name:</label><input
                        name="nome" autofocus="autofocus" placeholder="Nome"  value="${aluno.nome}"/><br />

                    <label>Telefone:</label><input
                        type="tel" name="telefone" placeholder="9999-9999" value="${aluno.telefone}" /><br />
                    <label>Email:</label><input
                        type="email" name="email" placeholder="andre@feltex.com.br"  value="${aluno.email}"/><br />	
                    <label>Data Cadastro:</label>
                    <input type="date" name="dataCadastro" value="${aluno.dataCadastro}"
                           placeholder="10/10/2014" /><br /> <label>Ação</label> <select
                           name="acao" required>
                        <option selected value="Incluir">Incluir</option>
                        <option value="Alterar">Alterar</option>
                        <option value="Excluir">Excluir</option>
                        <option value="Consultar">Consultar</option>
                    </select><br /> <input type="submit" value="Enviar"> <input
                        type="reset" value="Limpar"> <br />
                </fieldset>
            </form>
        </div>
    </body>
</html>
