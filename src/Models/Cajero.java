package Models;

public class Cajero extends Empleado{
    private int noCaja;
    private double totalVendido;
    private double dineroInicial;

    public Cajero(int noCaja, double totalVendido, double dineroInicial) {
        this.noCaja = noCaja;
        this.totalVendido = totalVendido;
        this.dineroInicial = dineroInicial;
    }

    public int getNoCaja() {
        return noCaja;
    }

    public void setNoCaja(int noCaja) {
        this.noCaja = noCaja;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }
}
