package com.ejercicio3;

public class ClienteArbolABBExt {
    public static void main(String[] args) {
        ArbolABBExt<Integer> arbolBin = new ArbolABBExt<>();

        arbolBin.add(2);
        arbolBin.add(4);
        arbolBin.add(7);
        arbolBin.add(9);
        arbolBin.add(8);
        arbolBin.add(12);
        arbolBin.add(21);
        arbolBin.add(16);
        arbolBin.add(13);
        arbolBin.add(25);
        arbolBin.add(19);

        System.out.println(arbolBin.max());
    }
}
