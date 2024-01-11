package com.generation.olamundo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExerciciosController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello world!!!";
	}

	@GetMapping("/b-s-m")
	public String lista() {
		List<String> lista = new ArrayList<String>();

		lista.add("Trabalho em Equipe");
		lista.add("Comunicação");
		lista.add("Proatividade");
		lista.add("Persistência");
		lista.add("Mentalidade de Crescimento");
		lista.add("Responsabilidade Pessoal");
		lista.add("Orientação ao Futuro");
		lista.add("Orientação ao Detalhe");

		return lista.toString();

	}

	@GetMapping("/objetivos")
	public String listaObjetivos() {
		List<String> listaObjetivos = new ArrayList<String>();

		listaObjetivos.add("Participar de eventos e conferências de tecnologia");
		listaObjetivos.add("Aplicar design patterns em projetos práticos");
		listaObjetivos.add("Aprender sobre integração contínua e entrega contínua");
		listaObjetivos.add("Desenvolver habilidades de programação");
		listaObjetivos.add("Aprofundar conhecimentos em tecnologias web");
		listaObjetivos.add("Contribuir para projetos de código aberto");
		listaObjetivos.add("Explorar práticas avançadas de desenvolvimento");

		return listaObjetivos.toString();

	}
}
