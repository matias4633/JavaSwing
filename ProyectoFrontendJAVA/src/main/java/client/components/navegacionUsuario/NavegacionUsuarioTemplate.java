package client.components.navegacionUsuario;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class NavegacionUsuarioTemplate extends JPanel {

    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private ObjGraficoService sGraficos;
    private RecursosService sRecursos;
    private JLabel lNombreUsuario, lEslogan, lImagenUsuario, lIconoUsuario;
    private JButton bInicio, bPerfil, bAmigos, bProductos, bConfiguracion, bCerarSesion;
    private JPanel pSuperior, pInferior;
    private ImageIcon iIconoUsuario, iInicio, iPerfil, iAmigos, iProductos,
            iConfiguracion, iCerrarSesion, iImagenUsuario, iDimAux;
    private Border bVacio;

    public NavegacionUsuarioTemplate(NavegacionUsuarioComponent component) {
        this.navegacionUsuarioComponent = component;
        this.sGraficos = ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();

        crearJPanels();
        crearObjetosDecoradores();
        crearJLabels();
        crearJButtons();

        this.setSize(250, 700);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPanels() {
        pSuperior = sGraficos.crearJPanel(250, 300, 0, 0, sRecursos.getColorPrincipal());
        this.add(pSuperior);
        pInferior = sGraficos.crearJPanel(250, 400, 0, 300, sRecursos.getColorPrincipal());
        this.add(pInferior);
    }

    public void crearObjetosDecoradores() {
        this.iIconoUsuario = new ImageIcon("resources\\images\\usuario_navegacion.png");
        this.iInicio = new ImageIcon("resources\\images\\inicio.png");
        this.iPerfil = new ImageIcon("resources\\images\\perfil.png");
        this.iAmigos = new ImageIcon("resources\\images\\amigos.png");
        this.iProductos = new ImageIcon("resources\\images\\productos.png");
        this.iConfiguracion = new ImageIcon("resources\\images\\configuracion.png");
        this.iCerrarSesion = new ImageIcon("resources\\images\\salir.png");
        this.iImagenUsuario = new ImageIcon("resources\\images\\perfiles\\perfil1.jpeg");
        this.bVacio = new EmptyBorder(2, 20, 2, 2);
    }

    public void crearJLabels() {
        iDimAux = new ImageIcon(
                iIconoUsuario.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
        );
        lIconoUsuario = sGraficos.crearJLabel(iDimAux, 10, 20, 40, 40, null);
        pSuperior.add(lIconoUsuario);

        lNombreUsuario = sGraficos.crearJLabel("Nombre de usuario", sRecursos.getFontTitulo(), (pSuperior.getWidth() - 200) / 2 + 10, 20, 200, 40, Color.WHITE);
        pSuperior.add(lNombreUsuario);

        iDimAux = new ImageIcon(
                iImagenUsuario.getImage().getScaledInstance(180, 180, Image.SCALE_AREA_AVERAGING)
        );
        lImagenUsuario = sGraficos.crearJLabel(iDimAux, (pSuperior.getWidth() - 180) / 2, 75, 180, 180, null);
        pSuperior.add(lImagenUsuario);

        lEslogan = sGraficos.crearJLabel(
                "<html><div align='center' >Nuestros clientes son <br> lo mas importante</div></html>",
                sRecursos.getFontLigera(),
                (pSuperior.getWidth() - 180) / 2, 265,
                180, 40,
                Color.WHITE
        );
        pSuperior.add(lEslogan);
    }

    public void crearJButtons() {
        bInicio = sGraficos.crearJButton("      Inicio", 35, 30, 180, 30, null, Color.white, sRecursos.getcMano());
        bInicio.setBorder(null);
        bInicio.setFont(sRecursos.getFontLigera());
        iDimAux = new ImageIcon(
                iInicio.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        bInicio.setIcon(iDimAux);
        bInicio.setHorizontalAlignment(SwingConstants.LEFT);
        bInicio.addActionListener(navegacionUsuarioComponent);
        bInicio.addMouseListener(navegacionUsuarioComponent);
        pInferior.add(bInicio);

        bPerfil = sGraficos.crearJButton("      Perfil", 35, 70, 180, 30, null, Color.white, sRecursos.getcMano());
        bPerfil.setBorder(null);
        bPerfil.setFont(sRecursos.getFontLigera());
        iDimAux = new ImageIcon(
                iPerfil.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        bPerfil.setIcon(iDimAux);
        bPerfil.setHorizontalAlignment(SwingConstants.LEFT);
        bPerfil.addActionListener(navegacionUsuarioComponent);
        bPerfil.addMouseListener(navegacionUsuarioComponent);
        pInferior.add(bPerfil);

        bAmigos = sGraficos.crearJButton("      Amigos", 35, 110, 180, 30, null, Color.white, sRecursos.getcMano());
        bAmigos.setBorder(null);
        bAmigos.setFont(sRecursos.getFontLigera());
        iDimAux = new ImageIcon(
                iAmigos.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        bAmigos.setIcon(iDimAux);
        bAmigos.setHorizontalAlignment(SwingConstants.LEFT);
        bAmigos.addActionListener(navegacionUsuarioComponent);
        bAmigos.addMouseListener(navegacionUsuarioComponent);
        pInferior.add(bAmigos);

        bProductos = sGraficos.crearJButton("      Productos", 35, 150, 180, 30, null, Color.white, sRecursos.getcMano());
        bProductos.setBorder(null);
        bProductos.setFont(sRecursos.getFontLigera());
        iDimAux = new ImageIcon(
                iProductos.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        bProductos.setIcon(iDimAux);
        bProductos.setHorizontalAlignment(SwingConstants.LEFT);
        bProductos.addActionListener(navegacionUsuarioComponent);
        bProductos.addMouseListener(navegacionUsuarioComponent);
        pInferior.add(bProductos);

        bConfiguracion = sGraficos.crearJButton("      Configuracion", 35, 190, 180, 30, null, Color.white, sRecursos.getcMano());
        bConfiguracion.setBorder(null);
        bConfiguracion.setFont(sRecursos.getFontLigera());
        iDimAux = new ImageIcon(
                iConfiguracion.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        bConfiguracion.setIcon(iDimAux);
        bConfiguracion.setHorizontalAlignment(SwingConstants.LEFT);
        bConfiguracion.addActionListener(navegacionUsuarioComponent);
        bConfiguracion.addMouseListener(navegacionUsuarioComponent);
        pInferior.add(bConfiguracion);

        bCerarSesion = sGraficos.crearJButton("      Cerrar Sesión", 35, 230, 180, 30, null, Color.white, sRecursos.getcMano());
        bCerarSesion.setBorder(null);
        bCerarSesion.setFont(sRecursos.getFontLigera());
        iDimAux = new ImageIcon(
                iCerrarSesion.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        bCerarSesion.setIcon(iDimAux);
        bCerarSesion.setHorizontalAlignment(SwingConstants.LEFT);
        bCerarSesion.addActionListener(navegacionUsuarioComponent);
        bCerarSesion.addMouseListener(navegacionUsuarioComponent);
        pInferior.add(bCerarSesion);

    }

    public JButton getBInicio() {
        return this.bInicio;
    }

    public JButton getbInicio() {
        return bInicio;
    }

    public JButton getbPerfil() {
        return bPerfil;
    }

    public JButton getbAmigos() {
        return bAmigos;
    }

    public JButton getbProductos() {
        return bProductos;
    }

    public JButton getbConfiguracion() {
        return bConfiguracion;
    }

    public JButton getbCerarSesion() {
        return bCerarSesion;
    }

    public Border getbVacio() {
        return bVacio;
    }

}
