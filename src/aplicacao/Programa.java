package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Clientes;

public class Programa {

	public static void main(String[] args) {
		Clientes c1 = new Clientes(null, "Carlos", "carlos@gmail.com");
		Clientes c2 = new Clientes(null, "Henrique", "henrique@gmail.com");
		Clientes c3 = new Clientes(null, "Ednardo", "ednardo@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
	}

}
