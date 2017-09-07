package br.com.nap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.nap.model.Comanda;
import br.com.nap.model.ComandaDAO;

@Controller
public class ComandaController {
	
	ComandaDAO dao;
	
	@Autowired
	public ComandaController(ComandaDAO dao) {
		
		this.dao = dao;
		
	}

	@RequestMapping("comanda")//pagina para digitar o numero da comanda
	public String comanda() {

		return "comanda";
	}
	
	@RequestMapping("abrirComanda")
	public String abrirComanda(Comanda comanda) {
		
		if(dao.verStatus(comanda) == 1) {//se comanda estiver em uso
			
			return "comanda-em-uso";
			
		}else {
			
		}
		
			return "lista-atendimentos";
	}
}
