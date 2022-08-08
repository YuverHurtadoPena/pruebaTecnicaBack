package com.pruebaBack.demo.service;

import java.util.List;

import com.pruebaBack.demo.DTO.CancionDto;
import com.pruebaBack.demo.DTO.ListaReproDto;
import com.pruebaBack.demo.entity.Cancion;

public interface  ICancionService {
	public boolean saveCancion(ListaReproDto dto, Integer idl);
	public Integer cantidad();
	public List<CancionDto> vertodas();

}
