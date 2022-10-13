package br.senac.tads.dsw.exemplossala.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.senac.tads.dsw.exemplossala.models.DadosPessoais;

@Controller
@RequestMapping
public class ExemploController {

	@GetMapping("/index")
	public ModelAndView perfil() {

		DadosPessoais dados = new DadosPessoais("Alan Santos", "alan@mail.com", LocalDate.of(1996, 04, 16),
				"https://www.linkedin.com/in/alan-s-santos/", "https://github.com/ssantosalan");

		ModelAndView mv = new ModelAndView("index");

		mv.addObject("dadosPessoais", dados);

		return mv;

	}

}
