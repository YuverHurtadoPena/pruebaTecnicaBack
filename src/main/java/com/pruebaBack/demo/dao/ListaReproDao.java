package com.pruebaBack.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaBack.demo.entity.ListaRepro;
@Repository
public interface ListaReproDao extends JpaRepository<ListaRepro,Integer>{
	Optional<ListaRepro> findByNombre(String nombre);


}
