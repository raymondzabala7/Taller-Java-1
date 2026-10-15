package com.taller.practico;

// Sección 4 - Reto integrador (switch moderno). Prueba el Caso A y el Caso B.
public class RetoIntegrador {

    static void liquidar(int cantidad, String tipoCliente, String cupon) {
        double subtotal = cantidad * 250.00;

        double porcentajeDescuento = switch (tipoCliente) {
            case "VIP" -> 0.20;
            case "REGULAR" -> 0.10;
            case "NUEVO" -> 0.05;
            default -> 0.0;
        };
        double subtotalConDescuento = subtotal - (subtotal * porcentajeDescuento);

        double descuentoCupon;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }

        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double total = baseImponible + iva;

        System.out.printf("Subtotal base: $%.2f%n", subtotal);
        System.out.printf("Subtotal con descuento: $%.2f%n", subtotalConDescuento);
        System.out.printf("Descuento cupón: $%.2f%n", descuentoCupon);
        System.out.printf("Base imponible: $%.2f%n", baseImponible);
        System.out.printf("IVA (16%%): $%.2f%n", iva);
        System.out.printf("Total a pagar = $%.2f%n%n", total);
    }

    public static void main(String[] args) {
        System.out.println("--- Caso A ---");
        liquidar(3, "VIP", "PROMO1 año");     // 638.00
        System.out.println("--- Caso B ---");
        liquidar(1, "NUEVO", "PROMO1 año");   // 275.50
    }
}
