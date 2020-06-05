package ed.dci;

public class ListaEnlazada {
    Nodo cabeza = null;
    Nodo cola = null;

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
     *  Formato de salida: [1,2,3] o []
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

    public static void main(String[] args) {
    }
}
