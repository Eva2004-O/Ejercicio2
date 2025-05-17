import java.util.HashMap;

public class AvionComercial extends Avion {
    private int nunPasajeros;
    private HashMap<String, String> tripulacion;

    public AvionComercial(String modelo, int numeroSerie, TipoCombustible tipoCombustible, double consumo, int nunPasajeros) {
        super(modelo, numeroSerie, tipoCombustible, consumo);
        this.nunPasajeros = nunPasajeros;
        tripulacion = new HashMap<>();
    }

    public AvionComercial(String modelo, int numeroSerie, double consumo, int nunPasajeros) {
        super(modelo, numeroSerie, consumo);
        this.nunPasajeros = nunPasajeros;
        tripulacion = new HashMap<>();
    }
    public void asignarTripulacion(String cargo, String nome){
        tripulacion.put(cargo, nome);
    }

}
