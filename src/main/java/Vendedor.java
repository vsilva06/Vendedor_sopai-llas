import java.util.ArrayList;

public class Vendedor {
    private String nombre;
    private ArrayList<Sopaipilla> sopaipillas = new ArrayList<>();
    private Caja caja;
    private int canSopaipillas;

    public Vendedor(String nombre, int canSopaipillas) {
        this.nombre = nombre;
        this.canSopaipillas = canSopaipillas;
        crearSopaipillas(canSopaipillas);
    }

    private void crearSopaipillas(int canSopaipillas) {
        for (int i = 0; i < canSopaipillas; i++) {

            sopaipillas.add(new Sopaipilla());
        }
    }

    public void cocinarSopaipilla(int cantidad){
        if(validarCantidad(cantidad)){
            for (int i = 0; i < cantidad; i++) {
                sopaipillas.get(i).cocinando();
            }

        }
    }
    public void sacarSopaipillas(int cantidad){
        if(validarCantidad(cantidad)){
            for (int i = 0; i < cantidad; i++) {
                sopaipillas.get(i).listo();
            }
        }
    }

    private boolean validarCantidad(int cantidad) {
        if(cantidad>sopaipillas.size()|| cantidad<sopaipillas.size()){
            return false;
        }else{
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sopaipilla> getSopaipillas() {
        return sopaipillas;
    }

    public void setSopaipillas(ArrayList<Sopaipilla> sopaipillas) {
        this.sopaipillas = sopaipillas;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public int getCanSopaipillas() {
        return canSopaipillas;
    }

    public void setCanSopaipillas(int canSopaipillas) {
        this.canSopaipillas = canSopaipillas;
    }
}
