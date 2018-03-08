package com.jpa.orm.aula01;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

public class Principal {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); //F�brica de Conex�o
//		
//		EntityManager em = emf.createEntityManager(); //Gerenciador de entidade;
		
//		Livro livro1 = new Livro();
		
//		livro1.setTitulo("Escurid�o Total Sem Estrelas");
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

//		em.getTransaction().begin();// transa��o
//		em.persist(livro1); //persist�ncia - coloca em estado de pr�-persistencia o objeto no banco
//		em.getTransaction().commit(); // Commit - confirma a persistencia
		
		
	}

}
