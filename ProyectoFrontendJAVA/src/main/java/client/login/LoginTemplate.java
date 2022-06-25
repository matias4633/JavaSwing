package client.login;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import java.awt.Color;
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

public class LoginTemplate extends JFrame {

    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    private JLabel lFondo, lSvg1, lLogo, lUsuario, lClave, lFacebook, lTwitter, lYoutube;
    private RecursosService sRecursos;
    private ObjGraficoService sGraficos;
    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent component) {
        //super("Login Usuario");
        this.loginComponent= component;
        
        sGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();

        crearJPanels();
        crearJButtons();
        crearJLabels();
        crearJTextFields();
        crearJPasswordFields();
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

    public void crearJPanels() {
        ObjGraficoService servicio = ObjGraficoService.getService();
        pIzquierda = servicio.crearJPanel(600, 500, 0, 0, Color.WHITE);
        this.add(pIzquierda);
        pDerecha = servicio.crearJPanel(400, 500, 600, 0, Color.WHITE);
        this.add(pDerecha);
    }

    public void crearJLabels() {
        ObjGraficoService servicio = ObjGraficoService.getService();

        lTituloApp = servicio.crearJLabel(
                "Login de Usuario",
                sRecursos.getFontPrincipal(),
                100,
                20,
                220,
                30,
                Color.WHITE
        );
        pIzquierda.add(lTituloApp);

        lFacebook = servicio.crearJLabel(
                sRecursos.getiFacebook1(),
                20,
                pIzquierda.getHeight() - 50,
                30,
                30,
                sRecursos.getcMano()
        );
        pIzquierda.add(lFacebook);

        lTwitter = servicio.crearJLabel(
                sRecursos.getiTwitter1(),
                60,
                pIzquierda.getHeight() - 50,
                30,
                30,
                sRecursos.getcMano()
        );
        pIzquierda.add(lTwitter);

        lYoutube = servicio.crearJLabel(
                sRecursos.getiYoutube1(),
                100,
                pIzquierda.getHeight() - 50,
                30,
                30,
                sRecursos.getcMano()
        );
        pIzquierda.add(lYoutube);

        lLogo = servicio.crearJLabel(
                sRecursos.getiLogo(),
                50,
                20,
                40,
                40,
                sRecursos.getcMano()
        );
        pIzquierda.add(lLogo);

        lSvg1 = servicio.crearJLabel(
                sRecursos.getiSvg1(),
                100,
                100,
                500,
                345,
                sRecursos.getcMano()
        );
        pIzquierda.add(lSvg1);

        lFondo = servicio.crearJLabel(
                sRecursos.getiFondo(),
                0,
                0,
                pIzquierda.getWidth(),
                pIzquierda.getHeight(),
                sRecursos.getcMano()
        );
        pIzquierda.add(lFondo);
        //Es importante ponerlo al final, JAVA va encimando los labels en el eje z, hacia el fondo de la pantalla.

        lEslogan = servicio.crearJLabel(
                "El mejor experto también fue un día aprendiz.",
                sRecursos.getFontSubtitulo(),
                ((pDerecha.getWidth() - 350) / 2),
                40,
                350,
                20,
                sRecursos.getColorGrisOscuro()
        );
        pDerecha.add(lEslogan);

        lTituloLogin = servicio.crearJLabel(
                "Registra tus Datos",
                sRecursos.getFontTitulo(),
                (pDerecha.getWidth() - 150) / 2,
                70,
                150,
                30,
                sRecursos.getColorGrisOscuro()
        );
        pDerecha.add(lTituloLogin);

        lNotificaciones = servicio.crearJLabel(
                "¿Recibir Notificaciones?",
                sRecursos.getFontSubtitulo(),
                (pDerecha.getWidth() - 160) / 2,
                400,
                160,
                40,
                sRecursos.getColorGrisOscuro()
        );
        pDerecha.add(lNotificaciones);

        lUsuario = servicio.crearJLabel(
                sRecursos.getiUsuario2(),
                40,
                130,
                30,
                30,
                sRecursos.getcMano()
        );
        pDerecha.add(lUsuario);

        lClave = servicio.crearJLabel(
                sRecursos.getiClave2(),
                40,
                270,
                30,
                30,
                sRecursos.getcMano()
        );
        pDerecha.add(lClave);

    }

    public void crearJButtons() {
        ObjGraficoService servicio = ObjGraficoService.getService();
        bOpcion1 = servicio.crearJButton(sRecursos.getiPunto1(), 10, 190, 30, 30, sRecursos.getcMano());
        bOpcion1.addActionListener(loginComponent);
        pIzquierda.add(bOpcion1);
        bOpcion2 = servicio.crearJButton(sRecursos.getiPunto1(), 10, 230, 30, 30, sRecursos.getcMano());
        bOpcion2.addActionListener(loginComponent);
        pIzquierda.add(bOpcion2);
        bOpcion3 = servicio.crearJButton(sRecursos.getiPunto1(), 10, 270, 30, 30, sRecursos.getcMano());
        bOpcion3.addActionListener(loginComponent);
        pIzquierda.add(bOpcion3);

        bEntrar = servicio.crearJButton(
                "Entrar",
                (pDerecha.getWidth() - 250) / 2,
                320,
                250,
                45,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                sRecursos.getcMano()
        );
        bEntrar.addActionListener(loginComponent);
        pDerecha.add(bEntrar);
        bCerrar = servicio.crearJButton(sRecursos.getiCerrar(), pDerecha.getWidth() - 30, 10, 30, 30, sRecursos.getcMano());
        bCerrar.setBorder(null);
        bCerrar.setFocusable(false);
        bCerrar.setContentAreaFilled(false);
        bCerrar.addActionListener(loginComponent);
        pDerecha.add(bCerrar);

        bRegistrarse = servicio.crearJButton(
                "Registrarse",
                pDerecha.getWidth() - 200,
                pDerecha.getHeight() - 30,
                200,
                30,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                sRecursos.getcMano()
        );
        bRegistrarse.addActionListener(loginComponent);
        pDerecha.add(bRegistrarse);
    }

    public void crearJTextFields() {
        ObjGraficoService servicio = ObjGraficoService.getService();
        tNombreUsuario = servicio.crearJTextField(
                "Nombre Usuario",
                (pDerecha.getWidth() - 260) / 2,
                120,
                260,
                40,
                sRecursos.getColorGrisOscuro(),
                Color.WHITE,
                Color.BLUE,
                sRecursos.getcTexto(),
                sRecursos.getbInferiorAzul()
        );
        pDerecha.add(tNombreUsuario);
    }

    public void crearJPasswordFields() {
        ObjGraficoService servicio = ObjGraficoService.getService();

        tClaveUsuario = servicio.crearJPasswordField(
                "Clave Usuario",
                (pDerecha.getWidth() - 260) / 2,
                260,
                260,
                40,
                sRecursos.getColorGrisOscuro(),
                Color.BLUE,
                sRecursos.getcTexto(),
                sRecursos.getbInferiorAzul()
        );
        pDerecha.add(tClaveUsuario);
    }

    public void crearJComboBox() {
        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.setSize(220, 30);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 205);
        cbTipoUsuario.setForeground(sRecursos.getColorGrisOscuro());
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
        checkSi.setCursor(sRecursos.getcMano());

        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 380);
        checkNo.setCursor(sRecursos.getcMano());

        pDerecha.add(checkNo);
        pDerecha.add(checkSi);

        grupo = new ButtonGroup(); //Hace que los check sean de una seleccion.
        grupo.add(checkSi);
        grupo.add(checkNo);
    }

    public JTextField gettNombreUsuario() {
        return tNombreUsuario;
    }

    public JPasswordField gettClaveUsuario() {
        return tClaveUsuario;
    }

    public JComboBox getCbTipoUsuario() {
        return cbTipoUsuario;
    }

    public JButton getbEntrar() {
        return bEntrar;
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbRegistrarse() {
        return bRegistrarse;
    }

    public JButton getbOpcion1() {
        return bOpcion1;
    }

    public JButton getbOpcion2() {
        return bOpcion2;
    }

    public JButton getbOpcion3() {
        return bOpcion3;
    }

    public JCheckBox getCheckSi() {
        return checkSi;
    }

    public JCheckBox getCheckNo() {
        return checkNo;
    }
    
}
