package br.com.truckpad.truckpad.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@ResponseStatus(value = HttpStatus.CREATED)
	public Motorista cadastra(@RequestBody Motorista motorista ) {
		motorista.setTipoCaminhao(TipoCaminhao.CAMINHAO_TOCO);
		motoristaRepositrory.save(motorista);
		return motorista;
		
	}
	
	@GetMapping("/carregado{carregado}")
	@ResponseStatus(value = HttpStatus.OK)
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
	
	@PutMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<Motorista> update(@PathVariable("id") long id,
	                                      @RequestBody Motorista motorista) {
	   return motoristaRepositrory.findById(id)
	           .map(m -> {
	               m.setIdade(motorista.getIdade());
	               m.setCarregado(motorista.getCarregado());
	               m.setDestino(motorista.getDestino());
	               m.setNome(motorista.getNome());
	               m.setOrigem(motorista.getOrigem());
	               m.setSexo(motorista.getSexo());
	               m.setTipoCaminhao(motorista.getTipoCaminhao());
	               m.setTipoCnh(motorista.getTipoCnh());
	               m.setVeculoPropio(motorista.getVeculoPropio());
	               Motorista atualizado = motoristaRepositrory.save(m);
	               return ResponseEntity.ok().body(atualizado);
	           }).orElse(ResponseEntity.notFound().build());
	}

}
