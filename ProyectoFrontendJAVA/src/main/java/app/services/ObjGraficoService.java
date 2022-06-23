package app.services;

import client.login.TextPrompt;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

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

    public JLabel crearJLabel(ImageIcon imagen, int x, int y, int ancho, int alto, Cursor cursor) {
        JLabel label = new JLabel();
        label.setBounds(x, y, ancho, alto);
        ImageIcon iDimAux = new ImageIcon(
                imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING)
        );
        label.setIcon(iDimAux);
        label.setCursor(cursor);
        return label;
    }

    public JButton crearJButton(ImageIcon imagen, int x, int y, int ancho, int alto, Cursor cursor) {
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        boton.setCursor(cursor);

        ImageIcon iDimAux = new ImageIcon(
                imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING)
        );

        boton.setIcon(iDimAux);
        boton.setContentAreaFilled(false);
        boton.setBorder(null);
        boton.setFocusable(false);
        return boton;
    }

    public JButton crearJButton(String texto, int x, int y, int ancho, int alto, Color fondo, Color cLetra, Cursor cursor) {
        JButton boton = new JButton(texto);
        boton.setSize(ancho, alto);
        boton.setLocation(x, y);
        boton.setBackground(fondo);
        boton.setForeground(cLetra);
        boton.setFocusable(false);
        boton.setCursor(cursor);
        return boton;
    }

    public JTextField crearJTextField(String placeholder, int x, int y, int ancho, int largo, Color cLetra, Color fondo, Color carreta, Cursor cursor, Border borde) {
        JTextField campo = new JTextField();
        TextPrompt placeholderNombre = new TextPrompt(placeholder, campo, TextPrompt.Show.FOCUS_LOST);
        placeholderNombre.setHorizontalAlignment(SwingConstants.CENTER);
        campo.setSize(ancho, largo);
        campo.setLocation(x, y);
        campo.setForeground(cLetra);
        campo.setBackground(fondo);
        campo.setCaretColor(carreta);
        campo.setHorizontalAlignment(SwingConstants.CENTER);
        campo.setCursor(cursor);
        campo.setBorder(borde);
        return campo;
    }

    public JPasswordField crearJPasswordField(String placeholder, int x, int y , int ancho , int alto, Color fondo, Color carreta, Cursor cursor, Border borde) {
        JPasswordField pass = new JPasswordField();
        TextPrompt placeholderPass = new TextPrompt(placeholder, pass, TextPrompt.Show.FOCUS_LOST);
        placeholderPass.setHorizontalAlignment(SwingConstants.CENTER);

        pass.setSize(ancho, alto);
        pass.setLocation(x, y);
        pass.setForeground(fondo);
        pass.setCaretColor(carreta);
        pass.setHorizontalAlignment(SwingConstants.CENTER);
        pass.setCursor(cursor);
        pass.setBorder(borde);
       return pass;
    }
}
