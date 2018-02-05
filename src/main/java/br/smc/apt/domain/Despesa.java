package br.smc.apt.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="despesa")
public class Despesa {
	
	@Id
	@SequenceGenerator(name = "seq_despesa_id", sequenceName = "seq_despesa_id")
	@GeneratedValue(generator = "seq_despesa_id")
	private long id;
	
	private String descricao;
	
	private Integer formaPagamento;
	
	private Date data;
	
	private Double desconto;
	
	private Double total;
	
	@OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
	@JoinColumn(name = "despesa_id")
	private List<DespesaProduto> itens;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Integer formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<DespesaProduto> getItens() {
		return itens;
	}

	public void setItens(List<DespesaProduto> itens) {
		this.itens = itens;
	}
}