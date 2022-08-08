package com.pruebaBack.demo.service;

import java.util.List;

import com.pruebaBack.demo.DTO.ListaReproDto;
import com.pruebaBack.demo.entity.ListaRepro;



public interface IListaReproService {
	public boolean saveListaR(ListaReproDto  dto);
	public List<ListaReproDto> verTodasReproduciones();
	public String descripcion(String nombre);
	public boolean delete(String nombre);


}
