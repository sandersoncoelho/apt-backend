package br.smc.apt.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="despesaproduto")
public class DespesaProduto {

	@Id
	@SequenceGenerator(name = "seq_despesa_produto_id", sequenceName = "seq_despesa_produto_id")
	@GeneratedValue(generator = "seq_despesa_produto_id")
	private Long id;
	
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="produto_id")
	private Produto produto;
	
	@Column(name="preco_unitario")
	private Float precoUnitario;
	
	@Column(name="quantidade")
	private Integer quantidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
