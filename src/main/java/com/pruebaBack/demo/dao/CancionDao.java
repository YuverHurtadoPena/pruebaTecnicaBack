package com.pruebaBack.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pruebaBack.demo.DTO.CancionDto;
import com.pruebaBack.demo.entity.Cancion;

@Repository
public interface CancionDao extends JpaRepository<Cancion,Integer> {
	 @Modifying
	 @Transactional
	 @Query(value = "insert into cancion (titulo,artista,albun,anno,IdR) VALUES (?1, ?2,?3,?4,?5)", nativeQuery = true)
	 public void guardar(String titulo,String artista,String albun,String anno, Integer IdR);
	 
	 @Transactional
	 @Query(value = "select * from cancion where IdR=?1 ", nativeQuery = true)
	 public List<Cancion> mostrarDatosPorId(Integer idlR);
}
