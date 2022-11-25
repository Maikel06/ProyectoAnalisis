package com.example.AnalisisProject.service;

import com.example.AnalisisProject.entity.Requisito_Puesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AnalisisProject.repository.RequisitoPuestoRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RequisitoPuestoService {
    @Autowired
    private RequisitoPuestoRepository repository;


    public List<Requisito_Puesto> listAll() { return repository.findAll(); }

    public Requisito_Puesto get(int id) { return repository.findById(id).get(); }
}
