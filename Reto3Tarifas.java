package com.taller.practico;

// Sección 2 - Reto 3: Tarifas de entrada y descuentos
public class Reto3Tarifas {
    public static void main(String[] args) {
        String tipoEntrada = "ESTUDIANTE";
        double precioBase = 100.0;
        double precioFinal;

        if (tipoEntrada.equals("VIP")) {
            precioFinal = precioBase * 1.10;
        } else if (tipoEntrada.equals("ESTUDIANTE")) {
            precioFinal = precioBase * 0.50;
        } else if (tipoEntrada.equals("ADULTO_MAYOR")) {
            precioFinal = precioBase * 0.60;
        } else {
            precioFinal = precioBase; // GENERAL
        }
        System.out.printf("Entrada %s -> Monto a pagar: $%.2f%n", tipoEntrada, precioFinal);
    }
}
