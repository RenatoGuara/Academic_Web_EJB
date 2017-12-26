/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.primefaces.managedBean;

import br.edu.primefaces.modelo.Aluno;
import br.edu.primefaces.repository.AlunoDAO;
import br.edu.primefaces.repository.DAOFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author renato
 */
@Named
@RequestScoped
public class AlunoMB implements Serializable {

    private static final long serialVersionUID = 1L;

    private Aluno aluno;
    private List<Aluno> lista = new ArrayList<>();

    AlunoDAO dao = DAOFactory.getAlunoDAO();

    public AlunoMB() {
        aluno = new Aluno();
        listar();
    }

    public void alterar() {
        System.out.println("Alterar aluno");
        dao.alterar(aluno);
        listar();
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Manutenção de usuário: ", "Usuario alterado com sucesso!"));
    }

    public void consultar() {
        long matriculaConsulta = aluno.getMatricula();
        System.out.println("Consultar");
        aluno = dao.consultar(aluno);
        if (aluno == null || aluno.getMatricula() == 0) {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,"Manutenção de usuário: ","Usuario não encontrado matrícula:" + matriculaConsulta + "!"));
        }
        listar();

    }

    public void excluir() {
        System.out.println("Excluir aluno");
        dao.excluir(aluno);
        listar();
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Manutenção de usuário: ", "Usuario excluído com sucesso!"));
    }

    public Aluno getAluno() {
        return aluno;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    /**
     *
     * @param aluno
     */
    public void incluir(Aluno aluno) {
        System.out.println("Incluir aluno");
        dao.inserir(aluno);
        listar();
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Manutenção de usuário: ", "Usuario incluido com sucesso!"));
    }

    public void limpar() {
        System.out.println("Limpar");
        System.out.println(aluno);
        aluno = new Aluno();
    }

    public void listar() {
        System.out.println("Listar aluno");
        lista = dao.listar();
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }
}
