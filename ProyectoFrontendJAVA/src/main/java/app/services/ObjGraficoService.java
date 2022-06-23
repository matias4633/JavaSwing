package app.services;

import java.awt.*;
import javax.swing.*;

public class ObjGraficoService {

    private static ObjGraficoService servicio;

    private ObjGraficoService() {

    }

    public static ObjGraficoService getService() {
        if (servicio == null) {
            servicio = new ObjGraficoService();
        }
        return servicio;
    }

    public JPanel crearJPanel(int ancho, int largo, int x, int y, Color color) {
        JPanel panel = new JPanel();
        panel.setSize(ancho, largo);
        panel.setLocation(x, y);
        panel.setBackground(color);
        panel.setLayout(null);
        return panel;
    }

    public JLabel crearJLabel(String texto, Font fuente, int x, int y, int ancho, int alto, Color color) {
        JLabel label = new JLabel();
        label.setText(texto);
        label.setFont(fuente);
        label.setBounds(x, y, ancho, alto);
        label.setForeground(color);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }

    public JLabel crearJLabel(ImageIcon imagen, int x , int y , int ancho, int alto, Cursor cursor ) {
        JLabel label = new JLabel();
        label.setBounds(x, y, ancho, alto);
        ImageIcon iDimAux = new ImageIcon(
                imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING)
        );
        label.setIcon(iDimAux);
        label.setCursor(cursor);
        return label;
    }
}
