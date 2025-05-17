public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("FlyEmirates", 23, 1000);
        Avion a2 = new Avion("Iberia", 54, TipoCombustible.DIESEL, 3040);
        System.out.println(a1);
        System.out.println(a1.maximaDistanciaPercorrer());

    }
}