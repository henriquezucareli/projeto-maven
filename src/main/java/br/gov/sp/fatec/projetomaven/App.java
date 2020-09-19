package br.gov.sp.fatec.projetomaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.gov.sp.fatec.projetomaven.entity.Aluno;

public class App 
{
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("avaliacao");
        EntityManager manager = factory.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setNomeUsuario("aluno");
        aluno.setSenha("senha");
        aluno.setRa(1234567891011L);

        try {
            manager.getTransaction().begin();
            manager.persist(aluno);
            manager.getTransaction().commit();
        } catch (PersistenceException e) {
            e.printStackTrace();
            manager.getTransaction().rollback();
        }
     
        manager.close();
    }
}
