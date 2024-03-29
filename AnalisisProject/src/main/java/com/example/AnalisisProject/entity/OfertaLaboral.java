package com.example.AnalisisProject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OfertaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_puesto")
    private String nombrePuesto;
    @Column(name = "tipo_jornada")
    private String tipoJornada;
    //@Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    @Column(name = "periodo_visibilidad")
    private Date periodoVisibilidad;
    @Column(name = "extension_contrato")
    private int extensionContrato;
    @Column(name = "num_vacante")
    private int numVacante;

    public OfertaLaboral(int id, String nombrePuesto, String tipoJornada, Date periodoVisibilidad, int extensionContrato, int numVacante) {
        this.setId(id);
        this.setNombrePuesto(nombrePuesto);
        this.setTipoJornada(tipoJornada);
        this.setPeriodoVisibilidad(periodoVisibilidad);
        this.setExtensionContrato(extensionContrato);
        this.setNumVacante(numVacante);
    }

    public OfertaLaboral() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public Date getPeriodoVisibilidad() {
        return periodoVisibilidad;
    }

    public void setPeriodoVisibilidad(Date periodoVisibilidad) {
        this.periodoVisibilidad = periodoVisibilidad;
    }

    public int getExtensionContrato() {
        return extensionContrato;
    }

    public void setExtensionContrato(int extensionContrato) {
        this.extensionContrato = extensionContrato;
    }

    public int getNumVacante() {
        return numVacante;
    }

    public void setNumVacante(int numVacante) {
        this.numVacante = numVacante;
    }
}
