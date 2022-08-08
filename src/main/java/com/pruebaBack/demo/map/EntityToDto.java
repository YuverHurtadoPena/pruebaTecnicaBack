package com.pruebaBack.demo.map;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.pruebaBack.demo.DTO.CancionDto;
import com.pruebaBack.demo.DTO.ListaReproDto;
import com.pruebaBack.demo.dao.CancionDao;
import com.pruebaBack.demo.entity.Cancion;
import com.pruebaBack.demo.entity.ListaRepro;

@Component
public class EntityToDto {
	@Autowired
	private CancionDao cancionDao;

	public List<CancionDto>convertToDto(List<Cancion>cancion, Integer idLR){
		List<CancionDto>dtoList =  new ArrayList<>();
		CancionDto dto=null;
		for (Cancion can: cancion) {
			dto = new CancionDto();
			dto.setTitulo(can.getTitulo());
			dto.setAlbun(can.getAlbun());
			dto.setAnno(can.getAnno());
			dto.setArtista(can.getArtista());
			dto.setId(idLR);
			dtoList.add(dto);
			
		}
		return dtoList;
		
	}
	
	public List<ListaReproDto>convertToDtoListaR(List<ListaRepro>LR){
		List<ListaReproDto>dtoList =  new ArrayList<>();
		List<CancionDto>dtoCanList = new ArrayList<>();
		ListaReproDto dto=null;
		for (ListaRepro rl: LR) {
			dto = new ListaReproDto();
			dto.setId(rl.getId());
			dto.setNombre(rl.getNombre());
			dto.setDescripcion(rl.getDescripcion());
			dto.setListCancion(convertToDto(cancionDao.mostrarDatosPorId(rl.getId()),rl.getId()));
			dtoList.add(dto);		
		}
		return dtoList;
		
	}

}
