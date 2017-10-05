package com.backend.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.*;

@RestController
@RequestMapping(BackendController.BACKEND_BASE_URI)
public class BackendController {

	public static final String BACKEND_BASE_URI = "/backend";
	
	@RequestMapping(value = "{backendNumber}")
	public DTOInferirCategoria getDTOInferirCategoria(@PathVariable final int backendNumber ) {
		DTOInferirCategoria dtoIC = new DTOInferirCategoria();
		dtoIC.setPorcentajeNoRequerido(0.85);
    	dtoIC.setPorcentajeNivel5(0.8);
    	dtoIC.setPorcentajeNivel4(0.75);
    	dtoIC.setPorcentajeNivel3(0.7);
    	dtoIC.setPorcentajeNivel2(0.65);
    	dtoIC.setPorcentajeNivel1(0.6);
    	dtoIC.setId(backendNumber);
    	return dtoIC;
	}
}
