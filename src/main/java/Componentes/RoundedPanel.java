package Componentes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * Contenedor propio tipo JPanel con esquinas redondeadas.
 * Se comporta como un JPanel normal: se puede usar dentro del
 * editor visual de NetBeans (GUI Builder) y con AbsoluteLayout,
 * solo que dibuja un fondo con bordes curvos en vez de un
 * rectángulo cuadrado.
 *
 * No reemplaza ni modifica ningún JPanel existente del proyecto;
 * es un componente adicional que se puede arrastrar donde se
 * necesite.
 */
public class RoundedPanel extends JPanel {

    // Radio de las esquinas (qué tan redondeadas se ven)
    private int radio = 20;

    // Color del borde (opcional, puede ser igual al de fondo)
    private Color colorBorde = new Color(200, 200, 200);

    // Grosor del borde
    private int grosorBorde = 1;

    public RoundedPanel() {
        // El panel necesita ser "no opaco" para poder dibujar
        // nosotros el fondo con esquinas curvas en vez del
        // rectángulo por defecto de Swing.
        super();
        setOpaque(false);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
        repaint();
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
        repaint();
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Suaviza los bordes curvos (sin esto se ven "dentados")
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int ancho = getWidth();
        int alto = getHeight();

        // Dibuja el fondo redondeado con el color de fondo
        // configurado (getBackground() respeta lo que se le
        // ponga desde el editor de propiedades de NetBeans).
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, ancho - 1, alto - 1, radio, radio);

        // Dibuja el borde redondeado
        if (grosorBorde > 0) {
            g2.setColor(colorBorde);
            g2.setStroke(new java.awt.BasicStroke(grosorBorde));
            g2.drawRoundRect(0, 0, ancho - 1, alto - 1, radio, radio);
        }

        g2.dispose();

        // Deja que Swing siga pintando los componentes hijos
        // (botones, labels, etc.) normalmente.
        super.paintComponent(g);
    }
}