package com.taller.practico;

public class ErrorPrecision {
    public static void main(String[] args) {
        int tareasCompletadas = 3;
        int tareasTotales = 4;
        // ERROR ORIGINAL: (3 / 4) es división entera = 0, y 0 * 100 = 0.0.
        // CORRECCIÓN: convertir a double ANTES de dividir.
        double porcentajeAvance = ((double) tareasCompletadas / tareasTotales) * 100;
        System.out.println("El porcentaje de avance es: " + porcentajeAvance + "%");
    }
}
