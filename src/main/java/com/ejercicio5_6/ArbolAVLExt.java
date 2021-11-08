package com.ejercicio5_6;

import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolABBIteratorPreorden;
import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolAVL;
import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoABB;
import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoAVL;
import ar.edu.uner.fcad.ed.edlineales.iteradores.Iterador;

public class ArbolAVLExt<T extends Comparable<? super T>> extends ArbolAVL<T> implements ArbolAVLExtInterfaz<T> {
    public ArbolAVLExt() {
        super();
    }

    /**
     * Define un iterador en preorden inverso para el árbol AVL.
     * Para el ejemplo el iterador en preorden inverso devuelve: A, C, B.
     *
     * @return
     */
    @Override
    public Iterador<T> iteradorPreOrdenInverso() {
        NodoAVL<T> raiz = (NodoAVL<T>) this.getRaiz();
        if (this.isEmpty()) {
            throw new IllegalStateException("Arbol vacío");
        } else {
            Iterador<T> resultado = new ArbolAVLIteradorPreOrdenInverso<>(this,
                                                                          raiz);
            return resultado;
        }
    }

    /**
     * Define un iterador en inorden inverso para el árbol AVL.
     * Para el ejemplo el iterador en inorden inverso devolverá: C, A, B.
     *
     * @return
     */
    @Override
    public Iterador<T> iteradorInordenInverso() {

        NodoAVL<T> raiz = (NodoAVL<T>) this.getRaiz();
        if (this.isEmpty()) {
            throw new IllegalStateException("Arbol vacío");
        } else {
            Iterador<T> resultado = new ArbolAVLIteradorInOrdenInverso<>(this,
                                                                         raiz);
            return resultado;
        }

    }

    /**
     * Define un iterador en posorden inverso para el árbol AVL.
     * Para el ejemplo el iterador en posorden inverso devuelve: C, B, A.
     *
     * @return
     */
    @Override
    public Iterador<T> iteradorPosordenInverso() {
        NodoAVL<T> raiz = (NodoAVL<T>) this.getRaiz();
        if (this.isEmpty()) {
            throw new IllegalStateException("Arbol vacío");
        } else {
            Iterador<T> resultado = new ArbolAVLIteradorPosOrdenInverso<>(this,
                                                                          raiz);
            return resultado;
        }
    }
}
