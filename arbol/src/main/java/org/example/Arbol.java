package org.example;



class Arbol {
    private Nodo raiz;

    public Arbol() {

    }





    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    public void insertarConOrden(int data){
        if (this.raiz == null) {
            this.raiz = new Nodo(data);
        } else {
            Nodo nodo = this.raiz;
            while (nodo != null) {
                if(data == nodo.getValue()){
                    break;
                }
                if (data < nodo.getValue()) {
                    if (nodo.getDerecha() == null) {
                        nodo.setDerecha(new Nodo(data));
                        break;
                    } else {
                        nodo = nodo.getDerecha();
                    }
                } else {
                    if (nodo.getIzquierda() == null) {
                        nodo.setIzquierda(new Nodo(data));
                        break;
                    } else {
                        nodo = nodo.getIzquierda();
                    }
                }
            }
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getValue()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }
    public void preorden() {
        this.preorden(this.raiz);

    }
    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}

class Nodo {
    private int dato;
    private Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public int getValue() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getValue());
    }
}