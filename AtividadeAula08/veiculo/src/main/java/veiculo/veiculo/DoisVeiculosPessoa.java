package veiculo.veiculo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DoisVeiculosPessoa {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Pessoa p = new Pessoa();
		manager.persist(p);
		p.setNome("Joanderson");
		List <Veiculo> veiculos = new ArrayList <>();
		Veiculo v1 = new Veiculo();
		v1.setModelo("Prisma");
		v1.setPessoa(p);
		Veiculo v2 = new Veiculo ();
		v2.setModelo("Uno");
		v2.setPessoa(p);
		veiculos.add(v1);
		veiculos.add(v2);
		p.setVeiculos(veiculos);
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
