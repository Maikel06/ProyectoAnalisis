package com.example.AnalisisProject.service;

import com.example.AnalisisProject.entity.Oferta_Laboral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import com.example.AnalisisProject.repository.OfertaLaboralRepository;

import java.util.List;

@Service
@Transactional
public class OfertaLaboralService {

    @Autowired
    private OfertaLaboralRepository repository;

    public List<Oferta_Laboral> listAll() { return repository.findAll(); }

    public void save(Oferta_Laboral ofertaLaboral) { repository.save(ofertaLaboral); }

    public Oferta_Laboral get(int id) { return repository.findById(id).get(); }
}
