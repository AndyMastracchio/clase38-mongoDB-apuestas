package com.dh.apuestas.service.impl;

import com.dh.apuestas.entity.Torneo;
import com.dh.apuestas.repository.TorneoRepository;
import com.dh.apuestas.service.TorneoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneoServiceImpl implements TorneoService {

    private TorneoRepository torneoRepository;

    public TorneoServiceImpl(TorneoRepository torneoRepository) {
        this.torneoRepository = torneoRepository;
    }

    public Torneo guardarTorneo(Torneo torneo){
        return torneoRepository.save(torneo);
    }

    public List<Torneo> listarTorneos(){
        return torneoRepository.findAll();
    }


}
