package com.example.AnalisisProject.repository;

import com.example.AnalisisProject.entity.Oferta_Laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OfertaLaboralRepository extends JpaRepository<Oferta_Laboral, Integer> {

}
