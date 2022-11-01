package client.components.inicio;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import client.components.accion.AccionComponent;
import client.components.accion.AccionTemplate;
import client.components.tarjeta.TarjetaComponent;
import javax.swing.*;
import java.awt.*;

public class InicioTemplate extends JPanel {

    private InicioComponent component;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;
    private JPanel pMision, pVision, pNosotros, pAcciones;
    private JLabel lAcciones;
    private ImageIcon iTarjeta1, iTarjeta2, iTarjeta3;
    private ImageIcon iClase, iPantalla, iIdea, iCelular, iEstadistica, iDireccion;

    public InicioTemplate(InicioComponent component) {
        this.component = component;

        sObjGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();

        crearJPanels();
        crearObjetosDecoradores();
        crearContenidoPMision();
        crearContenidoPVision();
        crearContenidoPNosotros();

        crearContenidoPAcciones();

        this.setSize(850, 600);
        this.setBackground(sRecursos.getColorGrisClaro());
        this.setLayout(null);
        this.setVisible(true);

    }

    private void crearJPanels() {
        this.pMision = sObjGraficos.crearJPanel(256, 230, 20, 15, Color.WHITE);
        this.add(pMision);

        this.pVision = sObjGraficos.crearJPanel(256, 230, 296, 15, Color.WHITE);
        this.add(pVision);

        this.pNosotros = sObjGraficos.crearJPanel(256, 230, 572, 15, Color.WHITE);
        this.add(pNosotros);

        this.pAcciones = sObjGraficos.crearJPanel(810, 330, 20, 260, Color.WHITE);
        this.add(pAcciones);
    }

    public void crearObjetosDecoradores() {
        this.iTarjeta1 = new ImageIcon("resources\\images\\tarjetas\\tarjeta1.jpg");
        this.iTarjeta2 = new ImageIcon("resources\\images\\tarjetas\\tarjeta2.jpg");
        this.iTarjeta3 = new ImageIcon("resources\\images\\tarjetas\\tarjeta3.jpg");

        this.iClase = new ImageIcon("resources\\images\\acciones\\clases.png");
        this.iPantalla = new ImageIcon("resources\\images\\acciones\\pantalla.png");
        this.iCelular = new ImageIcon("resources\\images\\acciones\\celular.png");
        this.iIdea = new ImageIcon("resources\\images\\acciones\\ideas.png");
        this.iEstadistica = new ImageIcon("resources\\images\\acciones\\estadisticas.png");
        this.iDireccion = new ImageIcon("resources\\images\\acciones\\direccion.png");
    }

    public void crearContenidoPMision() {
        pMision.add(new TarjetaComponent(
                "Nuestra Misión",
                iTarjeta1,
                "Brindar cursos a la comunidad académica para "
                + "complementar habilidades fuera del pensum común.").getTemplate()
        );
    }

    public void crearContenidoPVision() {
        pVision.add(
                new TarjetaComponent(
                        "Nuestra Visión",
                        iTarjeta2,
                        "Brindar cursos académicos al 80% de los"
                        + "estudiantes de ingeniería de Sistemás."
                ).getTemplate()
        );
    }

    public void crearContenidoPNosotros() {
        pNosotros.add(
                new TarjetaComponent(
                        "Sobre Nosotros",
                        iTarjeta3,
                        "Somos un grupo de trabajo multidisiplinario"
                        + "Estamos ubicados en BS AS."
                ).getTemplate()
        );
    }

    public void crearContenidoPAcciones() {
        lAcciones = sObjGraficos.crearJLabel("Nuestros Servicios", sRecursos.getFontTitulo(), 10, 10, 160, 30, sRecursos.getColorPrincipal());
        pAcciones.add(lAcciones);

        AccionTemplate p1 = new AccionComponent(
                iClase,
                "Clases",
                "Clases a la comunidad que complementan el pensum."
        ).getAccionTemplate();

        p1.setLocation(15, 50);
        this.pAcciones.add(p1);

        AccionTemplate p2 = new AccionComponent(
                iPantalla,
                "Clases Virtuales",
                "Cursos virtuales como medio de enseñanza."
        ).getAccionTemplate();
        p2.setLocation(30 + p2.getWidth(), 50);
        this.pAcciones.add(p2);

        AccionTemplate p3 = new AccionComponent(
                iIdea,
                "Generación de ideas",
                "Desarrollo de ideas con tecnologías actuales."
        ).getAccionTemplate();
        p3.setLocation(45 + p3.getWidth() * 2, 50);
        this.pAcciones.add(p3);

        AccionTemplate p4 = new AccionComponent(
                iCelular,
                "Notificaciones",
                "Notificaión el estado de tus cursos y actividades."
        ).getAccionTemplate();
        p4.setLocation(15, 65 + p4.getHeight());
        this.pAcciones.add(p4);

        AccionTemplate p5 = new AccionComponent(
                iEstadistica,
                "Estadisticas",
                "Gestión de participación en nuestros cursos."
        ).getAccionTemplate();
        p5.setLocation(30 + p5.getWidth(), 65 + p5.getHeight());
        this.pAcciones.add(p5);

        AccionTemplate p6 = new AccionComponent(
                iDireccion,
                "Dirección",
                "Damos direcciónamiento a nuestros estudiantes."
        ).getAccionTemplate();
        p6.setLocation(45 + p6.getWidth() * 2, 65 + p6.getHeight());
        this.pAcciones.add(p6);
    }
}
