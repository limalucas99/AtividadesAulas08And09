package br.com.bossini.fatec_ipi_paoo_async_named_queries.model.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.com.bossini.fatec_ipi_paoo_async_named_queries.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	@Async 
	public Future <Cidade> findByLatitudeAndLongitude(Integer latitude,Integer longitude);
	@Async 
	public Future <List<Cidade>> findByNome(String nome);
	@Async 
	public Future < List <Cidade>> findByNomeIgnoreCase(String Nome);
	
	
	@Query ("SELECT c FROM Cidade c WHERE upper(c.nome) = ?1") 
	public List<Cidade> buscarCidadePorNomeIgnore (String nome);

	@Query ("SELECT c FROM Cidade c WHERE c.nome = ?1") 
	public List<Cidade> buscarCidadePorNome(String nome);

	@Query ("SELECT c FROM Cidade c WHERE c.latitude = :latitude AND c.longitude = :longitude") 
	public  Cidade buscarPorLatitudeELongitude (@Param ("latitude") int latitude,@Param("longitude") int longitude);
	
	
	//Named Queries
	
	public Cidade buscarPelaLatitudeEPelaLongitude (@Param ("latitude") int latitude,@Param ("longitude") int longitude);

	public List <Cidade> buscarPeloNome (@Param ("nome") String nome);
	
	public List <Cidade> buscarPeloNomeIgnore (@Param ("nome") String nome);

}
