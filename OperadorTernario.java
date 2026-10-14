package com.taller.practico;

// Sección 2 - Refactorización a operador ternario
public class OperadorTernario {
    public static void main(String[] args) {
        boolean cookieSesionActiva = true;
        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";
        System.out.println("Estado de conexión: " + estadoConexion);
    }
}
