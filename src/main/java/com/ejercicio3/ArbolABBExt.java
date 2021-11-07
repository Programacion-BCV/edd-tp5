package com.ejercicio3;

import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolABB;
import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoABB;

public class ArbolABBExt<T extends Comparable<? super T>> extends ArbolABB<T> implements ArbolABBExtInterfaz<T> {

    /**
     * Devuelve el valor del nodo con menor valor de clave.
     */
    @Override
    public T min() {

        NodoABB<T> minimo = this.getRaiz();

        if (this.getRaiz().getHijoIzquierdo() == null) {
            return this.getRaiz().getValor();
        }

        while (minimo.tieneHijoIzquierdo()) {
            minimo = minimo.getHijoIzquierdo();
        }

        return minimo.getValor();
    }

    /**
     * Devuelve el valor del nodo con mayor valor de clave.
     */
    @Override
    public T max() {
        NodoABB<T> maximo = this.getRaiz();

        if (this.getRaiz().getHijoDerecho() == null) {
            return this.getRaiz().getValor();
        }

        while (maximo.tieneHijoDerecho()) {
            maximo = maximo.getHijoDerecho();
        }

        return maximo.getValor();
    }

    /**
     * Elimina la rama del árbol que tiene como raíz el nodo pasado por
     * parámetro.
     *
     * @param nodo
     */
    @Override
    public void eliminarRama(NodoABB<T> nodo) {

    }

    /**
     * Devuelve el ancestro compartido por los nodos x e y que se encuentra
     * más lejos de la raíz (más profundo). En caso que alguno de los nodos no
     * pertenezca al árbol devuelve null.
     *
     * @param x
     * @param y
     */
    @Override
    public NodoABB<T> menorAntecesorComun(NodoABB<T> x, NodoABB<T> y) {
        return null;
    }
}
