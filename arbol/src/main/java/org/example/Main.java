package org.example;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertarConOrden(10);
        arbol.insertarConOrden(5);
        arbol.insertarConOrden(15);
        arbol.insertarConOrden(3);
        arbol.insertarConOrden(7);
        arbol.insertarConOrden(12);
        System.out.println("Postorden");
        arbol.postorden();
        System.out.println("preorden");
        arbol.preorden();
        System.out.println("inorden");
        arbol.inorden();
        System.out.println("inorden derecha");
        arbol.inordenRight();


        System.out.println("Hello world!");
    }
}