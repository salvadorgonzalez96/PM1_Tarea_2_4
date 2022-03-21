package com.example.Tarea2_4_Aplicacion_Firma_Digital.Clase;

import android.graphics.Bitmap;

public class Signatures {

    private String id;
    private String descripcion;
    private Bitmap FirmaDigital;

    public Signatures() {
    }

    public Signatures(String id, String descripcion, Bitmap FirmaDigital) {
        this.id = id;
        this.descripcion = descripcion;
        this.FirmaDigital = FirmaDigital;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Bitmap getFirmaDigital() {
        return FirmaDigital;
    }

    public void setFirmaDigital(Bitmap firmaDigital) {
        FirmaDigital = firmaDigital;
    }
}
