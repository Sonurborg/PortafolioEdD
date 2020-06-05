package input;
import java.util.Scanner;

public class CharInputReader {

    Scanner intro = new Scanner(System.in);
    
    public CharInputReader(){
    }
    
    /**
     * CharInput Ingresa un String y lo retorna luego de mandarlo a CharErr
     * @return char de A a Z
     */
    public char CharInput(){
        return CharErr(intro.next());
    }
    
    /**
     * Metodo CharErr recibe @param input, valida que sea un String de 1 de largo
     * y que sea una letra.
     * @return char de A a Z
     */
    public char CharErr(String input){
        return validChar(validString(input).charAt(0));
    }
    
    /**
     * Metodo validChar recibe @param in, y mediante AltCode revisa si el char
     * recibido es una letra (es independiente de si la letra es mayuscula o minuscula).
     * @return char de A a Z
     */
    public char validChar(char in) {
        if ((int) in<48 || (int)in > 57) {
            if ((int) in!=107 && (int)in != 75) {
                System.out.println("Favor ingresar un Código verificador válido");
                in=CharInput();
            }
        }
        return in;
    }
    
    /**
     * Metodo ValidString recibe @param in y revisa si es un String
     * de largo 1, de lo contrario pide un nuevo input.
     * @return String de largo 1
     */
    public String validString(String in){
        if (in.length() != 1) {
            System.out.println("Favor ingresar solo un cáracter");
            in=Character.toString(CharInput());
        }
        return in;
    }
        
}