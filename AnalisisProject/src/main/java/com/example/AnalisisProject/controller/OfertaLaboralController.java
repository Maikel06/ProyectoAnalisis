package com.example.AnalisisProject.controller;

import com.example.AnalisisProject.entity.Oferta_Laboral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.AnalisisProject.service.OfertaLaboralService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/ofertaLaboral")
public class OfertaLaboralController {

    @Autowired
    private OfertaLaboralService service;

    @GetMapping("/getAll")
    public List<Oferta_Laboral> list() {
        return service.listAll();
    }

    @GetMapping("/getOfertaLaboral/{id}")
    public ResponseEntity<Oferta_Laboral> get(@PathVariable Integer id) {
        try {
            Oferta_Laboral oferta_Laboral = service.get(id);
            return new ResponseEntity<Oferta_Laboral>(oferta_Laboral, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Oferta_Laboral>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping(value = "/update")
    public void update(@RequestBody Oferta_Laboral oferta_Laboral){
        service.save(oferta_Laboral);
    }

}
