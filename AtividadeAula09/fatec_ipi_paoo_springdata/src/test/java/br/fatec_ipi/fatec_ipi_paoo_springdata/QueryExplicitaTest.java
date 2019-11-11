package br.fatec_ipi.fatec_ipi_paoo_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.fatec_ipi.fatec_ipi_paoo_springdata.model.beans.Cidade;
import br.fatec_ipi.fatec_ipi_paoo_springdata.repository.CidadeRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class QueryExplicitaTest {
	@Autowired
    private CidadeRepository cidadeRepo;
	
	public void testQueryExplicita () throws InterruptedException, ExecutionException { 
	List <Cidade> cidades1 =  cidadeRepo.buscarPorNomeIgnore(("SÃO PAULO").toLowerCase()); 
	cidades1.forEach(System.out::println); 
	List <Cidade> cidades2 =  cidadeRepo.buscarPorNome("São Paulo"); 
	cidades2.forEach(System.out::println);
	List<Cidade> cidades3 = cidadeRepo.buscarPorLatitudeELongitude(1341, 123122);
	cidades3.forEach(System.out::println);
	}
}
