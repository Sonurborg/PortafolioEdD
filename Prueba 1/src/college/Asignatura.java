package college;

import college.person.Estudiante;
import college.person.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asignatura {
    
    private String name;
    private int credits;
    private int type;
    private Profesor teacher;
    private List<Estudiante> inscritos= new ArrayList<>();
    private List<Estudiante> pendientes= new ArrayList<>();

    public Asignatura(String name, int credits, int type, Profesor teacher) {
        this.name = name;
        this.credits = credits;
        this.type = type;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Profesor getTeacher() {
        return teacher;
    }
    
    public void addStudent(Estudiante nuevo){
        if (inscritos.size() < credits){
            System.out.println("Estudiante inscirto correctamente");
            inscritos.add(nuevo);
        }else {
            System.out.println("No existen cupos para esta asignatura, el estudiante quedará en");
            System.out.println("lista de espera hasta que un cupo esté disponible.");
            pendientes.add(nuevo);
        }
    }
    
    public void eraseStudent(){
        input.IntInputReader intro = new input.IntInputReader();
        for(int i=0;i<inscritos.size();i++){
            System.out.println(i+".- "+inscritos.get(i).getName());
        }
        System.out.println("Indique el número de lista del Estudiante que desea eliminar");
        inscritos.remove(inscritos.get(intro.input(0, inscritos.size())));
        inscritos.add(pendientes.get(0));
        pendientes.remove(pendientes.get(0));
    }
    
    private void ordenar(){
        //Collections.sort(inscritos);
    }
    
    public void print(){
        System.out.println("Asignatura:"+name);
        
        if (type==0) {
            System.out.print("Grado: Básico");
        } else if (type==1) {
            System.out.print("Grado: Interedio");
        } else System.out.print("Grado: Avanzado");
        
        System.out.println("Profesor:"+teacher);
        ordenar();
        System.out.println("Listado de estudiantes de la asignatura:");
        for(int i=0;i<inscritos.size();i++){
            System.out.println(i+".- "+inscritos.get(i).getName());
        }
        System.out.println("Cupos disponibles:"+credits);
        
        System.out.println("Listado de estudiantes en lista de espera:");
        for(int i=0;i<pendientes.size();i++){
            System.out.println(i+".- "+pendientes.get(i).getName());
        }
    }
}
