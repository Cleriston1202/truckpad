package br.com.truckpad.truckpad;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.truckpad.truckpad.model.Motorista;
import br.com.truckpad.truckpad.model.TipoCaminhao;
import br.com.truckpad.truckpad.repository.MotoristaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class TruckpadApplicationTests {
	
	@Autowired
	private MotoristaRepository motoristaRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void salvar() {
		Motorista m = new Motorista();
		m.setCarregado(true);
		m.setDestino(2222222);
		m.setIdade(30);
		m.setNome("Marcos");
		m.setOrigem(222222222);
		m.setSexo('M');
		m.setTipoCaminhao(TipoCaminhao.CAMINHAO_TOCO);
		m.setTipoCnh('C');
		m.setCarregado(true);
		m.setVeculoPropio(true);
		motoristaRepository.save(m);
	}

}
