package com.github.ProjetoGoodHands.GoodHands.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_tema")
public class TemaPostagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Campo Obrigatório")
	@Size(max = 255)
	private String causa;

	@NotBlank(message = "Campo Obrigatório")
	private Double metaArrecadacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public Double getMetaArrecadacao() {
		return metaArrecadacao;
	}

	public void setMetaArrecadacao(Double metaArrecadacao) {
		this.metaArrecadacao = metaArrecadacao;
	}

}
