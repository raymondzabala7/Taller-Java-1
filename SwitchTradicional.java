package com.taller.practico;

// Sección 3 - Versión 1: switch tradicional (case + break + default)
public class SwitchTradicional {
    public static void main(String[] args) {
        int dia = 1; // 1 = Lunes ... 7 = Domingo
        String jornada;
        switch (dia) {
            case 1: case 2: case 3: case 4: case 5:
                jornada = "Jornada laboral completa";
                break;
            case 6:
                jornada = "Media jornada";
                break;
            case 7:
                jornada = "Descanso";
                break;
            default:
                jornada = "Día inválido";
        }
        System.out.println("Día " + dia + " -> " + jornada);
    }
}
