package pkMolecular;


public class MoleculaH2O {
    private String nombre;
    
    
    private Hidrogeno[] hidrogenos; 
    private Oxigeno oxigeno;

    public MoleculaH2O() {
        this.nombre = "Agua";
        
        
        this.hidrogenos = new Hidrogeno[] { new Hidrogeno(), new Hidrogeno() };
        this.oxigeno = new Oxigeno();
    }

    public double calcularPesoMolecular() {
        double pesoTotal = 0;
        
        
        pesoTotal += oxigeno.getPesoAtomico();
        
        
        for (Hidrogeno h : hidrogenos) {
            pesoTotal += h.getPesoAtomico();
        }
        
        return pesoTotal;
    }
    
    public String getNombre() {
        return nombre;
    }
}