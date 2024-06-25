public class cuentaExpansion extends Cuenta{

    private double minimoIngresoMensual;

    public cuentaExpansion(Persona titular, int numCuenta, double minimoIngresoMensual) {
        super(titular, numCuenta);
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    public cuentaExpansion(Persona titular, double cantidad,  int numCuenta, double minimoIngresoMensual) {
        super(titular, cantidad, numCuenta);
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    public double getMinimoIngresoMensual() {
        return minimoIngresoMensual;
    }

    public void setMinimoIngresoMensual(double minimoIngresoMensual) {
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    public void transferencia(int numCuenta, double cantidad) {
        retirar(cantidad);
        System.out.println("Se ingresó en el número de cuenta " + numCuenta + " la cantidad " + cantidad + "€");
    }

    public boolean esMinimoIngresoMensualValido(double ingresosMensuales) {
        return this.minimoIngresoMensual <=  ingresosMensuales;
    }

    public void ingresosMensuales(double ingresosMensuales) {
        if (esMinimoIngresoMensualValido(ingresosMensuales)) {
            System.out.println("Cumple con el ingreso minimo menusal ");
        } else {
            System.out.println("No cumple con el ingreso minimo mensual");
        }
    }

    @Override
    public String mostrar() {
        return "CuentaExpansión { " + "Titular: " + getTitular() + ", Cantidad: " + getCantidad() + "€" + ", Minimo ingreso mensual: " + minimoIngresoMensual  + "€" + " }";
    }

}
