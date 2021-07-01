
import java.util.ArrayList;


public class Ajedress {
   
    
ArrayList <Pieza> listadePieza = new ArrayList<Pieza>();
    
 public void SetearPieza(String pieza ){
   Pieza piezaobj =  new Pieza(pieza);
   
    piezaobj.movimiento = setMovimientopieza(pieza);
    piezaobj.comida = setComidapieza(pieza);
    listadePieza.add(piezaobj);
    
    }
   
    public String setMovimientopieza(String pieza) {
       
  
        switch (pieza)
            {
            case  "peon":
              return "adelante uno pero la salida puede ser adelante dos Come:en diagonal de a uno solo casillero";
                    
            case "caballo":
                    return " adelante tres y derecha o izquierda dos  para adelante o para atras ";
                    
            case  "torre":
                return"linea recta para adelante, atras o hacia los";
                    
            case "alfil":
            return" diagonal derecha o izquierda para adelante o para atras";
                   
            case  "rey":
            return " hacia cualquier direccion pero desde a un solo casillero ";
                    
            case  "reina":
            return" combina los movimientos del alfil y de la torre ";
                  
            default: return "error de ingreso de pieza";
                   
        }
    }


    public String setComidapieza(String pieza) {
            switch (pieza)
                            {
            
            case  "peon":
                return "en diagonal de a uno solo casillero";
                     
            case "caballo":
                    return"adelante tres y derecha o izquierda dos  para adelante o para atras";
                    
            case  "torre":
                return  "linea recta para adelante, atras o hacia los costados";
                    
            case "alfil":
           return "Come:diagonal derecha o izquierda para adelante o para atras";
                   
            case  "rey":
            return "Come:combina los movimientos del alfil y de la torre ";
                   
            case  "reina":
          return"Come:hacia cualquier direccion pero desde a un solo casillero";
            default: return null;
        
    }
}
    
    } 
    



