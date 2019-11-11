package veiculo.veiculo;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;

public class ListaTodos {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List <Veiculo> veiculos = query.getResultList();
		for (Veiculo v : veiculos) {
			System.out.println(v);
			}
		    manager.close();
			JPAUtil.close();}
}
