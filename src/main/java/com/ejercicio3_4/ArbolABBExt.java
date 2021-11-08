package com.ejercicio3_4;

import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolABB;
import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoABB;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;

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
        NodoABB<T> padre = null;
        NodoABB<T> hijo = this.getRaiz();

        while (hijo.getValor().compareTo(nodo.getValor()) != 0) {

            padre = hijo;
            if (hijo.getValor().compareTo(nodo.getValor()) > 0) {
                hijo = hijo.getHijoIzquierdo();
            } else if (hijo.getValor().compareTo(nodo.getValor()) < 0) {
                hijo = hijo.getHijoDerecho();
            }

        }

        if (hijo.getValor().equals(this.getRaiz().getValor())) {
            this.raiz = null;
        } else {
            if (hijo.getValor().compareTo(padre.getValor()) == 1) {
                padre.setHijoDerecho(null);
            } else if (hijo.getValor().compareTo(padre.getValor()) == -1) {
                padre.setHijoIzquierdo(null);
            }
        }

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
        ListaEnlazadaNoOrdenada<NodoABB<T>> listaX = new ListaEnlazadaNoOrdenada<>();
        ListaEnlazadaNoOrdenada<NodoABB<T>> listaY = new ListaEnlazadaNoOrdenada<>();

        NodoABB<T> aux = this.getRaiz();
        while (!aux.getValor().equals(x.getValor())) {
            listaX.addToRear(aux);
            if (aux.getValor().compareTo(x.getValor()) > 0) {
                aux = aux.getHijoIzquierdo();
            } else if (aux.getValor().compareTo(x.getValor()) < 0) {
                aux = aux.getHijoDerecho();
            }
        }
        aux = this.getRaiz();

        while (!aux.getValor().equals(y.getValor())) {
            listaY.addToRear(aux);
            if (aux.getValor().compareTo(y.getValor()) > 0) {
                aux = aux.getHijoIzquierdo();
            } else if (aux.getValor().compareTo(y.getValor()) < 0) {
                aux = aux.getHijoDerecho();
            }
        }
        aux = null;
        for (int i = 0; i < listaX.size(); i++) {

            for (int j = 0; j < listaY.size(); j++) {

                if (listaX.get(i).equals(listaY.get(j))) {
                    aux = listaX.get(i);
                }
            }
        }
        return aux;
    }

}
