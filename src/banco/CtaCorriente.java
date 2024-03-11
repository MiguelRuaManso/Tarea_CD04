package banco;

/**
 * Esta clase representa una cuenta corriente bancaria. Permite realizar
 * operaciones como depósitos, retiros y consultar el saldo.
 *
 * @author Miguel Rua
 */
public class CtaCorriente {

    private String nombre; // Nombre del titular de la cuenta
    private String cuenta; // Número de cuenta
    private double saldoCuenta; // Saldo actual de la cuenta
    private double interes; // Tasa de interés de la cuenta

    /**
     * Constructor de la clase CtaCorriente.
     *
     * @param nombre El nombre del titular de la cuenta.
     * @param cuenta El número de cuenta.
     * @param saldo El saldo inicial de la cuenta.
     * @param interes La tasa de interés de la cuenta.
     */
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldoCuenta = saldo;
        this.interes = interes;
    }

    // Métodos getter y setter
    /**
     * Método para realizar un depósito en la cuenta.
     *
     * @param cantidad La cantidad a depositar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void depositar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldoCuenta = saldoCuenta + cantidad;
    }

    /**
     * Método para realizar un retiro de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (obtenerSaldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldoCuenta = saldoCuenta - cantidad;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double obtenerSaldo() {
        return saldoCuenta;
    }

    public void ingresar(double importe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getSaldoCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
