package cuentas;


public class CCuenta {

    /**
     * @return the nombre
     * Visto. El enlace al repositorio debía ir en el trabajo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public double estado(){
        return getSaldo();
    }
    
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0){
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad){
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() + cantidad);
    }
}
