package br.edu.cs.poo.ac.seguro.entidades;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.time.Period;

public class Segurado {
	private String nome;
	private Endereco endereco;
	private LocalDate dataCriacao;
	private BigDecimal bonus;
	
	public Segurado(String nome, Endereco endereco, LocalDate dataCriacao, BigDecimal bonus) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataCriacao = dataCriacao;
		this.bonus = bonus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	protected LocalDate getDataCriacao() {
		return dataCriacao;
	}

	protected void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}
	
	public int getIdade() {
        LocalDate hoje = LocalDate.now();
        if (dataCriacao != null) {
            return Period.between(dataCriacao, hoje).getYears();
        } else {
            return 0;
        }
    }
	
	public void creditarBonus(BigDecimal valor) {
        if (valor != null) {
            this.bonus = this.bonus.add(valor);
        }
    }
	
	public void debitarBonus(BigDecimal valor) {
        if (valor != null) {
            this.bonus = this.bonus.subtract(valor);
        }
    }
	
}
