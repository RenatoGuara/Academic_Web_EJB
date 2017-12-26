/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.primefaces.main;

import br.edu.primefaces.repository.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author renato
 */
public class GeneratedSchema {

    public static void main(String[] args) throws Exception {

        Session sessao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            System.out.println("Conectou! Renato!!!");

        } finally {

            sessao.close();
        }
    }

}
