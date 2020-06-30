package br.com.truckpad.truckpad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motorista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private char sexo;
	private int idade;
	private char tipoCnh;
	private Boolean carregado;
	private Integer tipoCaminhao;
	private Integer origem;
	private Integer destino;
	private Boolean veiculoPropio;
	

	
	public Boolean getVeculoPropio() {
		return veiculoPropio;
	}

	public void setVeculoPropio(Boolean veculoPropio) {
		this.veiculoPropio = veculoPropio;
	}

	public Integer getOrigem() {
		return origem;
	}

	public void setOrigem(Integer origem) {
		this.origem = origem;
	}

	public Integer getDestino() {
		return destino;
	}

	public void setDestino(Integer destino) {
		this.destino = destino;
	}

	public TipoCaminhao getTipoCaminhao() {
		return TipoCaminhao.valor(tipoCaminhao);
	}

	public void setTipoCaminhao(TipoCaminhao tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao.getCode();
	}

	public Boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(Boolean carregado) {
		this.carregado = carregado;
	}

	public Motorista() {

	}
	
	public Long getId() {
		return id;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getTipoCnh() {
		return tipoCnh;
	}
	public void setTipoCnh(char tipoCnh) {
		this.tipoCnh = tipoCnh;
	}
		


	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", tipoCnh=" + tipoCnh
				+ ", carregado=" + carregado + ", tipoCaminhao=" + tipoCaminhao + ", origem=" + origem + ", destino="
				+ destino + ", veculoPropio=" + veiculoPropio + "]";
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
		Motorista other = (Motorista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}
