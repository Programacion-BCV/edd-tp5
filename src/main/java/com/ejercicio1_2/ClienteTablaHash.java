package com.ejercicio1_2;

public class ClienteTablaHash {
    public static void main(String[] args) {

        TablaHash tabla = new TablaHash(11, MetodoResolucionEnum.LINEAL);
        tabla.put(23,"Vera");
        tabla.put(51,"Confalonieri");
        tabla.put(40, "Buenar");
        tabla.put(62, "Programación");
        System.out.println("-----Tabla con método de resolución de colisiones lineal-----");
        System.out.println(tabla);
        System.out.println("-----Quitando el valor 23-----");
        tabla.remove(23);
        System.out.println(tabla);
        System.out.println("-----Obteniendo el valor con clave 51-----");
        System.out.println(tabla.get(51));
        System.out.println("-----Preguntando si esta el valor con clave 23 en la estructura-----");
        System.out.println(tabla.contains(23));
        System.out.println("-----Haciendo vacía la tabla-----");
        tabla.makeEmpty();
        System.out.println(tabla);
        System.out.println("-----Tamanio de la tabla-----");
        System.out.println(tabla.size());
        System.out.println("-----Preguntando si la tabla esta llena-----");
        System.out.println(tabla.isFull());





        TablaHash tabla2 = new TablaHash(11, MetodoResolucionEnum.CUADRATICO);
        tabla2.put(23,"Vera");
        tabla2.put(51,"Confa");
        tabla2.put(40, "Buenar");
        tabla2.put(62, "Programación");
        System.out.println("-----Tabla con método de resolución de colisiones cuadrático-----");
        System.out.println(tabla2);
        System.out.println("-----Quitando el valor 23-----");
        tabla2.remove(23);
        System.out.println(tabla2);
        System.out.println("-----Obteniendo el valor con clave 51-----");
        System.out.println(tabla2.get(51));
        System.out.println("-----Preguntando si esta el valor con clave 23 en la estructura-----");
        System.out.println(tabla2.contains(23));
        System.out.println("-----Haciendo vacía la tabla-----");
        tabla2.makeEmpty();
        System.out.println(tabla2);
        System.out.println("-----Tamanio de la tabla-----");
        System.out.println(tabla2.size());
        System.out.println("-----Preguntando si la tabla esta llena-----");
        System.out.println(tabla2.isFull());
    }
}
