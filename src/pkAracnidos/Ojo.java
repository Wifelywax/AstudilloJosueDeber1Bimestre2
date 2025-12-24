package pkAracnidos;

public class Ojo {
private int cantidad; 

    public Ojo(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void vigilar() {
         System.out.println("   -> Ojo " + cantidad + " abierto.");
    }
}
