package veiculo.veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class RemoveVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		manager.remove(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
	}

}
