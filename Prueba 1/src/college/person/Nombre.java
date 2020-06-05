package college.person;

import java.util.Scanner;

public class Nombre {
    
    static Scanner intro=new Scanner(System.in);
    
    public Nombre(){
        
    }
    
    public String readName(){
        System.out.println("A continuación deberá ingresar el Nombre y el Apellido de la persona por separado,");
        System.out.println("todo lo que esté después de un espacio no será considerado.");
        return validate();
    }
    
    private String validate(){
        System.out.println("Ingrese el Nombre la persona");
        String name=validName(intro.next());
        System.out.println("Ingrese el Apellido la persona");
        String surname=validSurname(intro.next());
        return validLength(name+" "+surname);
    }
    
    private String validName(String name){
        if ((name).matches("([a-z]|[A-Z]|\\s)+")) {
            return name;
        }else {
            System.out.println("Nombre Inválido, favor intente nuevamente.");
            name=validName(intro.next());
        }
        return name;
    }
    
    private String validSurname(String name){
        
        if ((name).matches("([a-z]|[A-Z]|\\s)+")) {
            return name;
        }else {
            System.out.println("Nombre Inválido, favor intente nuevamente.");
            name=validName(intro.nextLine());
        }
        return name;
    }
    
    private String validLength(String name){
        if (name.length()<=20) {
            return name;
        }else {
            System.out.println("El Nombre es muy largo, favor ingresar un Nombre mas corto");
            name=validate();
        }
        return name;
    }
}