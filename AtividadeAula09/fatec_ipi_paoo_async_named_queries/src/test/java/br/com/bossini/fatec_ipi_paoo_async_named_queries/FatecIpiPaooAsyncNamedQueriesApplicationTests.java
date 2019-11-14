package br.com.bossini.fatec_ipi_paoo_async_named_queries;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.beans.Cidade;
import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.repository.CidadeRepository;

@SpringBootTest
class FatecIpiPaooAsyncNamedQueriesApplicationTests {
	@Autowired
	CidadeRepository cidadeRepo;

	@Test
	void contextLoads() {
		Cidade c = cidadeRepo.buscarPelaLatitudeEPelaLongitude(1, 2);
		System.out.println(c);
		
		System.out.println("buscando cidades pelo nome ignore:");
		List <Cidade> cidades = cidadeRepo.buscarPeloNomeIgnore("sao paulo");
		cidades.forEach(System.out::println);
		
		//cidades por nome
		List <Cidade> cidades2 =cidadeRepo.buscarPeloNome("sao paulo");
		System.out.println("buscando cidades pelo nome:");
		cidades2.forEach(System.out::println);
		
	}

}
