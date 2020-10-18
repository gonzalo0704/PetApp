package com.example.petapp;

public class Mascotas {
    private String nombreMascota;
    private Integer  votoMascota;
    private Integer  fotoMascota;

    public Mascotas(String nombreMascota, Integer votoMascota, Integer fotoMascota) {
        this.nombreMascota = nombreMascota;
        this.votoMascota = votoMascota;
        this.fotoMascota = fotoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getVotoMascota() {
        return votoMascota;
    }

    public void setVotoMascota(Integer votoMascota) {
        this.votoMascota = votoMascota;
    }

    public Integer getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(Integer fotoMascota) {
        this.fotoMascota = fotoMascota;
    }
}
