package com.dh.apuestas.repository;

import com.dh.apuestas.entity.Torneo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorneoRepository extends MongoRepository<Torneo,Integer> {


}
