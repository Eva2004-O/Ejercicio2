public class Camion implements TransportadorMercancias{
    private int capacidadeCarga;
    private int cargaActual;
    private static final int UNIDADCARGA = 30;
    private int conductor;

    public Camion(int capacidadeCarga, int cargaActual, int conductor) {
        this.capacidadeCarga = capacidadeCarga;
        this.cargaActual = cargaActual;
        this.conductor = conductor;
    }

    public void mantemento(){
        System.out.println("Llevando el camión al taller");
    }

    @Override
    public double cargar() {
        double cargar = UNIDADCARGA + 1;
        return  cargar;
    }

    @Override
    public double descargar() {
        double descargar = UNIDADCARGA - 1;
        return descargar;
    }
}
