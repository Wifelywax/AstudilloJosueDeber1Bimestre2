package pkAracnidos;

public class Arania {
private String porte; 
    
    
    private Cuerpo cuerpo;
    private Abdomen abdomen;

    public Arania(String porte) {
        this.porte = porte;
      
        this.cuerpo = new Cuerpo();
        this.abdomen = new Abdomen();
    }


    public void Cazar(Mosca presa) {
        System.out.println("=== Araña de porte " + porte + " inicia la caza ===");
        
        
        abdomen.usarHilera();
        
        cuerpo.activarMovimiento();
        
        System.out.println("=== ¡Caza finalizada! (La mosca ha sido atrapada) ===");
    }
}
