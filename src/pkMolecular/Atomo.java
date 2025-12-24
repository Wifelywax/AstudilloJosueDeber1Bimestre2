package pkMolecular;

public abstract class Atomo implements IElementoQuimico {
    protected int numeroElectrones; 

    public Atomo(int electrones) {
        this.numeroElectrones = electrones;
    }

    public int getNumeroElectrones() {
        return this.numeroElectrones;
    }

}
