package com.jpa.orm.aula01;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

public class Principal {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); //Fábrica de Conexão
//		
//		EntityManager em = emf.createEntityManager(); //Gerenciador de entidade;
		
//		Livro livro1 = new Livro();
		
//		livro1.setTitulo("Escuridão Total Sem Estrelas");
//		livro1.setAno_publicacao("2011");
//		livro1.setAutor("Stephen King");
		
		LivroDAO ldao = new LivroDAO(); // transient
//		ldao.setLivro(livro1);
		
		Livro resultado = ldao.getLivroDAO(1); //managed
		
		resultado.setAno_publicacao("199");
		
		ldao.getEm().getTransaction().begin();
		
		ldao.getEm().persist(resultado);
		
		ldao.getEm().getTransaction().commit();

		
		System.out.println(resultado);
		
//		ldao.getEm().close(); // detached
//		ldao.getEmf().close();

//		em.getTransaction().begin();// transação
//		em.persist(livro1); //persistência - coloca em estado de pré-persistencia o objeto no banco
//		em.getTransaction().commit(); // Commit - confirma a persistencia
		
		
	}

}
