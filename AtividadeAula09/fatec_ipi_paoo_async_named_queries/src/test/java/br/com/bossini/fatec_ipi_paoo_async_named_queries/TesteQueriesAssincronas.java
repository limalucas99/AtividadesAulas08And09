package br.com.bossini.fatec_ipi_paoo_async_named_queries;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.beans.Cidade;
import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.repository.CidadeRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class TesteQueriesAssincronas {

	@Autowired
	private CidadeRepository cidadeRepo;

	
	@Test
	public void test() {
		List <Cidade> cidades = cidadeRepo.buscarCidadePorNomeIgnore("sao paulo");
		cidades.forEach(System.out::println);
		//cidades por nome
		List <Cidade> cidades2 =  cidadeRepo.buscarCidadePorNome("sao paulo");
		System.out.println("buscando cidades pelo nome");
		cidades2.forEach(System.out::println);
		//cidades por latitude e longitude
		System.out.println("buscando cidade por latitude e longitude");
		Cidade cidade = cidadeRepo.buscarPorLatitudeELongitude(1,2);
		System.out.println(cidade);
		
	}
}
