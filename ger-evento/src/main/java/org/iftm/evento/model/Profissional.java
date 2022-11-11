package org.iftm.evento.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity 
@Data @NoArgsConstructor @AllArgsConstructor
public class Profissional {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	    private Integer codProfissional; 
		private String linkLates;
		private String miniCurriculo;
	}
