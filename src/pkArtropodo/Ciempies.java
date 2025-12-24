package pkArtropodo;

import java.util.ArrayList;
import java.util.List;

public class Ciempies {
   
    private String color;
    private String longitud;

   
    private Cabeza cabeza;
    private List<Segmento> cuerpo; 

    public Ciempies(String color, String longitud, int cantidadSegmentos) {
        this.color = color;
        this.longitud = longitud;
        
       
        this.cabeza = new Cabeza(2); 
        
      
        this.cuerpo = new ArrayList<>();
        for (int i = 1; i <= cantidadSegmentos; i++) {
            
            cuerpo.add(new Segmento(i));
        }
    }

    public void iniciarCaminata() {
        System.out.println("=== Ciempiés " + color + " (" + longitud + ") iniciando marcha ===");
        
      
        cabeza.usarAntenas();
        
      
        for (Segmento seg : cuerpo) {
            seg.coordinarMovimiento();
        }
        System.out.println("=== Fin del ciclo de paso ===");
    }
}
