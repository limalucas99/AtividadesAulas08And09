package veiculo.veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class InsereVeiculo {

	public static void main(String[] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Veiculo v = new Veiculo();
		v.setModelo("Corsa");
		v.setMarca("Chevrolet");
		v.setAno("1998");
		entityManager.persist(v);
		transaction.commit();
		entityManager.close();
		JPAUtil.close();
		
	}

}
