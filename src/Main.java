public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("FlyEmirates", 23, 1000);
        Avion a2 = new Avion("Iberia", 54, TipoCombustible.DIESEL, 3040);
        AvionComercial aC1 = new AvionComercial("Airbus", 4546, TipoCombustible.JET_A1, 10023, 100);
        System.out.println(a1);
        System.out.println(a1.maximaDistanciaPercorrer());
        aC1.asignarTripulacion("Piloto", "Manuel Fernandez");


    }
}