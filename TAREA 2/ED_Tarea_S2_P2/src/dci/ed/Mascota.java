package dci.ed;

public abstract class Mascota {
    
    protected String sonido;
    
    public Mascota(){
    }
    
    public void hacerSonido(){
        System.out.println(sonido);
    }
    
    public void comer(){
        System.out.println("crac-crac");
    }
}
