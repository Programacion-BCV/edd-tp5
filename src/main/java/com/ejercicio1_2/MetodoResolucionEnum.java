package com.ejercicio1_2;

public enum MetodoResolucionEnum {
LINEAL("Lineal"),CUADRATICO("Cuadrático");

    private final String metodo;

    MetodoResolucionEnum(String metodo) {
        this.metodo = metodo;
    }

    public String getMetodo() {
        return this.metodo;
    }
}
