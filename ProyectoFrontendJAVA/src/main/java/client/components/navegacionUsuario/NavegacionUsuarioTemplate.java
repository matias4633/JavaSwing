package client.components.navegacionUsuario;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class NavegacionUsuarioTemplate extends JPanel {

    private NavegacionUsuarioComponent component;
    private ObjGraficoService sGraficos;
    private RecursosService sRecursos;
    private JLabel lNombreUsuario, lEslogan, lImagenUsuario, lIconoUsuario;
    private JButton bInicio, bPerfil, bAmigos, bProductos, bConfiguracion, bCerarSesion;
    private JPanel pSuperior, pInferior;
    private ImageIcon iIconoUsuario, iInicio, iPerfil, iAmigos, iProductos,
            iConfiguracion, iCerrarSesion, iImagenUsuario, iDimAux;
    private Border bVacio;

    public NavegacionUsuarioTemplate(NavegacionUsuarioComponent component) {
        this.component = component;
        this.sGraficos = ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();

        crearJPanels();
        crearObjetosDecoradores();
        crearJLabels();

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
        this.iIconoUsuario = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\usuario_navegacion.png");
        this.iInicio = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\inicio.png");
        this.iPerfil = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\perfil.png");
        this.iAmigos = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\amigos.png");
        this.iProductos = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\productos.png");
        this.iConfiguracion = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\configuracion.png");
        this.iCerrarSesion = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\salir.png");
        this.iImagenUsuario = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\perfiles\\perfil1.png");
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

}
