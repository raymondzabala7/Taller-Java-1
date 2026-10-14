package com.taller.practico;

public class ErrorAsignacion {
    public static void main(String[] args) {
        boolean cookieActiva = false;
        // ERROR ORIGINAL: if (cookieActiva = true) asigna true en vez de comparar.
        // CORRECCIÓN: usar == (o directamente la variable booleana).
        if (cookieActiva == true) { // equivalente y mejor: if (cookieActiva)
            System.out.println("Estado de sesión: Sesión del usuario activa.");
        } else {
            System.out.println("Estado de sesión: Sesión inactiva.");
        }
    }
}
