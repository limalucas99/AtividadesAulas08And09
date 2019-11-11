package veiculo.veiculo;

import javax.persistence.Persistence;

public class BaseeTabelas {
	public static void main(String[] args) {
		
        Persistence.createEntityManagerFactory("bossiniPU");
}
}
