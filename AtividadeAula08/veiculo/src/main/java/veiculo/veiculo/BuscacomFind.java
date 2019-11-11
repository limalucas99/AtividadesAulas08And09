package veiculo.veiculo;

import javax.persistence.EntityManager;


public class BuscacomFind {

	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Veiculo v = entityManager.find(Veiculo.class, 1L);
		System.out.println(v);
		entityManager.close();
		JPAUtil.close();
	}

}
