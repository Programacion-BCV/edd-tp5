package com.ejercicio5_6;

import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoAVL;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.iteradores.Iterador;

public class ArbolAVLIteradorInOrdenInverso<T extends Comparable<? super T>> implements Iterador<T> {
    private NodoAVL<T> raizArbol;
    private final Iterador<T> iterador;

    public ArbolAVLIteradorInOrdenInverso(ArbolAVLExt<T> arbolAvl,
                                          NodoAVL<T> raizArbol) {
        this.raizArbol = raizArbol;
        this.iterador = generarRecorrido(arbolAvl).iterador();
    }

    private ListaEnlazadaNoOrdenada<T> generarRecorrido(
            ArbolAVLExt<T> arbolAvl) {
        ListaEnlazadaNoOrdenada<T> resultado = new ListaEnlazadaNoOrdenada();

        resultado.addAll(agregarSubArbol(raizArbol));

        return resultado;
    }

    private ListaEnlazadaNoOrdenada<T> agregarSubArbol(NodoAVL<T> nodoActual) {
        ListaEnlazadaNoOrdenada<T> resultado = new ListaEnlazadaNoOrdenada();

        if (nodoActual.tieneHijoDerecho()) {
            resultado.addAll(agregarSubArbol(
                    (NodoAVL<T>) nodoActual.getHijoDerecho()));
        }

        resultado.addToRear(nodoActual.getValor());

        if (nodoActual.tieneHijoIzquierdo()) {
            resultado.addAll(agregarSubArbol(
                    (NodoAVL<T>) nodoActual.getHijoIzquierdo()));
        }

        return resultado;
    }

    @Override
    public boolean existeSiguiente() {
        return iterador.existeSiguiente();
    }

    @Override
    public T siguiente() {
        return iterador.siguiente();
    }

}
