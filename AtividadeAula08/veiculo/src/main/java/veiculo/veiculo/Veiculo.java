package veiculo.veiculo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_veiculo")
public class Veiculo {
     
	@ManyToOne
	private Pessoa pessoa;

   public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
  
  // @ManyToMany
  // private List <Reboque> reboques;
	
	
	
	

   @Id
   @GeneratedValue
   private Long id;
   
   @Column (nullable = false, length = 30)
   private String modelo;
   
   @OneToMany (mappedBy = "veiculo")
   private List<VeiculoReboque> veiculoReboque;

@Override
public String toString() {
	return "Veiculo [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	Veiculo other = (Veiculo) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano = ano;
}

@Column(nullable = true, length = 30)
   private String marca;
   
   @Column(nullable = true, length = 10)
   private String ano;

	
   @OneToOne(optional = false)
   @JoinColumn (name = "id_da_placa_do_veiculo")
   private Placa placa;
   public Placa getPlaca() {
	   return placa;
	   }public void setPlaca(Placa placa) 
	   {
		   this.placa = placa;
		   }      
       
}

