package com.example.AnalisisProject.service;

import com.example.AnalisisProject.entity.RequisitoPuesto;
import com.example.AnalisisProject.repository.RequisitoPuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class RequisitoPuestoService {
    @Autowired
    private RequisitoPuestoRepository repository;
    public List<RequisitoPuesto> listAll() { return repository.findAll(); }
    public RequisitoPuesto get(int id) { return repository.findById(id).get(); }
}
