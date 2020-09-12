package br.gov.sp.fatec.projetomaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.gov.sp.fatec.projetomaven.entity.Aluno;

public class App 
{
    public static void main( final String[] args) {
        final EntityManagerFactory factory = Persistence.createEntityManagerFactory("avaliacao");
        final EntityManager manager = factory.createEntityManager();

        final Aluno aluno = new Aluno();
        aluno.setNomeUsuario("aluno");
        aluno.setSenha("senha");
        aluno.setRa(1234567891011L);

        try {
            manager.getTransaction().begin();
            manager.persist(aluno);
            manager.getTransaction().commit();
        } catch (final Exception e) {
            manager.getTransaction().rollback();
        }

        System.out.println(aluno.getId());
        manager.close();
    }
}
