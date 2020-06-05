package college.person;

import college.person.Rut;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Persona {
    
    private static Scanner intro=new Scanner(System.in);
    private Nombre nameIntro = new Nombre();
    private Rut rutIntro = new Rut();
    
    protected String rut;
    protected String name;
    protected String adress;
    protected LocalDate inc;
    
    public Persona(Rut rut,Nombre name, String adress){
        this.inc=LocalDate.now();
    }
    
    public Persona(){
        summon();
    }
    
    public void summon(){
        this.name=inputName();
        this.rut=inputRut();
        this.adress=inputAdress();
        this.inc=LocalDate.now();
    }
    
    public String getBasic(){
        return (this.name+", RUT:"+this.rut+", Domicilio:"+this.adress+", Incorporado el:"+this.inc);
    }
    
    private String inputName(){
        return (nameIntro.readName());
    }
    
    private String inputRut(){
        return (rutIntro.readRut());
    }
    
    private String inputAdress(){
        return (intro.next());
    }
    
    protected void print(){};

    public String getRut() {
        return rut;
    }

    public String getAdress() {
        return adress;
    }

    public LocalDate getInc() {
        return inc;
    }

    public String getName() {
        return name;
    }
    
    
}
