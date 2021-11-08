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
        for (int i = 0; i < tabla.length; i++) {
            if (this.tabla[i] != null) {

                if (this.tabla[i].getClave().equals(clave)) {
                    this.tabla[i] = null;
                    this.contador--;
                    break;
                }
            }
        }
    }

    @Override
    public T get(K clave) {
        T valor = null;
        for (int i = 0; i < tabla.length; i++) {
            if (this.tabla[i] != null) {

                if (this.tabla[i].getClave().equals(clave)) {
                    valor = (T) this.tabla[i].getValor();
                }
            }
        }
        return valor;
    }

    @Override
    public boolean contains(K clave) {
        boolean resultado = false;
        for (int i = 0; i < tabla.length; i++) {
            if (this.tabla[i] != null) {

                if (this.tabla[i].getClave().equals(clave)) {
                    resultado= true;
                    break;
                }
            }
        }
        return resultado;
    }

    @Override
    public void makeEmpty() {
        for (int i = 0; i < tabla.length; i++) {
            if (this.tabla[i] != null) {
                this.tabla[i] = null;
                this.contador--;
            }
        }
    }

    @Override
    public int size() {
        return tabla.length;
    }

    @Override
    public boolean isFull() {
        return this.tabla.length == this.contador;
    }

    private int funcionHash(K clave) {
        return clave.hashCode() % tabla.length;
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
            resultado += i + ": ";
            if (this.tabla[i] != null) {
                resultado +=
                        "[" + lista.getClave() + "," + lista.getValor() + "]" +
                        "\n";
            } else {
                resultado += "\n";
            }
        }
        return resultado;
    }
}
