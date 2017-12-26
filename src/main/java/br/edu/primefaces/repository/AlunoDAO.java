/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.primefaces.repository;

import br.edu.primefaces.modelo.Aluno;
import java.util.List;

/**
 *
 * @author renato
 */
public interface AlunoDAO {

    public void alterar(Aluno aluno);

    public Aluno consultar(Aluno aluno);

    public void excluir(Aluno aluno);

    public boolean existe(Aluno aluno);

    public void inserir(Aluno aluno);

    public List<Aluno> listar();

}
