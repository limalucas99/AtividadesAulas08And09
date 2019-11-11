package veiculo.veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class RemoveVeiculoComPlaca {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = manager.find(Placa.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
		}
	}
