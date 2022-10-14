package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);

		return "evento-adicionado";
	}

	// @RequestMapping("/eventos/salvar")
	// public String salvar(Evento preencher) {
	// System.out.println("Nome: " + preencher.getNome());
	// System.out.println("Local: " + preencher.getLocal());
	// System.out.println("Data: " + preencher.getData());
	// System.out.println("Horario: " + preencher.getHorario());
	// return "salvar";
	// }

}
