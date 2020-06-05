package Main;

import college.Asignatura;
import college.person.Persona;
import college.person.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sonur
 */
public class Main {
    
    public static List<college.Asignatura> ramos= new ArrayList<>();
    static input.IntInputReader option= new input.IntInputReader();
    static Scanner intro=new Scanner(System.in);
    
    public static void main(String[]Args){
        menu();
    }
    
    /**
     * Metodo menu ejecuta al metodo options mientras
     * @param selection sea diferente de 3.
     */
    private static void menu(){
        int selection;
        do {
           selection=optionSel();
           options(selection);
        }while (selection!=3);
    }
    
    /**
     * Metodo optionSel imprime las opciones para el menú y
     * @return input recibido de IntInputReader.
     */
    private static int optionSel() {
        System.out.println("Seleccione lo que desea realizar");
        System.out.println(" 1 - Agregar estudiante");
        System.out.println(" 2 - Mostrar Estudiantes");
        System.out.println(" 3 - Agregar Profesor");
        System.out.println(" 4 - Mostrar Profesores");
        System.out.println(" 5 - Agregar Personal");
        System.out.println(" 6 - Mostrar Personal");
        System.out.println(" 7 - Salir");
        return option.input(1, 7);
    }
    
    /**
     * Metodo options recibe el
     * @param o
     * ejecuta el metodo correspondiente a la opcion seleccionada.
     */
    private static void options(int o){
        if (o==1) addStudent(ramos.get(selectRamo()));
        if (o==2) showRamos(); 
        if (o==3) addTeacher();
        if (o==4) showTeachers();
    }
    
    private static void addStudent(Asignatura ramo){
        ramo.addStudent(new college.person.Estudiante(5));
    }
    
    private static void showRamos(){
        for (int i=0;i<ramos.size();i++) {
            ramos.get(i).print();
        }
    }
    
    private static void addTeacher(){
        ramos.add(newRamo());
    }
    
    private static Asignatura newRamo(){
        System.out.println("Ingrese la Asignatura que ejerce el Nuevo Profesor");
        String name = intro.nextLine();
        System.out.println("Ingrese el tipo de asignatura");
        System.out.println(" 0 - Básico");
        System.out.println(" 1 - Intermedio");
        System.out.println(" 2 - Avanzado");
        int grade=option.input(0,2);
        return new Asignatura(name,3,grade, new college.person.Profesor());
    }
    
    private static void showTeachers(){
        for (int i=0;i<ramos.size();i++) {
            ramos.get(i).getTeacher().print();
            System.out.print(" , Asignatura: "+ramos.get(i).getName());
        }
    }
    
    private static int selectRamo(){
        System.out.println("Seleccione la Asignatura en la que desea realizar la acción");
        for(int i=0;i<ramos.size();i++){
            System.out.println(i+".- "+ramos.get(i).getName());
        }
        return option.input(0, ramos.size());
    }
    
}
