package pkArtropodo;

public class Segmento {
    private int numeroIdentificador;
    
   
    private Pata[] patas;

    public Segmento(int numero) {
        this.numeroIdentificador = numero;
        
       
        this.patas = new Pata[2];
        this.patas[0] = new Pata("Izquierda");
        this.patas[1] = new Pata("Derecha");
    }

    public void coordinarMovimiento() {
        System.out.println(" [Segmento " + numeroIdentificador + "] activado:");
     
        for (Pata p : patas) {
            p.mover();
        }
    }
}
