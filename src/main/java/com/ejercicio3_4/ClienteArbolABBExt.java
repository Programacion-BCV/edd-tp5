package com.ejercicio3_4;

import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoABB;
import ar.edu.uner.fcad.ed.edlineales.iteradores.Iterador;

public class ClienteArbolABBExt {
    public static void main(String[] args) {
        ArbolABBExt<Integer> arbolBin = new ArbolABBExt<>();

        arbolBin.add(12);
        arbolBin.add(21);
        arbolBin.add(7);
        arbolBin.add(4);
        arbolBin.add(9);
        arbolBin.add(16);
        arbolBin.add(25);
        arbolBin.add(2);
        arbolBin.add(8);
        arbolBin.add(13);
        arbolBin.add(19);

        System.out.println(arbolBin);

        System.out.println("Nodo con menor valor de clave: [" + arbolBin.min()+"]");
        System.out.println("Nodo con mayor valor de clave: [" + arbolBin.max()+"]");
        System.out.println("Eliminado de rama a partir de nodo");
        arbolBin.eliminarRama(new NodoABB<>(21));
        System.out.println(arbolBin);

        System.out.println("Menor antecesor común entre el nodo 2 y 8: " +
                           arbolBin.menorAntecesorComun(new NodoABB<>(2),
                                                        new NodoABB<>(8)));

    }
}
