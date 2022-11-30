package com.example.AnalisisProject.repository;

import com.example.AnalisisProject.entity.RequisitoPuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitoPuestoRepository extends JpaRepository<RequisitoPuesto, Integer> {

}
