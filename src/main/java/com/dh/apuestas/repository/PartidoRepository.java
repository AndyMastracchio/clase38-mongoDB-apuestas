package com.dh.apuestas.repository;

import com.dh.apuestas.entity.Estado;
import com.dh.apuestas.entity.Partido;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepository extends MongoRepository<Partido,Integer> {

    List<Partido> findAllByEstado(Estado estado);
}
