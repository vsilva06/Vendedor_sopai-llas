public class Caja {

    private int monto;

    public Caja(int monto) {
        this.monto = monto;
    }

    public void vender(int ganancia){
        this.monto+=ganancia;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
