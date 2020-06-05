package college.person;

public class Apoderado extends Persona{
    
    private Estudiante son;
    
    public Apoderado(){
        summon();
    }

    public void setSon(Estudiante son) {
        this.son = son;
    }
    
    public void print(){
        System.out.println(getBasic());
    }
}
