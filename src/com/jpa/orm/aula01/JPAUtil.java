package com.jpa.orm.aula01;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("biblioteca2");

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public void close(){
		emf.close();
	}
}
