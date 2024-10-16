package Utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Verificar {

    public static boolean fechavalida(String date) {
        // Crear el formato de la fecha dd/mm/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Para que no acepte fechas inválidas

        try {
            dateFormat.parse(date);
            return true; // Si el parse es exitoso, es una fecha válida
        } catch (ParseException e) {
            return false; // Si ocurre una excepción, no es una fecha válida
        }
    }
}