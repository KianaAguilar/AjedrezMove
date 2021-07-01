
import java.util.ArrayList;


public class Pieza extends Ajedress {
    public String pieza;
    public String movimiento;
    public String comida;

    public Pieza(String pieza) {
        this.pieza = pieza;
    }

    public Pieza() {
    }

  
    //el get datos es el que imprime al final.
    public String getDatos() {
        String datos = null; 
        datos = "la pieza: "+ this.pieza + " mueve: "+ this.movimiento + " come: "+ this.comida;
                
         return datos;
        
        
    }
    
    
    
    
    
    
    
    
}

