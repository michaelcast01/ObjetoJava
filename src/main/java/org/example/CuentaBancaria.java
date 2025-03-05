package org.example;
public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }



    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, String numeroCuenta) {
            this.titular = titular;
            this.saldo = saldo;
            this.numeroCuenta = numeroCuenta;
        }


        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depositados " + cantidad + " en la cuenta " + numeroCuenta);
            } else {
                System.out.println("Cantidad no válida para depósito.");
            }
        }


        public void retirar(double cantidad) {
            if (cantidad > 0 && saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Retirados " + cantidad + " de la cuenta " + numeroCuenta);
            } else {
                System.out.println("Fondos insuficientes o cantidad no válida para retiro en la cuenta " + numeroCuenta);
            }
        }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}