package com.example.AnalisisProject.controller;

import com.example.AnalisisProject.entity.OfertaLaboral;
import com.example.AnalisisProject.entity.RequisitoPuesto;
import com.example.AnalisisProject.service.RequisitoPuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/requisito")
@CrossOrigin(origins = "http://localhost:4200")
public class RequisitoPuestoController {
    @Autowired
    private RequisitoPuestoService service;

    @GetMapping("/getAll")
    public List<RequisitoPuesto> list() {
        return service.listAll();
    }

    @GetMapping("/getRequisito/{id}")
    public ResponseEntity<RequisitoPuesto> get(@PathVariable Integer id) {
        try {
            RequisitoPuesto requisitoPuesto = service.get(id);
            return new ResponseEntity<RequisitoPuesto>(requisitoPuesto, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<RequisitoPuesto>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping(value = "/update")
    public void update(@RequestBody RequisitoPuesto requisitoPuesto){
        service.save(requisitoPuesto);
    }
}
