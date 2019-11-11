package veiculo.veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class InsereVeiculocomPlaca {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = new Placa ();
		p.setCidade("Sao Paulo");
		manager.persist(p);
		Veiculo v = new Veiculo();
		v.setModelo("Corsa");
		v.setMarca("Chevrolet");
		v.setAno("1995");
		v.setPlaca(p);
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
	}
