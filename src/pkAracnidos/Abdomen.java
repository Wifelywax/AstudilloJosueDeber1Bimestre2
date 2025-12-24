package pkAracnidos;

public class Abdomen {
private Hilera hilera;

    public Abdomen() {
        
        this.hilera = new Hilera("Pegajosa");
    }

    public void usarHilera() {
        hilera.TejerTela();
    }
}
