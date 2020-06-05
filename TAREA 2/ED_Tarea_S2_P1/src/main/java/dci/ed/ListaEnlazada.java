package dci.ed;

public class ListaEnlazada {

    Nodo cabeza = null;
    Nodo cola = null;

    /*
     *  Método que permite si un valor particular
     *  existe en la Lista Enlazada
     */
    public boolean contiene ( int valor ) {
        Nodo actual = cabeza;
        while (actual != null){
            if ( actual.valor == valor ) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /*
     *  Método que permite obtener un valor determinado
     *  en una posición específica de una la Lista Enlazada
     */
    public int getPorIndice ( int index ) {
        if ( index < 0 ) {
            throw new IndexOutOfBoundsException();
        } else {
            Nodo actual = cabeza;
            for ( int i = 0; i < index; i++ ) {
                if ( actual == null || actual.siguiente == null ) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.siguiente;
            }
            return actual.valor;
        }
    }

    /*
     *  Método que permite remover un valor
     *  desde el frente de una la Lista Enlazada
     */
    public void removerDesdeFrente(){
        if (cabeza != null) {
            cabeza=cabeza.siguiente;
        }else throw new IndexOutOfBoundsException();
    }

    /*
     *  Método que permite remover un valor
     *  desde la rear una la Lista Enlazada
     */
    public void removerDesdeCola(){
        if (cola != null) {
            Nodo actual = cabeza;
            do {
                if (actual.siguiente==cola) {
                    actual.siguiente=null;
                    cola=actual;
                }
                actual=actual.siguiente;
            }while (actual != null);
        }else throw new IndexOutOfBoundsException();
    }

    /*
     *  Método que permite remover un valor determinado
     *  en una posición específica de una la Lista Enlazada
     */
    public void removerEnIndice(int index){
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            removerDesdeFrente();
        }else{
            Nodo last=cabeza;
            Nodo actual = cabeza;
            for (int i = 0; i < index; i++) {
                if (actual.siguiente == null) {
                    throw new IndexOutOfBoundsException();
                }
                last=actual;
                actual = actual.siguiente;
            }
            if (actual.siguiente == null) {
                removerDesdeCola();
            } else {
                last.siguiente=actual.siguiente;

            }
        }
    }

    /*
     *  Método que permite agregar un elemento
     *  al frente de la Lista Enlazada
     */
    public void agregarFrente(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        if ( nuevoNodo.siguiente == null ) {
            cola = nuevoNodo;
        }
    }

    /*
     *  Método que permite agregar un elemento
     *  al final la Lista Enlazada
     */
    public void agregarFinal(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        if ( cola == null ){
            cabeza = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
        }
        cola = nuevoNodo;
    }

    /*
     *  Método que permite agregar un elemento
     *  en un índice específico de la Lista Enlazada
     */
    public void agregarEnIndice(int index, int valor) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            agregarFrente(valor);
        }else{
            Nodo nuevoNodo = new Nodo(valor);
            Nodo actual = cabeza;
            for (int i = 0; i < index - 1; i++) {
                if (actual.siguiente == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.siguiente;
            }
            if (actual.siguiente == null) {
                agregarFinal(valor);
            } else {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
            }
        }
    }

    /*
     *  Método que permite imprimir los elementos
     *  de la Lista Enlazada
     */
    public void imprimirLista(ListaEnlazada nombreLista){
        if (nombreLista.cabeza==null && nombreLista.cola==null) {
            System.out.println("[]");
        }else {
            Nodo actual=nombreLista.cabeza;
            System.out.print("[");
            do{
                if (actual.siguiente == null) {
                    System.out.print(actual.valor);
                }else{
                    System.out.print(actual.valor + ",");
                }
                actual=actual.siguiente;
            }while (actual != null);
            System.out.print("]");
        }
    }

}
