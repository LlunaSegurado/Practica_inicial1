public class Main {
    public static void main (String args[]) {

        //Cuenta Normal
        Persona persona1 = new Persona("lluna", 19);
        Cuenta cuenta1 = new Cuenta(persona1, 200,2327648);
        cuenta1.retirar(20);
        System.out.println(cuenta1.mostrar());

        System.out.println(" ");

        Persona persona2 = new Persona("alex", 20);
        Cuenta cuenta2 = new Cuenta(persona2, 400, 1111111111);
        cuenta2.ingresar(200);
        cuenta2.retirar(100);
        System.out.println(cuenta2.mostrar());

        System.out.println(" ");

        //CuentaJoven
        Persona persona3 = new Persona("eva", 13);
        CuentaJoven cuentaJoven1 = new CuentaJoven(persona3, 1000, 222222, 20);
        cuentaJoven1.retirarJoven(200);
        System.out.println(cuentaJoven1.mostrar());

        System.out.println(" ");

        //CuentaPersonal
        Persona persona4 = new Persona("andres", 20);
        cuentaPersonal cuentaPersonal1 = new cuentaPersonal(persona4, 200, 243500);
        cuentaPersonal1.transferenciaComision(3, 50);
        cuentaPersonal1.ingresar(200);
        System.out.println(cuentaPersonal1.mostrar());

        System.out.println(" ");

        //CuentaExpansion
        Persona persona5 = new Persona("luisa", 20);
        cuentaExpansion cuentaExpansion1 = new cuentaExpansion(persona5, 2000, 23423423, 100);
        cuentaExpansion1.transferencia(534578,20);
        cuentaExpansion1.ingresosMensuales(200);
        System.out.println(cuentaExpansion1.mostrar());

    }
}
