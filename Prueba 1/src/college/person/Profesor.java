package college.person;
        
import college.person.Rut;

public class Profesor extends Persona{
    
     public Profesor(Rut rut, Nombre name, String adress) {
        super(rut, name, adress);
    }
    
    public Profesor(){
        summon();
    }
    
    public void print(){
        System.out.println(getBasic());
    }
    
}
