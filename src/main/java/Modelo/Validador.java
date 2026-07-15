package Modelo;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Validador {

    public static void aplicarSoloLetras(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    evt.consume();
                }
            }
        });
    }

    public static void aplicarSoloNumerosDecimales(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    evt.consume();
                }
                if (c == '.' && textField.getText().contains(".")) {
                    evt.consume();
                }
            }
        });
    }

    public static void aplicarSoloNumerosEnteros(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();
                }
            }
        });
    }

    public static void limitarLongitud(JTextField textField, int maximo) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (textField.getText().length() >= maximo) {
                    evt.consume();
                }
            }
        });
    }
}