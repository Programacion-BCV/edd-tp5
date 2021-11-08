package com.ejercicio5_6;

import ar.edu.uner.fcad.ed.edlineales.iteradores.Iterador;

public class ClienteArbolAVLExt {
    public static void main(String[] args) {
        ArbolAVLExt<Integer> arbolAVLExt = new ArbolAVLExt<>();

        arbolAVLExt.add(1);
        arbolAVLExt.add(2);
        arbolAVLExt.add(3);
        arbolAVLExt.add(4);
        arbolAVLExt.add(5);
        arbolAVLExt.add(6);
        arbolAVLExt.add(7);

        Iterador<Integer> iteradorPreOrdenInverso = arbolAVLExt.iteradorPreOrdenInverso();

        System.out.print("Iterador Pre orden Inverso:");
        while (iteradorPreOrdenInverso.existeSiguiente()) {
            System.out.print("[" + iteradorPreOrdenInverso.siguiente() + "] ");
            System.out.print(
                    iteradorPreOrdenInverso.existeSiguiente() ? "," : "\n");
        }

        Iterador<Integer> iteradorPosOrdenInverso = arbolAVLExt.iteradorPosordenInverso();

        System.out.print("Iterador Pos orden Inverso:");
        while (iteradorPosOrdenInverso.existeSiguiente()) {
            System.out.print("[" + iteradorPosOrdenInverso.siguiente() + "] ");
            System.out.print(
                    iteradorPosOrdenInverso.existeSiguiente() ? "," : "\n");
        }

        Iterador<Integer> iteradorInOrdenInverso = arbolAVLExt.iteradorInordenInverso();

        System.out.print("Iterador In orden Inverso:");
        while (iteradorInOrdenInverso.existeSiguiente()) {
            System.out.print("[" + iteradorInOrdenInverso.siguiente() + "] ");
            System.out.print(
                    iteradorInOrdenInverso.existeSiguiente() ? "," : "\n");
        }
    }
}
