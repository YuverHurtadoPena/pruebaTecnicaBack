package com.pruebaBack.demo.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="cancion")
public class Cancion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // EL ID DE CONVIEERTE EN LLAVE PRIMARIA AUTOINCREMENTAL
	private int id;
	
	private String titulo;
	private String artista;
	private String albun;
	private String anno;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdR")
	private ListaRepro IdR;
	
	
	public Cancion( String titulo, String artista, String albun, String anno, ListaRepro idR) {
	
		this.titulo = titulo;
		this.artista = artista;
		this.albun = albun;
		this.anno = anno;
		IdR = idR;
	}
	
	public Cancion() {
	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbun() {
		return albun;
	}
	public void setAlbun(String albun) {
		this.albun = albun;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public ListaRepro getIdR() {
		return IdR;
	}
	public void setIdR(ListaRepro idR) {
		IdR = idR;
	}
	
	
	
}
