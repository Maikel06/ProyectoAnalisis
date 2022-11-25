package com.example.AnalisisProject.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Oferta_Laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Oferta_Laboral;
    private String nombre_Puesto;
    private String tipo_Jornada;
    private Date periodo_Visibilidad;
    private int extension_Contrato;
    private int num_Vacante;

    @ManyToOne
    @JoinColumn(name = "Organizacion_Id")
    private Organizacion organizacion;

    @ManyToOne
    @JoinColumn(name = "Requisito_Puesto_Id")
    private Requisito_Puesto habilidades_Blandas;

    @ManyToOne
    @JoinColumn(name = "Requisito_Puesto_Id")
    private Requisito_Puesto idiomas;

    @ManyToOne
    @JoinColumn(name = "Requisito_Puesto_Id")
    private Requisito_Puesto certificaciones;

    @ManyToOne
    @JoinColumn(name = "Requisito_Puesto_Id")
    private Requisito_Puesto habilidades_Tecnicas;

    @ManyToOne
    @JoinColumn(name = "Requisito_Puesto_Id")
    private Requisito_Puesto experiencia_Laboral;

    public Oferta_Laboral(int id_oferta_laboral, String nombre_puesto, String tipo_jornada, Date periodo_visibilidad,
                          int extension_contrato, int num_vacante, Organizacion organizacion, Requisito_Puesto habilidades_blandas,
                          Requisito_Puesto idiomas, Requisito_Puesto certificaciones, Requisito_Puesto habilidades_tecnicas,
                          Requisito_Puesto experiencia_laboral) {
        setId_Oferta_Laboral(id_oferta_laboral);
        setNombre_Puesto(nombre_puesto);
        setTipo_Jornada(tipo_jornada);
        setPeriodo_Visibilidad(periodo_visibilidad);
        setExtension_Contrato(extension_contrato);
        setNum_Vacante(num_vacante);
        this.setOrganizacion(organizacion);
        setHabilidades_Blandas(habilidades_blandas);
        this.setIdiomas(idiomas);
        this.setCertificaciones(certificaciones);
        setHabilidades_Tecnicas(habilidades_tecnicas);
        setExperiencia_Laboral(experiencia_laboral);
    }

    public int getId_Oferta_Laboral() {
        return id_Oferta_Laboral;
    }

    public void setId_Oferta_Laboral(int id_Oferta_Laboral) {
        this.id_Oferta_Laboral = id_Oferta_Laboral;
    }

    public String getNombre_Puesto() {
        return nombre_Puesto;
    }

    public void setNombre_Puesto(String nombre_Puesto) {
        this.nombre_Puesto = nombre_Puesto;
    }

    public String getTipo_Jornada() {
        return tipo_Jornada;
    }

    public void setTipo_Jornada(String tipo_Jornada) {
        this.tipo_Jornada = tipo_Jornada;
    }

    public Date getPeriodo_Visibilidad() {
        return periodo_Visibilidad;
    }

    public void setPeriodo_Visibilidad(Date periodo_Visibilidad) {
        this.periodo_Visibilidad = periodo_Visibilidad;
    }

    public int getExtension_Contrato() {
        return extension_Contrato;
    }

    public void setExtension_Contrato(int extension_Contrato) {
        this.extension_Contrato = extension_Contrato;
    }

    public int getNum_Vacante() {
        return num_Vacante;
    }

    public void setNum_Vacante(int num_Vacante) {
        this.num_Vacante = num_Vacante;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public Requisito_Puesto getHabilidades_Blandas() {
        return habilidades_Blandas;
    }

    public void setHabilidades_Blandas(Requisito_Puesto habilidades_Blandas) {
        this.habilidades_Blandas = habilidades_Blandas;
    }

    public Requisito_Puesto getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Requisito_Puesto idiomas) {
        this.idiomas = idiomas;
    }

    public Requisito_Puesto getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(Requisito_Puesto certificaciones) {
        this.certificaciones = certificaciones;
    }

    public Requisito_Puesto getHabilidades_Tecnicas() {
        return habilidades_Tecnicas;
    }

    public void setHabilidades_Tecnicas(Requisito_Puesto habilidades_Tecnicas) {
        this.habilidades_Tecnicas = habilidades_Tecnicas;
    }

    public Requisito_Puesto getExperiencia_Laboral() {
        return experiencia_Laboral;
    }

    public void setExperiencia_Laboral(Requisito_Puesto experiencia_Laboral) {
        this.experiencia_Laboral = experiencia_Laboral;
    }
}
