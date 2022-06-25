package com.dh.apuestas.service;

import com.dh.apuestas.entity.Torneo;

import java.util.List;

public interface TorneoService {

    Torneo guardarTorneo(Torneo torneo);
    List<Torneo> listarTorneos();
}
