package br.smc.apt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@SequenceGenerator(name = "seq_produto_id", sequenceName = "seq_produto_id")
	@GeneratedValue(generator = "seq_produto_id")
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="imagem_url")
	private String imagemUrl;
	
	@Column(name="data_fabricacao")
	private Date dataFabricacao;
	
	@Column(name="data_validade")
	private Date dataValidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
}
