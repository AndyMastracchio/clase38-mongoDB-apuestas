package com.dh.apuestas.service.impl;

import com.dh.apuestas.entity.Estado;
import com.dh.apuestas.entity.Partido;
import com.dh.apuestas.repository.PartidoRepository;
import com.dh.apuestas.service.PartidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoServiceImpl implements PartidoService {

    private PartidoRepository partidoRepository;

    public PartidoServiceImpl(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }

    public Partido agregar(Partido partido){
        return partidoRepository.save(partido);
    }
    public List<Partido> listar(){
        return partidoRepository.findAll();
    }

    public List<Partido> partidosEnVivo(){
        return partidoRepository.findAllByEstado(Estado.EN_VIVO);
    }

}
