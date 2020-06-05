package college.person;

import college.person.Rut;

public class Estudiante extends Persona /*implements Comparable*/{
    
    private int promedio;

    public Estudiante(int promedio,Rut rut, Nombre name, String adress) {
        super(rut, name, adress);
        this.promedio=promedio;
    }
    
    public Estudiante(int promedio){
        summon();
    }

    public int getPromedio() {
        return promedio;
    }
    
    public void print(){
        System.out.println(getBasic()+", Promedio:"+promedio);
    }

    //@Override
    public int compareTo(Estudiante comparestu) {
        int compareGrades=((Estudiante)comparestu).getPromedio();
        return this.promedio-compareGrades;
    }

}