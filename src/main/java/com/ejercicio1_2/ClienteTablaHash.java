package com.ejercicio1_2;

public class ClienteTablaHash {
    public static void main(String[] args) {
        TablaHash tabla = new TablaHash(11, MetodoResolucionEnum.LINEAL);
        tabla.put(23,"Vera");
        tabla.put(51,"Confa");
        tabla.put(40, "Buenar");
        tabla.put(62, "Programación");
        tabla.toString();
    }
}
