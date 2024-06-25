public class CuentaJoven extends Cuenta{

    private double bonificacion;

    public CuentaJoven(Persona titular, int numCuenta) {
        super(titular, numCuenta);
    }

    public CuentaJoven(Persona titular, double cantidad, int numCuenta, double bonificacion) {
        super(titular, cantidad, numCuenta);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public boolean esTitularValido() {
        int edad = getTitular().getEdad();
        return edad >= 18 && edad < 25;
    }


    public void retirarJoven(double cantidad) {
        if (esTitularValido()) {
            super.retirar(cantidad);
            System.out.println("Se han retirado " + cantidad + "€" + " correctamente");
        } else {
            System.out.println("El titular de la cuenta no es válido");
            System.out.println("No se ha podido efectuar la retirada de dinero");
        }
    }

    public double aplicarBonificacion() {
        double cantidadConBonificacion = getCantidad() * (bonificacion / 100);
        double cantidadTotal = getCantidad() + cantidadConBonificacion;
        return cantidadTotal;
    }


    @Override
    public String mostrar() {
        return "CuentaJoven { " + "Titular: " + getTitular() + ", Cantidad: " + getCantidad() + "€" + ", Bonificación: " + bonificacion + "%, Cantidad con Bonificación: " +  aplicarBonificacion() + "€" + " }";
    }
}


