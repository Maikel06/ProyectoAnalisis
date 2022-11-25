package com.example.AnalisisProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Requisito_Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Requisito;
    private  boolean requerido;
    private String detalle;


    public Requisito_Puesto(int id_requisito, boolean requerido, String detalle) {
        setId_Requisito(id_requisito);
        this.setRequerido(requerido);
        this.setDetalle(detalle);
    }

    public int getId_Requisito() {
        return id_Requisito;
    }

    public void setId_Requisito(int id_Requisito) {
        this.id_Requisito = id_Requisito;
    }

    public boolean isRequerido() {
        return requerido;
    }

    public void setRequerido(boolean requerido) {
        this.requerido = requerido;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
