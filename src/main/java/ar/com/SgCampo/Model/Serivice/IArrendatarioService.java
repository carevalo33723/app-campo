package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;

import ar.com.SgCampo.Model.Entity.Arrendatario;


public interface IArrendatarioService {

	List<Arrendatario> listar();
	 Optional<Arrendatario> Idlistar(int id);
	 int save (Arrendatario p);
	 void eliminar(int id);
	 Arrendatario findByNombre(String nombre);
	
	
}
