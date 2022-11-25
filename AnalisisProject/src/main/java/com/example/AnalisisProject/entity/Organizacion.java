package com.example.AnalisisProject.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Organizacion {

    private int id_Organizacion;
    private String nombre;
    private String correo;
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "Oferta_Laboral_Id")
    private Oferta_Laboral oferta_laboral;

    public Organizacion(int id_organizacion, String nombre, String correo, String telefono, Oferta_Laboral oferta_laboral) {
        setId_Organizacion(id_organizacion);
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setTelefono(telefono);
        this.setOferta_laboral(oferta_laboral);
    }

    public int getId_Organizacion() {
        return id_Organizacion;
    }

    public void setId_Organizacion(int id_Organizacion) {
        this.id_Organizacion = id_Organizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Oferta_Laboral getOferta_laboral() {
        return oferta_laboral;
    }

    public void setOferta_laboral(Oferta_Laboral oferta_laboral) {
        this.oferta_laboral = oferta_laboral;
    }
}
