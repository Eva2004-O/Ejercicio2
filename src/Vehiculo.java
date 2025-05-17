public abstract class Vehiculo {
    protected String modelo;
    protected int numeroSerie;
    protected TipoCombustible tipoCombustible;
    protected double cantidadCombustible;

    public Vehiculo(String modelo, int numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        tipoCombustible = TipoCombustible.DIESEL;
        cantidadCombustible = 0;
    }

    public Vehiculo(String modelo, int numeroSerie, TipoCombustible tipoCombustible) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.tipoCombustible = tipoCombustible;
        this.cantidadCombustible = 0;
    }

    public abstract void mantemento();

    public Enum<TipoCombustible> cargarCombustible(){
        return tipoCombustible;
    }

}
