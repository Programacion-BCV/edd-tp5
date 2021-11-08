package com.ejercicio1_2;

public class NodoListaHash<K, T> {
    protected K clave;
    protected T valor;

    public NodoListaHash() {
    }

    public NodoListaHash(K clave, T valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "NodoListaHash{" +
               "clave=" + clave +
               ", valor=" + valor +
               '}';
    }
}
