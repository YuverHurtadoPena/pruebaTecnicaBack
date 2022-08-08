package com.pruebaBack.demo.DTO;

public class CancionDto {
	private Integer id;
	private String titulo;
	private String artista;
	private String albun;
	private String anno;
	
	
	
	
	public CancionDto() {
		
	}
	public CancionDto(Integer id, String titulo, String artista, String albun, String anno) {
	
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.albun = albun;
		this.anno = anno;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	

}
