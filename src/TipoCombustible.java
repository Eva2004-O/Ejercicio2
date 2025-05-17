public enum TipoCombustible {
    JET_A1(0.6),
    AVGAS(0.7),
    GASOLINA(0.8),
    DIESEL(0.9);

    private double prezo;

    TipoCombustible(double prezo) {
        this.prezo = prezo;
    }

    public double getPrezo() {
        return prezo;
    }
}
