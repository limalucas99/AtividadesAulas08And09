package br.fatec_ipi.fatec_ipi_paoo_springdata;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.fatec_ipi.fatec_ipi_paoo_springdata.model.beans.Cidade;
import br.fatec_ipi.fatec_ipi_paoo_springdata.repository.CidadeRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class NamedQueryTest {

	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void test() {
		Cidade c = cidadeRepo.buscarPelaLatitudeEPelaLongitude(1314, 15778);
		System.out.println(c);
		Cidade c2 = cidadeRepo.buscarPeloNome("São Paulo");
		System.out.println(c2);
		String a = "SAO PAULO";
		Cidade c3 = cidadeRepo.buscarPeloNomeIgnore(("são PAULO").toLowerCase());
		System.out.println(c3);
	}
	
}
