package com.dh.apuestas.controller;

import com.dh.apuestas.entity.Torneo;
import com.dh.apuestas.service.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneos")
public class TorneoController {

    private final TorneoService torneoService;

    @Autowired
    public TorneoController(TorneoService torneoService) {
        this.torneoService = torneoService;
    }

    @PostMapping("/new")
    public Torneo agregarTorneo(@RequestBody Torneo torneo) {
        return torneoService.guardarTorneo(torneo);
    }

    @GetMapping
    public List<Torneo> listarTorneos() {
        return torneoService.listarTorneos();

    }
}
