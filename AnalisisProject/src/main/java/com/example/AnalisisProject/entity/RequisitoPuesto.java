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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ofertaLaboral_id")
    private OfertaLaboral ofertaLaboral;



    public RequisitoPuesto(int id, boolean requerido, String detalle, OfertaLaboral ofertaLaboral) {
        this.setOfertaLaboral(ofertaLaboral);
        this.setId(id);
        this.setRequerido(requerido);
        this.setDetalle(detalle);
    }


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

    public OfertaLaboral getOfertaLaboral() {
        return ofertaLaboral;
    }

    public void setOfertaLaboral(OfertaLaboral ofertaLaboral) {
        this.ofertaLaboral = ofertaLaboral;
    }


}
