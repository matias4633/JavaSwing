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

    private Color colorPrincipal, colorGrisOscuro, colorNegroTransparente,colorSecundario;
    private Font fontPrincipal, fontTitulo, fontSubtitulo,fontLigera;
    private Cursor cMano, cTexto;
    private Border bInferiorAzul;
    private ImageIcon iFondo, iLogo, iCerrar, iSvg1, iUsuario2, iClave2, iPunto1, iFacebook1, iTwitter1, iYoutube1, iDimAux,iMinimizar;

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

    public Color getColorNegroTransparente() {
        return colorNegroTransparente;
    }
    
    public Color getColorSecundario(){
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

    private void generarFuentes() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\fonts\\Forte.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\fonts\\LUZRO.TTF")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\fonts\\Rockwell-ExtraBold.otf")));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private void crearObjetosDecoradores() {
        colorPrincipal = new Color(60, 78, 120);
        colorGrisOscuro = new Color(80, 80, 80);
        colorNegroTransparente = new Color(30, 30, 30, 30);
        colorSecundario = new Color(151,0,158);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        cTexto = new Cursor(Cursor.TEXT_CURSOR);
        bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);

        fontPrincipal = new Font("Rockwell Extra", Font.PLAIN, 20);
        fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 17);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
        fontLigera = new Font("LuzSans-Book", Font.PLAIN, 12);

        iFondo = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\fondo.png");
        iLogo = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\logo.png");
        iUsuario2 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\usuario2.png");
        iClave2 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\clave2.png");
        iPunto1 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\punto1.png");
        iFacebook1 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\facebook1.png");
        iTwitter1 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\twitter1.png");
        iYoutube1 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\youtube1.png");
        iSvg1 = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\imagen1.png");
        iCerrar = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\cerrar.png");
        iMinimizar = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\minimizar.png");
    }

}
