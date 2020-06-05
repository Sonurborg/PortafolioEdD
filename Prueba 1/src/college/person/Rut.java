package college.person;

import java.util.Scanner;

/**
 *
 * @author sonur
 */
public class Rut {
    
    static Scanner intro = new Scanner(System.in);
    
    public Rut(){
        
    }
    
    public String readRut(){
        System.out.println("A continuación deberá ingresar el Rut y el Codigo Verificador del usuario por separado,");
        System.out.println("todo lo que esté después de un espacio no será considerado.");
        return validate();
    }
    
    private String validate(){
        input.IntInputReader intro= new input.IntInputReader();
        input.CharInputReader charIntro=new input.CharInputReader();
        System.out.println("Ingrese el Rut del nuevo usuario SIN CODIGO VERIFICADOR");
        int number=intro.input(0,99999999);
        System.out.println("Ingrese el Codigo Verificador del Rut del nuevo usuario");
        char code=charIntro.CharInput();
        return (number+"-"+code);
    }
}
