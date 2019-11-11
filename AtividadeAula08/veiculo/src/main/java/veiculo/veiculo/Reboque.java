package veiculo.veiculo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_reboque")
public class Reboque {
    
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@OneToMany (mappedBy = "reboque")
	private List<VeiculoReboque> veiculoReboque;
	
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


