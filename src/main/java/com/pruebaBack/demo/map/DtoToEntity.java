package com.pruebaBack.demo.map;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.pruebaBack.demo.DTO.CancionDto;
import com.pruebaBack.demo.entity.Cancion;
import com.pruebaBack.demo.entity.ListaRepro;

@Component
public class DtoToEntity {

	public List<Cancion> getNewEntityListFromDtoList(List<CancionDto> dtos, Integer idR){
		List<Cancion> entityList = new ArrayList<>();
		ListaRepro repro = new ListaRepro();
		
		Cancion can = new Cancion();
		repro.setId(idR);
		for(CancionDto dto: dtos) {
			can.setAlbun(dto.getAlbun());
			can.setAnno(dto.getAnno());
			can.setArtista(dto.getArtista());
			can.setTitulo(dto.getTitulo());
			can.setIdR(repro);
			entityList.add(can);
			System.out.println(dto.getTitulo());
		
			
		}
		System.out.println("cantidad en lista:"+ entityList.size());
		return entityList;
	}
}
