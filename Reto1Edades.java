package com.taller.practico;

// Sección 2 - Reto 1: Clasificación de edades
public class Reto1Edades {
    public static void main(String[] args) {
        int[] edades = {10, 15, 28, 68};
        for (int edadUsuario : edades) {
            String categoria, perfil;
            if (edadUsuario < 12) {
                categoria = "Infante";
                perfil = "Requiere tutor de cuenta";
            } else if (edadUsuario <= 17) {
                categoria = "Adolescente";
                perfil = "Acceso restringido a foros comunitarios";
            } else if (edadUsuario <= 64) {
                categoria = "Adulto";
                perfil = "Acceso a funcionalidades estándar";
            } else {
                categoria = "Adulto Mayor";
                perfil = "Acceso con interfaz adaptada";
            }
            System.out.println("Edad " + edadUsuario + " -> " + categoria + " | " + perfil);
        }
    }
}
