package com.example.AnalisisProject.controller;

import com.example.AnalisisProject.entity.Requisito_Puesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.AnalisisProject.service.RequisitoPuestoService;

import java.util.List;
import java.util.NoSuchElementException;

public class RequisitoPuestoController {
    @Autowired
    private RequisitoPuestoService service;

    @GetMapping("/getAll")
    public List<Requisito_Puesto> list() {
        return service.listAll();
    }

    @GetMapping("/getRequisito/{id}")
    public ResponseEntity<Requisito_Puesto> get(@PathVariable Integer id) {
        try {
            Requisito_Puesto requisito_puesto = service.get(id);
            return new ResponseEntity<Requisito_Puesto>(requisito_puesto, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Requisito_Puesto>(HttpStatus.NOT_FOUND);
        }
    }
}
