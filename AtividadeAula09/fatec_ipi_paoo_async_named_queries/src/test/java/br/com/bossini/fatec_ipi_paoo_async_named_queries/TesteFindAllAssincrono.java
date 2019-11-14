package br.com.bossini.fatec_ipi_paoo_async_named_queries;


import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.beans.Cidade;
import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.repository.CidadeRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class TesteFindAllAssincrono {
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void testFindAllAssincrono() throws Exception{
		
		Future <List <Cidade>> future = cidadeRepo.findByNomeIgnoreCase("sao paulo");
		Future <List <Cidade> > future1 = cidadeRepo.findByNome("sao paulo");
	    Future <Cidade> future2 =cidadeRepo.findByLatitudeAndLongitude(1,2);
		System.out.println("mais coisas aqui..");
		System.out.println("mais um pouco aqui...");
		//lista cidades passando o nome
		try {
			List <Cidade> cidades = future1.get(100, TimeUnit.SECONDS);	
			System.out.println("cidade pelo nome ");
			cidades.forEach(System.out::println);
		}
		catch (TimeoutException e) {
			e.printStackTrace();
		}
		//lista cidades passando o nome com ignore case
		try {
			List <Cidade> cidades = future.get(100, TimeUnit.SECONDS);
			System.out.println("cidade pelo nome ignore case:");
			cidades.forEach(System.out::println);
			
		}
		catch (TimeoutException e) {
			e.printStackTrace();
		}
		//lista cidades passando latitude e longitude
		try {
			Cidade cidade = future2.get(100, TimeUnit.SECONDS);	
			System.out.println("cidade pela latitude e longitude:"+cidade);
		}
		catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	


}
