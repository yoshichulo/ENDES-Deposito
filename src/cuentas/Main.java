package cuentas;


public class Main {
    
    public static void main(String[] args){
        operativa_cuenta(0);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio García", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        try {
            miCuenta.retirar(2300);
        } catch(Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
        
}
