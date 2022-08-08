package com.pruebaBack.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaBack.demo.DTO.ListaReproDto;
import com.pruebaBack.demo.service.ICancionService;
import com.pruebaBack.demo.service.IListaReproService;


@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "*")
public class control {
	@Autowired
	private IListaReproService listaRservicce;
	
	@Autowired
	private ICancionService cancionService;
	

	@PostMapping("lists")
	public ResponseEntity<?> create(@RequestBody ListaReproDto dto) {
		boolean bandera =listaRservicce.saveListaR(dto);
		if (bandera) {
			return new ResponseEntity(HttpStatus.CREATED);
		}else {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		

	}
	
	@GetMapping("list")
	public ResponseEntity<?> lista() {
		
		return new ResponseEntity(listaRservicce.verTodasReproduciones(), HttpStatus.OK);

	}
	
	@GetMapping("list/{listName}")
	public ResponseEntity<?> descripcion(@PathVariable("listName")String listName) {
		String bandera = listaRservicce.descripcion(listName);
		if(bandera  !="false") {
			return new ResponseEntity(bandera, HttpStatus.OK);
		}else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	
		
		

	}
	
	@DeleteMapping("/list/{listName}")
	public ResponseEntity<?> delete(@PathVariable("listName")String listName) {
		boolean bandera = false;
		bandera =listaRservicce.delete(listName);
		if (bandera) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	
	

}
