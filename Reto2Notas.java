package com.taller.practico;

// Sección 2 - Reto 2: Aprobación de notas y asistencia
public class Reto2Notas {
    public static void main(String[] args) {
        double calificacionFinal = 65.0;
        int porcentajeAsistencia = 75;
        boolean entregoProyectoFinal = true;

        String estado;
        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
            estado = "Aprobado";
        } else if (entregoProyectoFinal && calificacionFinal >= 60.0) {
            estado = "Pendiente de Examen Extraordinario";
        } else {
            estado = "Reprobado";
        }
        System.out.println("Nota: " + calificacionFinal + ", asistencia: " + porcentajeAsistencia
                + "% -> Dictamen: " + estado);
    }
}
