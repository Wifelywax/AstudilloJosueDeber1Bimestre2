package pkArtropodo;

public class Pata implements IMovimiento {

   private String lado;

    public Pata(String lado) {
        this.lado = lado;
    }

    @Override
    public void mover() {
        System.out.println("   -> Pata " + lado + " moviéndose.");
    }

    @Override
    public void detener() {
        System.out.println("   -> Pata " + lado + " detenida.");
    }
}