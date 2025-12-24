package pkAracnidos;

public class Pata implements IMoverse {
   private int numero; 

    public Pata(int numero) {
        this.numero = numero;
    }

    @Override
    public void mover() {
        System.out.println("   -> Pata #" + numero + " moviéndose.");
    }
}
