public class Avion extends Vehiculo implements Voador{
    protected double consumo;

    public Avion(String modelo, int numeroSerie, TipoCombustible tipoCombustible, double consumo) {
        super(modelo, numeroSerie, tipoCombustible);
        this.consumo = consumo;
    }

    public Avion(String modelo, int numeroSerie, double consumo) {
        super(modelo, numeroSerie);
        this.consumo = consumo;
    }

    @Override
    public void mantemento() {
        System.out.println("Llamando al mecánico");
    }

    @Override
    public void aterrar() {
        System.out.println("Hemos llegado al destino");
    }

    @Override
    public void despegar() {
        System.out.println("Estamos despegando el avión");
    }
    public double maximaDistanciaPercorrer(){
        return consumo * tipoCombustible.getPrezo();
    }
    
}
