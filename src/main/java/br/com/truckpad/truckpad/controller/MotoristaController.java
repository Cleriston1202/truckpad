package br.com.truckpad.truckpad.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.truckpad.truckpad.model.Motorista;
import br.com.truckpad.truckpad.model.TipoCaminhao;
import br.com.truckpad.truckpad.repository.MotoristaRepository;


@RestController
@RequestMapping("/motoristas")
public class MotoristaController {
	
	@Autowired
	private MotoristaRepository motoristaRepositrory;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.OK)
	public Motorista cadastra(@RequestBody Motorista motorista ) {
		motorista.setTipoCaminhao(TipoCaminhao.CAMINHAO_TOCO);
		motoristaRepositrory.save(motorista);
		return motorista;
		
	}
	
	@GetMapping("/carregado{carregado}")
	public List<Motorista> listMotorista(@RequestParam(name="carregado") Boolean carregado){
	
		return motoristaRepositrory.listMotorista(carregado);
	}
	
	@GetMapping("/veiculo{propio}")
	public List<Motorista> listMotoristaVeiculoPropio(@RequestParam(name="propio") Boolean propio){
		return motoristaRepositrory.listMotoristaComVeiculoPropio(propio);
	}

	@GetMapping
	public List<Motorista> listar(){
		return motoristaRepositrory.findAll();
	}

}
