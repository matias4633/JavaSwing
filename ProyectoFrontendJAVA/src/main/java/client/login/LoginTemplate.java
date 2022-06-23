package client.login;

import app.services.ObjGraficoService;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class LoginTemplate extends JFrame {

    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    private Color colorPrincipal, colorGrisOscuro, colorNegroTransparente;
    private Font fontPrincipal, fontTitulo, fontSubtitulo;
    private Cursor cMano, cTexto;
    private Border bInferiorAzul;
    private ImageIcon iFondo, iLogo, iCerrar, iSvg1, iUsuario2, iClave2, iPunto1, iFacebook1, iTwitter1, iYoutube1, iDimAux;
    private JLabel lFondo, lSvg1, lLogo, lUsuario, lClave, lFacebook, lTwitter, lYoutube;

    public LoginTemplate() {
        //super("Login Usuario");
        generarFuentes();
        
        

        crearObjetosDecoradores();
       
        crearJPanels();

        crearJLabels();

        crearJButtons();

        crearJTextField();

        crearJPasswordField();

        crearJComboBox();

        crearJCheckBox();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setUndecorated(true);
        //Borra la barra superior, los botones por defecto y la opcion de agrandar
        //y mover la ventana. Se puede borrar super() ya que eso solo enviaba el nombre a la ventana.
        setLayout(null);
        setVisible(true);

    }

    public void generarFuentes() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\fonts\\Forte.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\fonts\\Rockwell-ExtraBold.otf")));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void crearObjetosDecoradores() {
        colorPrincipal = new Color(60, 78, 120);
        colorGrisOscuro = new Color(80, 80, 80);
        colorNegroTransparente = new Color(30, 30, 30, 30);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        cTexto = new Cursor(Cursor.TEXT_CURSOR);
        bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);

        fontPrincipal = new Font("Rockwell Extra", Font.PLAIN, 20);
        fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 17);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);

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

    }

    public void crearJPanels() {
        ObjGraficoService servicio = ObjGraficoService.getService();
        pIzquierda= servicio.crearJPanel(600,500,0,0,Color.WHITE);
        this.add(pIzquierda);
        pDerecha= servicio.crearJPanel(400, 500, 600, 0, Color.WHITE);
        this.add(pDerecha);
    }

    public void crearJLabels() {
        ObjGraficoService servicio = ObjGraficoService.getService();
        
        lTituloApp= servicio.crearJLabel("Login de Usuario", fontPrincipal, 100, 20, 220, 30, Color.WHITE);
        pIzquierda.add(lTituloApp);
        
        lFacebook = servicio.crearJLabel(iFacebook1, 20, pIzquierda.getHeight()-50, 30, 30, cMano);
        pIzquierda.add(lFacebook);

        lTwitter= servicio.crearJLabel(iTwitter1, 60, pIzquierda.getHeight()-50, 30, 30, cMano);
        pIzquierda.add(lTwitter);
        
        lYoutube = servicio.crearJLabel(iYoutube1, 100, pIzquierda.getHeight()-50, 30, 30, cMano);
        pIzquierda.add(lYoutube);

        lLogo= servicio.crearJLabel(iLogo, 50, 20, 40, 40, cMano);
        pIzquierda.add(lLogo);

        lSvg1= servicio.crearJLabel(iSvg1, 100, 100, 500, 345, cMano);
        pIzquierda.add(lSvg1);

        lFondo = servicio.crearJLabel(iFondo, 0, 0, pIzquierda.getWidth(), pIzquierda.getHeight(), cMano);
        pIzquierda.add(lFondo);
        //Es importante ponerlo al final, JAVA va encimando los labels en el eje z, hacia el fondo de la pantalla.

        lEslogan = servicio.crearJLabel("El mejor experto también fue un día aprendiz.", fontSubtitulo, ((pDerecha.getWidth() - 350) / 2), 40, 350, 20, colorGrisOscuro);
        pDerecha.add(lEslogan);

        lTituloLogin = servicio.crearJLabel("Registra tus Datos", fontTitulo, (pDerecha.getWidth() - 150) / 2, 70, 150, 30, colorGrisOscuro);
        pDerecha.add(lTituloLogin);
        
        lNotificaciones = servicio.crearJLabel("¿Recibir Notificaciones?", fontSubtitulo, (pDerecha.getWidth()-160)/2,400, 160, 40, colorGrisOscuro);
        pDerecha.add(lNotificaciones);

        lUsuario = servicio.crearJLabel(iUsuario2, 40, 130, 30, 30, cMano);
        pDerecha.add(lUsuario);

        lClave = servicio.crearJLabel(iClave2, 40, 270, 30, 30, cMano);
        pDerecha.add(lClave);

    }

    public void crearJButtons() {
        bOpcion1 = new JButton();
        bOpcion2 = new JButton();
        bOpcion3 = new JButton();

        bOpcion1.setBounds(10, 190, 30, 30);
        bOpcion1.setCursor(cMano);
        bOpcion2.setBounds(10, 230, 30, 30);
        bOpcion2.setCursor(cMano);
        bOpcion3.setBounds(10, 270, 30, 30);
        bOpcion3.setCursor(cMano);

        iDimAux = new ImageIcon(
                iPunto1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        );
        bOpcion1.setIcon(iDimAux);
        bOpcion2.setIcon(iDimAux);
        bOpcion3.setIcon(iDimAux);

        bOpcion1.setContentAreaFilled(false);
        bOpcion1.setBorder(null);
        bOpcion1.setFocusable(false);
        bOpcion2.setContentAreaFilled(false);
        bOpcion2.setBorder(null);
        bOpcion2.setFocusable(false);
        bOpcion3.setContentAreaFilled(false);
        bOpcion3.setFocusable(false);
        bOpcion3.setBorder(null);

        pIzquierda.add(bOpcion1);
        pIzquierda.add(bOpcion2);
        pIzquierda.add(bOpcion3);

        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 320);
        bEntrar.setBackground(colorPrincipal);
        bEntrar.setForeground(Color.WHITE);//Color de la letra.
        bEntrar.setFocusable(false);//Quita el recuadro de las letras.
        bEntrar.setCursor(cMano);
        pDerecha.add(bEntrar);

        bCerrar = new JButton();
        bCerrar.setSize(30, 30);
        bCerrar.setLocation(pDerecha.getWidth() - bCerrar.getWidth(), 10);
        bCerrar.setBackground(Color.WHITE);
        //bCerrar.setForeground(Color.WHITE);
        bCerrar.setFocusable(false);
        bCerrar.setCursor(cMano);
        iDimAux = new ImageIcon(
                iCerrar.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        );
        bCerrar.setIcon(iDimAux);
        bCerrar.setBorder(null);
        bCerrar.setFocusable(false);
        bCerrar.setContentAreaFilled(false);

        pDerecha.add(bCerrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setSize(200, 30);
        bRegistrarse.setLocation(pDerecha.getWidth() - bRegistrarse.getWidth(), pDerecha.getHeight() - bRegistrarse.getHeight());
        bRegistrarse.setBackground(colorPrincipal);
        bRegistrarse.setForeground(Color.WHITE);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setCursor(cMano);
        pDerecha.add(bRegistrarse);
    }

    public void crearJTextField() {
        tNombreUsuario = new JTextField();
        TextPrompt placeholderNombre = new TextPrompt("Nombre Usuario", tNombreUsuario, TextPrompt.Show.FOCUS_LOST);
        placeholderNombre.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.setSize(260, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(colorGrisOscuro);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.setCursor(cTexto);
        tNombreUsuario.setBorder(bInferiorAzul);
        pDerecha.add(tNombreUsuario);
    }

    public void crearJPasswordField() {
        tClaveUsuario = new JPasswordField();
        TextPrompt placeholderPass = new TextPrompt("Clave Usuario", tClaveUsuario, TextPrompt.Show.FOCUS_LOST);
        placeholderPass.setHorizontalAlignment(SwingConstants.CENTER);
        /*
        FOCUS_GAINED
        FOCUS_LOST
         */
        tClaveUsuario.setSize(260, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 260);
        tClaveUsuario.setForeground(colorGrisOscuro);
        tClaveUsuario.setCaretColor(Color.BLUE);
        //tClaveUsuario.setCaretPosition();
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tClaveUsuario.setCursor(cTexto);
        tClaveUsuario.setBorder(bInferiorAzul);
        pDerecha.add(tClaveUsuario);
    }

    public void crearJComboBox() {
        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.setSize(220, 30);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 205);
        cbTipoUsuario.setForeground(colorGrisOscuro);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoUsuario);
    }

    public void crearJCheckBox() {
        checkSi = new JCheckBox("Si");
        checkNo = new JCheckBox("No");

        checkSi.setSize(45, 25);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 380);
        checkSi.setCursor(cMano);

        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 380);
        checkNo.setCursor(cMano);

        pDerecha.add(checkNo);
        pDerecha.add(checkSi);

        grupo = new ButtonGroup(); //Hace que los check sean de una seleccion.
        grupo.add(checkSi);
        grupo.add(checkNo);
    }
}
