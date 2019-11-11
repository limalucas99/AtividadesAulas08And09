package br.fatec_ipi.fatec_ipi_paoo_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.fatec_ipi.fatec_ipi_paoo_springdata.model.beans.Cidade;
import br.fatec_ipi.fatec_ipi_paoo_springdata.repository.CidadeRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class AsyncQueryTest {
     @Autowired
     private CidadeRepository cidadeRepo;
     
     @Test
     public void testFindAllAssincrono() throws InterruptedException, ExecutionException {
    	 Future <List <Cidade>> future = cidadeRepo.findByNome("São Paulo");
    	 System.out.println("Código aqui"); 
    	 System.out.println("Mais coisas aqui");
    	 
    	 //finalmente pego o resultado
    	 //essa chamada pode bloquear ou não
    	 
    	 List <Cidade> cidades = future.get();
    	 for(Cidade c: cidades) {
    		 System.out.println(c);
    	 }

     }
}
