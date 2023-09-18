package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Coordenador;
import model.Prof_Orientador;

public class Programa {
	public static void main(String[] args) {
		Coordenador coordenador = new Coordenador("86321448044", "Arinaldo", "arinaldo@iftm.edu.br", "3432214800");
		Prof_Orientador professor1 = new Prof_Orientador("60727660055", "Maria de Lourdes", "maria@iftm.edu.br", "3432214800","lattes","60727660055");
		Prof_Orientador professor2 = new Prof_Orientador("35538673022", "Poliana", "poliana@iftm.edu.br", "3432214800","lattes","35538673022");
		Prof_Orientador professor3 = new Prof_Orientador("78073046008", "Walteno", "walteno@iftm.edu.br", "3432214800","lattes","78073046008");
		Prof_Orientador professor4 = new Prof_Orientador("32875956019", "Luciana", "luciana@iftm.edu.br", "3432214800","lattes","32875956019");


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eng_Software");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(coordenador);
		em.persist(professor1);
		em.persist(professor2);
		em.persist(professor3);
		em.persist(professor4);
		em.getTransaction().commit();
	}
}