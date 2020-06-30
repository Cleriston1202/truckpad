package br.com.truckpad.truckpad.model;

public enum TipoCaminhao {
	
	CAMINHAO_TRES_POR_QUARTO(1),
	CAMINHAO_TOCO(2),
	CAMINHAO_TRUCK(3),
	CARRETA_SIMPLES(4),
	CARRETA_EIXO_EXTENDIDO(5);
	
	private int code;
	
	private TipoCaminhao(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoCaminhao valor(int code) {
		for (TipoCaminhao valor : TipoCaminhao.values()) {
		  if(valor.getCode() == code) {
			  return valor;
		  }	
		}
		throw new IllegalArgumentException("Valores inexistentes");
	}

}
