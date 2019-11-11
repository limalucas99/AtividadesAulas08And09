package veiculo.veiculo;

import javax.persistence.EntityManager;

public class BuscaPlacacomVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Placa p = manager.find(Placa.class, 1L);
		System.out.println(p.getVeiculo().getModelo());
		manager.close();
		JPAUtil.close();
		}
	}