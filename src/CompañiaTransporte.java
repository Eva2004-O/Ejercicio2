import java.util.ArrayList;
import java.util.Iterator;

public class CompañiaTransporte {
    private String nome;
    private ArrayList<Vehiculo> vehiculos;

    public CompañiaTransporte(String nome) {
        this.nome = nome;
        vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(int numeroSerie){
        Iterator<Vehiculo> iterator = vehiculos.iterator();
        while (iterator.hasNext()){
            Vehiculo vehiculo = iterator.next();
            if (vehiculo.numeroSerie == numeroSerie){
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "CompañiaTransporte{" +
                "nome='" + nome + '\'' +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
