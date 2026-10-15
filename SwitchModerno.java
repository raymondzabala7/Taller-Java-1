package com.taller.practico;

// Sección 3 - Versión 2: switch moderno con flecha (->)
public class SwitchModerno {
    public static void main(String[] args) {
        int dia = 1; // 1 = Lunes ... 7 = Domingo
        final String jornada = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Jornada laboral completa";
            case 6 -> "Media jornada";
            case 7 -> "Descanso";
            default -> "Día inválido";
        };
        System.out.println("Día " + dia + " -> " + jornada);
    }
}
