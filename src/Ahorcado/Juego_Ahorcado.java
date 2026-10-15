package com.educacion.ahorcado;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Juego_Ahorcado {

    static final int MAX_INTENTOS = 6;

    static final String[] PALABRAS = {"JAVA", "VARIABLE", "BUCLE", "CADENA", "COMPILADOR", "OBJETO"};

    static Scanner sc = new Scanner(System.in);

    static int partidasJugadas = 0;
    static int partidasGanadas = 0;
    static double puntajeTotal = 0.0;

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    jugarPartida();
                    break;
                case 2:
                    mostrarEstadisticas();
                    break;
                case 3:
                    System.out.println("¡Gracias por jugar! Hasta pronto.");
                    break;
                default:
                    break;
            }
        } while (opcion != 3);
    }

    static void mostrarMenu() {
        System.out.println("\n=== AHORCADO DE CONSOLA ===");
        System.out.println("1. Jugar");
        System.out.println("2. Ver Estadísticas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    static int leerOpcion() {
        int opcion = -1;
        boolean valida = false;
        while (!valida) {
            String linea = sc.nextLine().trim();
            try {
                opcion = Integer.parseInt(linea);
                if (opcion >= 1 && opcion <= 3) {
                    valida = true;
                } else {
                    System.out.print("Opción fuera de rango. Ingrese 1, 2 o 3: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada no válida. Ingrese un número (1, 2 o 3): ");
            }
        }
        return opcion;
    }

    static void jugarPartida() {
        String nombreJugador = "";
        while (nombreJugador.length() == 0) {
            System.out.print("Ingrese su nombre: ");
            nombreJugador = sc.nextLine().trim().toUpperCase();
            if (nombreJugador.length() == 0) {
                System.out.println("El nombre no puede estar vacío.");
            }
        }

        int intentosRestantes = MAX_INTENTOS;
        double puntaje = 100.0;
        boolean juegoGanado = false;
        char ultimaLetra = ' ';
        int totalJugadas = 0;
        int aciertos = 0;

        String secreta = PALABRAS[new Random().nextInt(PALABRAS.length)];

        StringBuilder mascara = new StringBuilder();
        for (int i = 0; i < secreta.length(); i++) {
            mascara.append(i == 0 ? "_" : " _");
        }
        StringBuilder historial = new StringBuilder();

        System.out.println("\n¡Bienvenido, " + nombreJugador + "! Escriba una letra (o RENDIRSE para salir).");

        while (intentosRestantes > 0 && !juegoGanado) {
            System.out.println("\nPalabra: " + mascara);
            System.out.println("Letras usadas: " + (historial.length() == 0 ? "-" : historial));
            System.out.println("Intentos restantes: " + intentosRestantes + " / " + MAX_INTENTOS);
            System.out.print("Letra: ");

            String entrada = sc.nextLine().trim().toUpperCase();

            if (entrada.length() == 0) {
                System.out.println("No ingresó nada. Intente de nuevo.");
                continue;
            }
            if (entrada.equals("RENDIRSE")) {
                System.out.println("Se ha rendido.");
                break;
            }

            ultimaLetra = entrada.charAt(0);

            if (!Character.isLetter(ultimaLetra)) {
                System.out.println("Carácter inválido. Use solo letras.");
                continue;
            }
            if (historial.indexOf(String.valueOf(ultimaLetra)) >= 0) {
                System.out.println("Ya probó la letra '" + ultimaLetra + "'.");
                continue;
            }

            historial.append(ultimaLetra).append(' ');
            totalJugadas++;

            boolean acierto = false;
            for (int i = 0; i < secreta.length(); i++) {
                String letraSecreta = secreta.substring(i, i + 1);
                if (letraSecreta.equalsIgnoreCase(String.valueOf(ultimaLetra))) {
                    mascara.setCharAt(i * 2, ultimaLetra);
                    acierto = true;
                }
            }

            if (acierto) {
                aciertos++;
            } else {
                intentosRestantes--;
            }

            System.out.println(acierto ? "¡Bien! La letra '" + ultimaLetra + "' está en la palabra."
                    : "Fallaste: '" + ultimaLetra + "' no está en la palabra.");

            if (mascara.indexOf("_") < 0) {
                juegoGanado = true;
                break;
            }
        }

        double porcentaje = totalJugadas > 0 ? (double) aciertos / totalJugadas * 100 : 0.0;
        puntaje = juegoGanado ? 100.0 + intentosRestantes * 12.5 : 0.0;

        partidasJugadas++;
        if (juegoGanado) {
            partidasGanadas++;
        }
        puntajeTotal += puntaje;

        String estado = juegoGanado ? "¡VICTORIA!" : "DERROTA";
        Locale l = Locale.US;

        System.out.printf("%n====================================================%n");
        System.out.printf("RESUMEN DE LA PARTIDA%n");
        System.out.printf("====================================================%n");
        System.out.printf("Jugador: %s%n", nombreJugador);
        System.out.printf("Estado Final: %s%n", estado);
        System.out.printf("Palabra Secreta: %s%n", secreta);
        System.out.printf("Intentos Restantes: %d / %d%n", intentosRestantes, MAX_INTENTOS);
        System.out.printf(l, "Porcentaje Aciertos: %.2f%%%n", porcentaje);
        System.out.printf(l, "Puntaje Final: %.2f pts%n", puntaje);
        System.out.printf("====================================================%n");
    }

    static void mostrarEstadisticas() {
        System.out.printf("%n--- ESTADÍSTICAS DE LA SESIÓN ---%n");
        System.out.printf("%-22s %d%n", "Partidas jugadas:", partidasJugadas);
        System.out.printf("%-22s %d%n", "Partidas ganadas:", partidasGanadas);
        System.out.printf(Locale.US, "%-22s %.2f pts%n", "Puntaje acumulado:", puntajeTotal);
    }
}