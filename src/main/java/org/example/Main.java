package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        CuentaBancaria[] lsCuentas = new CuentaBancaria[3];

        lsCuentas[0] = new CuentaBancaria("Juan Tarazona", 1000.0, "111");
        lsCuentas[1] = new CuentaBancaria("Santiago Noguera", 2000000.0, "222");
        lsCuentas[2] = new CuentaBancaria("Duban Parra", 1500000000000.0, "333");

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 4) {
                System.out.println("Salir");

            }
            System.out.print("Ingrese el número de cuenta: ");
            String numeroCuenta = entrada.next();

            CuentaBancaria cuenta = buscarCuenta(lsCuentas, numeroCuenta);
            if (cuenta == null) {
                System.out.println("Número de cuenta no encontrado.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = entrada.nextDouble();
                    cuenta.depositar(deposito);
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = entrada.nextDouble();
                    cuenta.retirar(retiro);
                case 3:
                    System.out.println(cuenta);
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        entrada.close();
    }

    // Método auxiliar para buscar una cuenta por su número
    public static CuentaBancaria buscarCuenta(CuentaBancaria[] cuentas, String numeroCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }
}
