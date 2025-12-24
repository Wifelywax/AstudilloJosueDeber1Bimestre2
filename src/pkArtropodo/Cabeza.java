package pkArtropodo;

public class Cabeza {

    private int antenas;

    public Cabeza(int antenas) {
        this.antenas = antenas;
    }

    public void usarAntenas() {
        System.out.println("-> Cabeza rastreando entorno con " + antenas + " antenas.");
    }
}

