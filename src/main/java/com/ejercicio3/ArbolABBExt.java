package com.ejercicio3;

import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolABB;
import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoABB;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

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
        ColaPorEnlaces<NodoABB<T>> cola = new ColaPorEnlaces<>();
        NodoABB<T> padre = null;
        NodoABB<T> hijo = this.getRaiz();

        while (hijo.getValor().compareTo(nodo.getValor()) != 0 ||
               hijo.getCantidadHijos() == 0) {

            padre = hijo;
            if (hijo.getValor().compareTo(nodo.getValor()) < 0) {
                hijo = hijo.getHijoIzquierdo();
            } else if (hijo.getValor().compareTo(nodo.getValor()) < 0) {
                hijo = hijo.getHijoDerecho();
            }

        }

        if (hijo.getValor().equals(this.getRaiz().getValor()) {
            this.raiz = null;
        }else{
            if(hijo.getValor().compareTo(padre.getValor()))
        }



    /*
        while (!cola.isEmpty()) {
            if (nodo.getHijoIzquierdo() != null) {
                cola.enqueue(nodo.getHijoIzquierdo());
            }
            if (nodo.getHijoDerecho() != null) {
                cola.enqueue(nodo.getHijoDerecho());
            }
            this.remove(nodo.getValor());
            cola.dequeue();

        }*/
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
