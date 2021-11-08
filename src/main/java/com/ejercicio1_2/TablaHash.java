package com.ejercicio1_2;

public class TablaHash<K, T> implements TablaHashInterfaz<K, T> {

    private NodoListaHash<K, T>[] tabla;
    private int contador;
    private MetodoResolucionEnum metodo;

    public TablaHash(int tamanio, MetodoResolucionEnum metodo) {
        tabla = new NodoListaHash[tamanio];
        this.metodo = metodo;

    }

    @Override
    public void put(K clave, T valor) {
        int i = funcionHash(clave);
        NodoListaHash<K, T> lista = tabla[i];

        if (lista != null) {
            int indice = (metodo.equals(MetodoResolucionEnum.LINEAL)
                          ? this.colisionLineal(i)
                          : this.colisionCuadratica(clave));
            tabla[indice] = new NodoListaHash<>(clave, valor);
        } else {
            NodoListaHash<K, T> nuevo = new NodoListaHash(clave, valor);
            tabla[i] = nuevo;
            contador++;
        }
    }

    @Override
    public void remove(K clave) {

    }

    @Override
    public T get(K clave) {
        return null;
    }

    @Override
    public boolean contains(K clave) {
        return false;
    }

    @Override
    public void makeEmpty() {

    }

    @Override
    public int size() {
        return contador;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    private int funcionHash(K clave) {
        return clave.hashCode() % tabla.length;
    }

    public void mostrar() {

    }

    private int colisionLineal(int i) {
        while (tabla[i] != null) {
            i++;
            if (i == tabla.length) {
                i = 0;
            }
        }
        return i;
    }

    private int colisionCuadratica(K clave) {
        K claveAux = clave;
        int i = this.funcionHash(claveAux);
        int intentos = 1;
        int retorno = 0;
        while (tabla[retorno] != null) {

            retorno = (int) (i + Math.pow(intentos++, 2));
            retorno = retorno % tabla.length;
        }
        return retorno;
    }

    public String toString() {
        String resultado = "";
        for (int i = 0; i < this.tabla.length; i++) {
            NodoListaHash<K, T> lista = this.tabla[i];
            resultado += "(" + lista.getClave() + "," + lista.getValor() + ")";
        }
        return resultado;
    }
}
