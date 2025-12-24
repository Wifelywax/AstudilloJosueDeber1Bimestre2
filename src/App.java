import pkAracnidos.Arania;
import pkAracnidos.Mosca;
import pkArtropodo.Ciempies;
import pkMolecular.MoleculaH2O;

public class App {
    public static void main(String[] args) {
        System.out.println("--------EJERCICIO CIEMPIES--------");
        System.out.println("Creando un ciempiés...");
        
        Ciempies miMascota = new Ciempies("Naranja", "15cm", 3);
        
        
        miMascota.iniciarCaminata();

        System.out.println("-----------EJERCICIO MOLECULA H2O-----------");
        MoleculaH2O miAgua = new MoleculaH2O();
        System.out.println("Fusionando 2 átomos de Hidrógeno y 1 átomo de Oxígeno para formar una molécula de Agua (H2O)...");
        System.out.println("Analizando molécula: " + miAgua.getNombre());
        
       
        double peso = miAgua.calcularPesoMolecular();
        
        System.out.println("El peso molecular calculado es: " + peso + " u (unidades de masa atómica)");
        
         System.out.println("-----------EJERCICIO ARACNIDO-----------");
         Mosca miMosca = new Mosca();
        
    
        Arania tarantula = new Arania("Grande");
        
       
        tarantula.Cazar(miMosca);
    }
    }
    
