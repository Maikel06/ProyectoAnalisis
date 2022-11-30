package com.example.AnalisisProject.entity;

import javax.persistence.*;

@Entity
public class RequisitoPuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "requerido", columnDefinition = "default bit 1")
    private  boolean requerido;
    @Column(name = "detalle")
    private String detalle;

    public RequisitoPuesto(int id, boolean requerido, String detalle) {
        this.setId(id);
        this.setRequerido(requerido);
        this.setDetalle(detalle);
    }

    //clase a y clase b, a esta asociado con una b, y b con muchas a, many to one

    public RequisitoPuesto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
