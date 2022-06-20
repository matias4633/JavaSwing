package app.login;

import java.awt.Color;
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

    public LoginTemplate() {
        super("Login Usuario");

        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(Color.BLUE);
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        lTituloApp = new JLabel();
        lTituloApp.setText("Login de Usuario");
        lTituloApp.setBounds(100, 20, 220, 30);
        lTituloApp.setForeground(Color.WHITE);
        pIzquierda.add(lTituloApp);

        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLocation(600, 0);
        pDerecha.setBackground(Color.WHITE);
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lEslogan = new JLabel("Te ayudamos en todo");
        lEslogan.setSize(130, 20);
        lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setForeground(Color.DARK_GRAY);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lEslogan);

        lTituloLogin = new JLabel("Registra tus Datos");
        lTituloLogin.setSize(150, 30);
        lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 60);
        lTituloLogin.setForeground(Color.DARK_GRAY);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setSize(140, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 370);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField();
        TextPrompt placeholderNombre = new TextPrompt("Nombre Usuario", tNombreUsuario);
        placeholderNombre.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.setSize(260, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField();
        TextPrompt placeholderPass = new TextPrompt("Clave Usuario", tClaveUsuario);
        placeholderPass.setHorizontalAlignment(SwingConstants.CENTER);
        tClaveUsuario.setSize(260, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 240);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);

        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.setSize(220, 30);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 185);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoUsuario);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);

    }
}
