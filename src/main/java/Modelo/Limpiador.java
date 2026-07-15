package Modelo;

import javax.swing.text.JTextComponent;

public class Limpiador {
    
    public static void limpiarTextos(JTextComponent... campos) {
        for (JTextComponent campo : campos) {
            campo.setText("");
        }
    }
}