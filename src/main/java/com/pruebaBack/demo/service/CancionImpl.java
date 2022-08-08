package com.pruebaBack.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pruebaBack.demo.DTO.CancionDto;
import com.pruebaBack.demo.DTO.ListaReproDto;
import com.pruebaBack.demo.dao.CancionDao;
import com.pruebaBack.demo.entity.Cancion;
import com.pruebaBack.demo.entity.ListaRepro;
import com.pruebaBack.demo.map.DtoToEntity;
import com.pruebaBack.demo.map.EntityToDto;


@Service
public class CancionImpl implements ICancionService{
	@Autowired
	private CancionDao cancionDao;
	
	@Autowired
	private DtoToEntity dtoToEntity;
	@Autowired
	private EntityToDto entityToDto;

	@Override
	public boolean saveCancion(ListaReproDto dto, Integer idlR) {
		Cancion cancion = new Cancion();
		ListaRepro rp = new ListaRepro();
		rp.setId(idlR);
		
		for (CancionDto dtos: dto.getListCancion()) {
			
		/*cancion.setTitulo(dtos.getTitulo());
		cancion.setAlbun(dtos.getAlbun());
		cancion.setAnno(dtos.getAnno());
		cancion.setArtista(dtos.getArtista());
		cancion.setIdR(rp);*/
		cancionDao.guardar(dtos.getTitulo(), dtos.getArtista(), dtos.getAlbun(), dtos.getAnno(), idlR);
		
		}
		/*List<Cancion>  lista = dtoToEntity.getNewEntityListFromDtoList(dto.getListCancion(), idlR);
		cancionDao.saveAll(lista);*/
		return true;
	}

	@Override
	public Integer cantidad() {
		List<Cancion> can = cancionDao.findAll();
		System.out.println("cantidad en BD:"+ can.size());
		return can.size();
	}

	@Override
	public List<CancionDto> vertodas() {
		// TODO Auto-generated method stub
		List<Cancion> can = cancionDao.findAll();
		List<CancionDto> canDto = entityToDto.convertToDto(can, 0);
		return canDto;
	}


}
