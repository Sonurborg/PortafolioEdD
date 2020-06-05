package dci.ed;

public class Main {
    
    public static void main(String[]Args){
        Mascota felix=new Gato();
        Mascota rocky=new Perro();
        felix.comer();
        felix.hacerSonido();
        rocky.comer();
        rocky.hacerSonido();
    }
    
}
