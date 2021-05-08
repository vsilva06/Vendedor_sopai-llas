

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

    public boolean listo() {
       // System.out.println("Listas para vender");
        this.estado = true;
        return true;
    }

    public boolean cocinando() {
       // System.out.println("!Cocinando¡");
        this.estado = false;
        return false;
    }

    public boolean crudo() {
       // System.out.println("Sopaipilla cruda");
        this.estado = false;
        return false;
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
