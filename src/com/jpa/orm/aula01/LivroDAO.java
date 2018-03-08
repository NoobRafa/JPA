package com.jpa.orm.aula01;

import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

public class LivroDAO extends JPAUtil {
	private EntityManager em = getEmf().createEntityManager(); // Gerenciador de
																// entidade;

	public EntityManager getEm() {
		return em;
	}

	public void setLivroDAO(Livro livro) {

		em.getTransaction().begin();// transação
		em.persist(livro); // persistência - coloca em estado de
							// pré-persistencia o objeto no banco
		em.getTransaction().commit(); // Commit - confirma a persistencia
		em.close();
	}

	public Livro getLivroDAO(int id) {
		Livro retorno = em.find(Livro.class,(long) id);
		return retorno;
	}
	

}
