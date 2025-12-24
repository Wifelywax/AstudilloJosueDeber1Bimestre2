package pkAracnidos;

public class Hilera implements ITejer {
    private String seda; 

    public Hilera(String tipoSeda) {
        this.seda = tipoSeda;
    }

    @Override
    public void TejerTela() {
        System.out.println("   -> Hilera tejiendo con seda de tipo: " + seda);
    }

}
