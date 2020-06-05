package dci.ed;

public class Pila {

    ListaEnlazada pila = new ListaEnlazada();

    /*
     *  Método que permite agregar un elemento desde el frente de la pila
     */
    public void push(int valor){
        pila.agregarFrente(valor);
    }

    /*
     *  Método que permite eliminar un elemento desde el frente de la pila
     */
    public void pop(){
        pila.removerDesdeFrente();
    }
}
