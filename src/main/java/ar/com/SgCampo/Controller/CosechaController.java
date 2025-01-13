package ar.com.SgCampo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.SgCampo.Model.Entity.Arrendatario;
import ar.com.SgCampo.Model.Entity.Cosecha;
import ar.com.SgCampo.Model.Entity.Producto;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Serivice.IArrendatarioService;
import ar.com.SgCampo.Model.Serivice.IProductoService;
import ar.com.SgCampo.Model.Serivice.ISociosService;

@Controller
public class CosechaController {

	@Autowired
	IArrendatarioService dat;
	@Autowired
	ISociosService socio;
	@Autowired
	IProductoService prod;
	
	@GetMapping("/altaCosecha")
	public String crear(Model model) {
		//crear la lista para pasar y pueda asociar
		List <Socio> listaSocio = socio.listar();
		
		List <Producto> listaProducto = prod.listar();
		
		model.addAttribute("listaSocios",listaSocio);
		model.addAttribute("listaProductos",listaProducto);
		
		Cosecha NuevaCosecha=new Cosecha();
		
		model.addAttribute("cosecha", NuevaCosecha);
		return null;
	}
}
