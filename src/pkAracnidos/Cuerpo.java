package pkAracnidos;

public class Cuerpo {
 
    private Pata[] patas; 
    private Ojo[] ojos;   

    public Cuerpo() {
        
        patas = new Pata[8];
        for (int i = 0; i < 8; i++) {
            patas[i] = new Pata(i + 1);
        }

        
        ojos = new Ojo[8];
        for (int i = 0; i < 8; i++) {
            ojos[i] = new Ojo(i + 1);
        }
    }

    public void activarMovimiento() {
        System.out.println("[Cuerpo] Iniciando movimiento de extremidades...");
        for (Pata p : patas) {
            p.mover();
        }
    }
}
