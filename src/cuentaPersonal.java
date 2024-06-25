public class cuentaPersonal extends Cuenta{

    public cuentaPersonal(Persona titular, int numCuenta) {
        super(titular, numCuenta);
    }

    public cuentaPersonal(Persona titular, double cantidad, int numCuenta) {
        super(titular, cantidad, numCuenta);
    }

    public void transferenciaComision(int numCuenta, double cantidad) {
        retirar(cantidad + 3);
        System.out.println("Se ingresó en el número de cuenta " + numCuenta + " la cantidad " + cantidad + "€");
        System.out.println("Comisión de 3€ por transferencia");
    }

    @Override
    public String mostrar() {
        return "CuentaPersonal { " + "Titular: " + getTitular() + ", Cantidad: " + getCantidad() + "€" + " }";
    }

}


