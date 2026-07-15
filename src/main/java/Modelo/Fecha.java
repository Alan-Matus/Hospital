package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Fecha {
    
    // Calcula el String detallado para la interfaz
    public static String calcularEdadExacta(Date fechaNacimiento) {
        if (fechaNacimiento == null) return "";
        LocalDate nacimiento = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate actual = LocalDate.now();
        Period periodo = Period.between(nacimiento, actual);
        return periodo.getYears() + " años, " + periodo.getMonths() + " meses, " + periodo.getDays() + " días";
    }
    
    // Obtiene únicamente los años numéricos para las condicionales
    public static int obtenerAniosNumericos(Date fechaNacimiento) {
        if (fechaNacimiento == null) return 0;
        LocalDate nacimiento = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate actual = LocalDate.now();
        return Period.between(nacimiento, actual).getYears();
    }

    // Determina la categoría del paciente según las reglas de tu negocio
    public static String determinarTipoPaciente(int anios) {
        if (anios <= 18) {
            return "PEDIATRICO";
        } else if (anios <= 60) {
            return "ADULTO";
        } else {
            return "GERIATRICO";
        }
    }
}