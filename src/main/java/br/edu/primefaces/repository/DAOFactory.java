/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.primefaces.repository;

/**
 *
 * @author renato
 */
public class DAOFactory {

    public static AlunoDAO getAlunoDAO() {
        return new AlunoHibernateDAO();
    }

}
