package com.example.AnalisisProject.repository;

import com.example.AnalisisProject.entity.Requisito_Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitoPuestoRepository extends JpaRepository<Requisito_Puesto, Integer> {
}
