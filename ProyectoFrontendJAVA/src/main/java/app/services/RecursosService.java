package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class RecursosService {

    private static RecursosService servicio;

    private Color colorPrincipal, colorGrisOscuro, colorNegroTransparente, colorSecundario, colorGrisClaro, colorPrincipalOscuro;
    private Font fontPrincipal, fontTitulo, fontSubtitulo, fontLigera;
    private Cursor cMano, cTexto;
    private Border bInferiorAzul, borderGris, bInferiorGris;
    private ImageIcon iFondo, iLogo, iCerrar, iSvg1, iUsuario2, iClave2, iPunto1, iFacebook1, iTwitter1, iYoutube1, iDimAux, iMinimizar;

    private RecursosService() {
        generarFuentes();
        crearObjetosDecoradores();
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorGrisOscuro() {
        return colorGrisOscuro;
    }

    public Color getColorGrisClaro() {
        return colorGrisClaro;
    }

    public Color getColorNegroTransparente() {
        return colorNegroTransparente;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Font getFontPrincipal() {
        return fontPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public Cursor getcTexto() {
        return cTexto;
    }

    public Border getbInferiorAzul() {
        return bInferiorAzul;
    }

    public Border getBorderGris() {
        return borderGris;
    }

    public ImageIcon getiFondo() {
        return iFondo;
    }

    public ImageIcon getiLogo() {
        return iLogo;
    }

    public ImageIcon getiCerrar() {
        return iCerrar;
    }

    public ImageIcon getiSvg1() {
        return iSvg1;
    }

    public ImageIcon getiUsuario2() {
        return iUsuario2;
    }

    public ImageIcon getiClave2() {
        return iClave2;
    }

    public ImageIcon getiPunto1() {
        return iPunto1;
    }

    public ImageIcon getiFacebook1() {
        return iFacebook1;
    }

    public ImageIcon getiTwitter1() {
        return iTwitter1;
    }

    public ImageIcon getiYoutube1() {
        return iYoutube1;
    }

    public ImageIcon getiDimAux() {
        return iDimAux;
    }

    public Font getFontLigera() {
        return fontLigera;
    }

    public ImageIcon getiMinimizar() {
        return iMinimizar;
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }

    public Color getColorPrincipalOscuro() {
        return colorPrincipalOscuro;
    }

    public Border getBInferiorGris() {
        return bInferiorGris;
    }

    private void generarFuentes() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resources\\fonts\\Forte.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resources\\fonts\\LUZRO.TTF")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resources\\fonts\\Rockwell-ExtraBold.otf")));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private void crearObjetosDecoradores() {
        colorPrincipalOscuro = new Color(30, 48, 90);
        colorPrincipal = new Color(60, 78, 120);
        colorGrisOscuro = new Color(80, 80, 80);
        colorGrisClaro = new Color(249, 246, 249);
        colorNegroTransparente = new Color(30, 30, 30, 30);
        colorSecundario = new Color(151, 0, 158);

        cMano = new Cursor(Cursor.HAND_CURSOR);
        cTexto = new Cursor(Cursor.TEXT_CURSOR);

        bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
        borderGris = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true);
        bInferiorGris = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY);

        fontPrincipal = new Font("Rockwell Extra", Font.PLAIN, 20);
        fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 17);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
        fontLigera = new Font("LuzSans-Book", Font.PLAIN, 12);

        iFondo = new ImageIcon("resources\\images\\fondo.png");
        iLogo = new ImageIcon("resources\\images\\logo.png");
        iUsuario2 = new ImageIcon("resources\\images\\usuario2.png");
        iClave2 = new ImageIcon("resources\\images\\clave2.png");
        iPunto1 = new ImageIcon("resources\\images\\punto1.png");
        iFacebook1 = new ImageIcon("resources\\images\\facebook1.png");
        iTwitter1 = new ImageIcon("resources\\images\\twitter1.png");
        iYoutube1 = new ImageIcon("resources\\images\\youtube1.png");
        iSvg1 = new ImageIcon("resources\\images\\imagen1.png");
        iCerrar = new ImageIcon("resources\\images\\cerrar.png");
        iMinimizar = new ImageIcon("resources\\images\\minimizar.png");
    }

}
