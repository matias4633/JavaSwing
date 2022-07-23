package client.vistaPrincipal;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import javax.swing.*;
import java.awt.*;

public class VistaPrincipalTemplate extends JFrame {

    private static final long SERIAL_VERSION_UID = 1L;

    private ObjGraficoService sGraficos;
    private RecursosService sRecursos;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private JPanel pNavegacion, pBarra, pPrincipal;

    public VistaPrincipalTemplate(VistaPrincipalComponent component) {
        super("Vista Principal");
        this.vistaPrincipalComponent = component;
        sGraficos = ObjGraficoService.getService();
        //sRecursos = RecursosService.getService();

        //this.saludar();
        crearJPanels();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(1100, 650);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);

    }

    public void saludar() {
        String mensaje = "Hola";
        System.out.println(mensaje);
    }

    public void crearJPanels() {
        pNavegacion = sGraficos.crearJPanel(250, 700, 0, 0, null);
        this.add(pNavegacion);
        pBarra = sGraficos.crearJPanel(850, 50, 250, 0, null);
        this.add(pBarra);
        
        pPrincipal = sGraficos.crearJPanel(850, 600, 250, 50, null);
        this.add(pPrincipal);
    }
    
    

    public JPanel getpNavegacion() {
        return pNavegacion;
    }

    public JPanel getpBarra() {
        return pBarra;
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }
    
}
