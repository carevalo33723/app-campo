package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.Arrendatario;


@Repository
public interface IArrendatario extends CrudRepository<Arrendatario, Long>{
	
	Arrendatario findByNombre(String nombre);
	Arrendatario findById(int id);
	
	

}
