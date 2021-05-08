

import java.util.Random;


public class Sopaipilla {
    private String tipo;
    private int precio;
    private boolean estado;
    static final Random random = new Random();


    public Sopaipilla(String tipo, int precio, boolean estado) {
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public Sopaipilla() {
        tamaño();
        crudo();

    }

    public void tamaño() {
        int rn = random.nextInt(1000);

        if (rn > 500) {
            this.precio = 500;
            this.tipo = "Grande";
        } else {
            this.precio = 250;
            this.tipo = "Chica";
        }
    }

    public void listo() {
        System.out.println("Listas para vender");
        this.estado = true;
    }

    public void cocinando() {
        System.out.println("!Cocinando¡");
        this.estado = false;
    }

    public void crudo() {
        System.out.println("Sopaipilla cruda");
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sopaipilla{" +
               "tipo='" + tipo + '\'' +
               ", precio=" + precio +
               ", estado=" + estado +
               '}';
    }
}
