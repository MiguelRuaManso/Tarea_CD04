package tareacd4;

import banco.CtaCorriente;
import java.util.Scanner;

/**
 * Clase principal que contiene el punto de entrada del programa.
 */
public class Main {

    /**
     * Punto de entrada principal del programa. Permite interactuar con una
     * cuenta corriente realizando operaciones de ingreso y retiro de fondos, y
     * muestra el saldo actual de la cuenta.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en
     * este programa)
     */
    public static void main(String[] args) {
        CtaCorriente miCuenta;
        double saldoActual;

        // Crear una nueva instancia de CtaCorriente
        miCuenta = new CtaCorriente("Koldo García Ábalos", "0001-2345-07-1234567890", 5000, 0);
        saldoActual = miCuenta.getSaldoCuenta();
        System.out.println("El saldo inicial es de " + saldoActual + " euros");

        // Realizar un intento de retirar fondos de la cuenta
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            System.out.println("El saldo actual de su cuenta es " + miCuenta.getSaldoCuenta() + " euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        // Realizar un intento de ingresar fondos en la cuenta
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);
            System.out.println("El saldo actual de su cuenta es " + miCuenta.getSaldoCuenta() + " euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
