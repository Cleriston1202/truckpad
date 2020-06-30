package br.com.truckpad.truckpad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.truckpad.truckpad.model.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
	
	@Query(value = "select m from Motorista m where m.carregado = :paramcarregado")
	public List<Motorista> listMotorista(@Param("paramcarregado") Boolean paramcarregado);
	
	
	@Query(value = "select m from Motorista m where m.veiculoPropio = :parampropio")
	public List<Motorista> listMotoristaComVeiculoPropio(@Param("parampropio") Boolean parampropio);

}
