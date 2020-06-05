package dci.ed;

public class Cola {

    ListaEnlazada cola = new ListaEnlazada();

    /*
     *  Método que permite agregar al final de la rear
     */
    public void agregarEnCola(int valor){
        cola.agregarFinal(valor);
    }

    /*
     *  Método que permite remover desde el frente de la rear
     */
    public void removerDesdeFrente(){
        cola.removerDesdeFrente();
    }

}
