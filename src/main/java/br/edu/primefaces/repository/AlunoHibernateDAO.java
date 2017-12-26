/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.primefaces.repository;

import br.edu.primefaces.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author renato
 */
public class AlunoHibernateDAO implements AlunoDAO {

    private Session session;

    /**
     *
     * @param p
     */
    @Override
    public void alterar(Aluno p) {
        try {
            session = (Session) HibernateUtil.getSessionFactory();
            session.beginTransaction();
            session.update(p);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public Aluno consultar(Aluno aluno) {
        Aluno retorno = new Aluno();
        try {
            session = (Session) HibernateUtil.getSessionFactory();
            session.beginTransaction();
            retorno = (Aluno) session.get(Aluno.class, aluno.getMatricula());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return retorno;
    }

    @Override
    public void excluir(Aluno p) {
        try {
            session = (Session) HibernateUtil.getSessionFactory();
            session.beginTransaction();
            session.delete(p);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void inserir(Aluno p) {
        try {
            session = (Session) HibernateUtil.getSessionFactory();
            session.beginTransaction();
            session.save(p);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Aluno> listar() {
        List<Aluno> lista = new ArrayList<>();
        try {
            session = (Session) HibernateUtil.getSessionFactory();
            session.beginTransaction();
            lista = (List<Aluno>) session.createCriteria(Aluno.class).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return lista;
    }

    @SuppressWarnings("unchecked")
    public List<Aluno> listar(Aluno aluno) {
        Criteria c = session.createCriteria(Aluno.class);
        if (aluno.getNome().length() > 0) {
            c.add(Restrictions.like("nome", aluno.getNome() + "%"));
        }
        c.addOrder(Order.asc("nome"));
        return (List<Aluno>) c.list();
    }

    @Override
    public boolean existe(Aluno aluno) {

        Aluno a = consultar(aluno);
        return (a.getMatricula() != null);
    }
}
