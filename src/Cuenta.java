public class Cuenta {

    private Persona titular;
    private double cantidad;
    private int numCuenta;

    public Cuenta(Persona titular, double cantidad, int numCuenta) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(Persona titular, int numCuenta) {
        this.titular = titular;
        this.cantidad = 0;
        this.numCuenta = numCuenta;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
        System.out.println("Se han ingresado " + cantidad + "€" + " correctamente");
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
        System.out.println("Se han retirado " + cantidad + "€" + " correctamente");
    }

    public String mostrar() {
        return "Cuenta { Titular: " + titular + ", Cantidad: " + cantidad + "€" + " }";
    }


}
