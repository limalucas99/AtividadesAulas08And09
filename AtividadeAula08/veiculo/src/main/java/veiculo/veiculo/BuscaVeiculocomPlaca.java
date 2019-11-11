package veiculo.veiculo;

import javax.persistence.EntityManager;

public class BuscaVeiculocomPlaca {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
		}
	}
