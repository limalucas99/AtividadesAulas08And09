package br.com.bossini.fatec_ipi_paoo_async_named_queries.model.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "tb_cidade")
@NamedQuery (name = "Cidade.buscarPelaLatitudeEPelaLongitude", query = "SELECT c FROM Cidade c WHERE c.latitude = :latitude AND c.longitude = :longitude")
@NamedQuery (name = "Cidade.buscarPeloNome", query = "SELECT c FROM Cidade c WHERE nome = nome")
@NamedQuery (name = "Cidade.buscarPeloNomeIgnore", query = "SELECT c FROM Cidade c WHERE UPPER(nome) = :nome")
public class Cidade implements Serializable{
    
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Integer latitude;
	
	private Integer longitude;

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}
	
	
}
