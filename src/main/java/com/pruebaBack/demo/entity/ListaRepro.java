package com.pruebaBack.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="listaR")
public class ListaRepro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // EL ID DE CONVIEERTE EN LLAVE PRIMARIA AUTOINCREMENTAL
	private int id;
	@Column(unique=true)
	private String nombre;
	private String descripcion;
	@OneToMany(mappedBy = "IdR",cascade = CascadeType.ALL)
	private Set<Cancion> IdR;
	
	public Set<Cancion> getIdR() {
		return IdR;
	}

	public void setIdR(Set<Cancion> idR) {
		IdR = idR;
	}

	public ListaRepro() {
	
	}

	public ListaRepro(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
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
	
	
	

}
