public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("FlyEmirates", 23, 1000);
        Avion a2 = new Avion("Iberia", 54, TipoCombustible.DIESEL, 3040);
        AvionComercial aCo1 = new AvionComercial("Airbus", 4546, TipoCombustible.JET_A1, 10023, 100);
        System.out.println(a1);
        System.out.println(a1.maximaDistanciaPercorrer());
        aCo1.asignarTripulacion("Piloto", "Manuel Fernandez");
        AvionCarga aCa1 = new AvionCarga("Iberia", 64, TipoCombustible.AVGAS, 2456, 1000, 300, "Pedro Gonzalez");
        System.out.println(aCa1.descargar());
        System.out.println(aCa1.cargar());
        Camion cam1 = new Camion(100, 40, "Álvaro Pérez");
        System.out.println(cam1.cargar());
        System.out.println(cam1.descargar());
    }
}