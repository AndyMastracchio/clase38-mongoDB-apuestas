package com.dh.apuestas.service;

import com.dh.apuestas.entity.Partido;

import java.util.List;

public interface PartidoService {

    Partido agregar(Partido partido);

    List<Partido> listar();

    List<Partido> partidosEnVivo();
}
