package input;
import java.util.Scanner;

public class IntInputReader {

    Scanner intro = new Scanner(System.in);
    private int top,bot;
    
    public IntInputReader(){
    }
    
    /**
     * Metodo input recibe @param Bot y @param Top para almacenarlas en la clase y
     * @return el input recibido de err.
     */
    public int input(int Bot,int Top){
        top=Top;
        bot=Bot;
        return err(intro.next());
    }
    
    /**
     * Metodo err intenta transformar a int el String recibido de
     * @param input, valida el input mediante ValidInt y
     * @return in ya validado
     */
    public int err(String input){
        int in=0;
        try {
            in=validInt(Integer.parseInt(input));
        } catch (Exception ex) {
            System.out.println("Favor ingresar Dígitos y no carácteres");
            in=err(intro.next());
        }
        return in; 
    }
    
    /**
     * Metodo ValidInt recibe @param in y revisa si esta entre los
     * @param bot y @param top establecidos en la clase, si es asi
     * @return in
     */
    public int validInt(int in){
        if (in<bot || in >top) {
            System.out.println("Favor ingresar un número entre "+bot+" y "+top);
            in=input(bot,top);
        }
        return in;
    }
}