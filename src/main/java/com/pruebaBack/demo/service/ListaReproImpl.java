package com.pruebaBack.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaBack.demo.DTO.ListaReproDto;
import com.pruebaBack.demo.dao.ListaReproDao;
import com.pruebaBack.demo.entity.ListaRepro;
import com.pruebaBack.demo.map.DtoToEntity;
import com.pruebaBack.demo.map.EntityToDto;


@Service
public class ListaReproImpl implements IListaReproService {
	@Autowired
	private ListaReproDao listaReproDao;
	@Autowired
	private ICancionService cancionService;
	@Autowired
	private DtoToEntity dtoToEntity;
	@Autowired
	private EntityToDto entityToDto;

	@Override
	public boolean saveListaR(ListaReproDto dto) {
		boolean bandera;
		ArrayList<Integer> array = new ArrayList<>();
		if(!listaReproDao.findByNombre(dto.getNombre()).isPresent()) {
				
		Integer IdRe;
		ListaRepro listaR = new ListaRepro();
		listaR.setDescripcion(dto.getDescripcion());
		listaR.setNombre(dto.getNombre());
		listaReproDao.save(listaR);
		IdRe = listaReproDao.findByNombre(dto.getNombre()).get().getId();
		return cancionService.saveCancion(dto, IdRe);
		}else {
			return false;
		}
		
	}

	@Override
	public List<ListaReproDto> verTodasReproduciones() {
		List<ListaRepro> lista = listaReproDao.findAll();
		System.out.println("lONGITUD: "+lista.size());
		return entityToDto.convertToDtoListaR(lista);
	}

	@Override
	public String descripcion(String nombre) {
		String descripcion = listaReproDao.findByNombre(nombre).get().getDescripcion();
		if(listaReproDao.findByNombre(nombre).isPresent()) {
			return descripcion;
		}else {
			return "false";
		}
		
	}

	@Override
	public boolean delete(String nombre) {
		Integer id = listaReproDao.findByNombre(nombre).get().getId();
		listaReproDao.deleteById(id);
		return true;
	}

}
