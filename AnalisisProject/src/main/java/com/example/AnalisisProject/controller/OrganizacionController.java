package com.example.AnalisisProject.controller;

import com.example.AnalisisProject.entity.Organizacion;
import com.example.AnalisisProject.entity.RequisitoPuesto;
import com.example.AnalisisProject.service.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/organizacion")
public class OrganizacionController {
    @Autowired
    private OrganizacionService service;

    @GetMapping("/getAll")
    public List<Organizacion> list() {
        return service.listAll();
    }

    @GetMapping("/getOrganizacion/{id}")
    public ResponseEntity<Organizacion> get(@PathVariable Integer id) {
        try {
            Organizacion organizacion = service.get(id);
            return new ResponseEntity<Organizacion>(organizacion, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Organizacion>(HttpStatus.NOT_FOUND);
        }
    }
}
