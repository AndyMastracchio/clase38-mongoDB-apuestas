package com.dh.apuestas.controller;

import com.dh.apuestas.entity.Partido;
import com.dh.apuestas.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    private final PartidoService partidoService;

    @Autowired
    public PartidoController(PartidoService partidoService) {
        this.partidoService = partidoService;
    }

    @PostMapping("/new")
    public Partido registrar(@RequestBody Partido partido) {
        return partidoService.agregar(partido);
    }

    @GetMapping
    public List<Partido> listar() {
        return partidoService.listar();
    }

    @GetMapping("/en-vivo")
    public List<Partido> partidosEnVivo() {
        return partidoService.partidosEnVivo();
    }
}
