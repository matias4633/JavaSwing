package client.components.inicio;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import javax.swing.*;
import java.awt.*;

public class InicioTemplate extends JPanel {

    private InicioComponent component;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;
    private JPanel pMision, pVision, pNosotros, pAcciones;
    private JLabel lAcciones;

    public InicioTemplate(InicioComponent component) {
        this.component = component;

        sObjGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();

        crearJPanels();
       

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
}
