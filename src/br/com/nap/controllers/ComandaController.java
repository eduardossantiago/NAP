package br.com.nap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.nap.model.Comanda;

@Controller
public class ComandaController {

	@RequestMapping("comanda")//pagina para digitar o numero da comanda
	public String comanda() {

		return "comanda";
	}
	
	@RequestMapping("abrirComanda")
	public String abrirComanda(Comanda comanda) {
		
		return "teste";
	}
}
