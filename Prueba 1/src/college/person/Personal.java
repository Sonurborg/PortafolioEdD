package college.person;

import college.person.Rut;

public class Personal extends Persona{
    
    private String profesion;

    public Personal(String profesion, Rut rut, Nombre name, String adress) {
        super(rut, name, adress);
        this.profesion = profesion;
    }
    
    public Personal(String profesion){
        summon();
    }
    
    public void print(){
        System.out.println(this.name+", Profesión:"+this.profesion);
    }
}
