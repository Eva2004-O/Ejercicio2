public class AvionCarga extends Avion implements TransportadorMercancias{
    private double capacidadeCarga;
    private double cargaActual;
    private String comandante;

    public AvionCarga(String modelo, int numeroSerie, TipoCombustible tipoCombustible, double consumo, double capacidadeCarga, double cargaActual, String comandante) {
        super(modelo, numeroSerie, tipoCombustible, consumo);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaActual = cargaActual;
        this.comandante = comandante;
    }

    public AvionCarga(String modelo, int numeroSerie, double consumo, double capacidadeCarga, double cargaActual, String comandante) {
        super(modelo, numeroSerie, consumo);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaActual = cargaActual;
        this.comandante = comandante;
    }

    @Override
    public double cargar() {
        return capacidadeCarga - cargaActual;
    }

    @Override
    public double descargar() {
        return cargaActual;
    }

    @Override
    public String toString() {
        return "AvionCarga{" +
                "capacidadeCarga=" + capacidadeCarga +
                ", cargaActual=" + cargaActual +
                ", comandante='" + comandante + '\'' +
                ", consumo=" + consumo +
                ", modelo='" + modelo + '\'' +
                ", numeroSerie=" + numeroSerie +
                ", tipoCombustible=" + tipoCombustible +
                ", cantidadCombustible=" + cantidadCombustible +
                '}';
    }
}
