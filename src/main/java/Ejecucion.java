
import java.util.ArrayList;


public class Ejecucion {

  
    public static void main(String[] args) {
        
        ArrayList<String> piezasAjedress=new ArrayList<String>();
        
        //mi lista de arrays
        piezasAjedress.add("peon");
        piezasAjedress.add("caballo");
	piezasAjedress.add("torre");
	piezasAjedress.add("alfil");
	piezasAjedress.add("reina");
	piezasAjedress.add("rey");
		
        Ajedress A = new Ajedress();
		
		for (String Pieza: piezasAjedress) {
		    A.SetearPieza(Pieza);
		}

		for(Pieza pieza : A.listadePieza){
                  
                    System.out.println( pieza.getDatos());
 }
    }
    
}
