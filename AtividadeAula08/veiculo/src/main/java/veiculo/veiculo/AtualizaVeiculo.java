package veiculo.veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class AtualizaVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		v.setModelo("Uno");
		v.setMarca("Fiat");
		v.setAno("2013");                               
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
	}

}
