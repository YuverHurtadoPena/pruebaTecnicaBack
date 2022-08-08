package com.pruebaBack.demo.DTO;

import java.util.List;


public class ListaReproDto {
	private Integer id;
	private String nombre;
	private String descripcion;
	private List<CancionDto> listCancion;
	
	
	public ListaReproDto() {
		
	}
	

	public ListaReproDto(Integer id, String nombre, String descripcion, List<CancionDto> listCancion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.listCancion = listCancion;
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<CancionDto> getListCancion() {
		return listCancion;
	}


	public void setListCancion(List<CancionDto> listCancion) {
		this.listCancion = listCancion;
	}
	
	

}
