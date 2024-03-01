package banco;

public class CtaCorriente {
    private String nombre;
    private String cuenta;
    private double saldoCuenta;
    private double interes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public CtaCorriente() {
    }

    public CtaCorriente(String nombre, String cuenta, double saldo, double interes) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldoCuenta = saldo;
        this.interes = interes;
    }

    public double obtenerSaldo() {
        return saldoCuenta;
    }

    public void depositar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldoCuenta = saldoCuenta + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (obtenerSaldo() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldoCuenta = saldoCuenta - cantidad;
    }
}