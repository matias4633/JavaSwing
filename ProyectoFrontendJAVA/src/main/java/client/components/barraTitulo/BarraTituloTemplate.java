package client.components.barraTitulo;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import client.login.vistaPrincipal.VistaPrincipalComponent;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class BarraTituloTemplate extends JPanel {

    private BarraTituloComponent component;
    private ObjGraficoService sGrafico;
    private RecursosService sRecursos;
    private JLabel lLogoApp,lTituloApp;
    private JButton bCerrar,bMinimizar;
    private ImageIcon iCerrrar,iMinimizar,iLogoApp,iDimAux;
    private Font fontTituloBarra;
   

    public BarraTituloTemplate(BarraTituloComponent component) {
        this.component = component;
        this.sGrafico = ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();
        
        crearObjetosDecoradores();
        crearJButtons();
        crearJLabels();
        
        this.setSize(850,50);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    public void crearObjetosDecoradores(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\fonts\\BRITANIC.TTF")));
            
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace(System.out);
        }
        fontTituloBarra= new Font("Britannic Bold",Font.PLAIN,24);
        
        iLogoApp = new ImageIcon("C:\\Users\\matia\\Documents\\GITHUB\\ProyectoFrontendJAVA\\ProyectoFrontendJAVA\\resources\\images\\logo_app.png");
        
    }
    
    public void crearJButtons(){
        iDimAux=new ImageIcon(
                sRecursos.getiMinimizar().getImage().getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)
        );
        bMinimizar= sGrafico.crearJButton(iDimAux, 750, 10, 30, 30,sRecursos.getcMano());
        bMinimizar.addActionListener(component);
        this.add(bMinimizar);
        
        iDimAux=new ImageIcon(
                sRecursos.getiCerrar().getImage().getScaledInstance(23, 23, Image.SCALE_AREA_AVERAGING)
        );
        bCerrar = sGrafico.crearJButton(iDimAux, 800, 10, 30, 30,sRecursos.getcMano());
        bCerrar.addActionListener(component);
        this.add(bCerrar);
               
    }
    public void crearJLabels(){
        iDimAux=new ImageIcon(
                iLogoApp.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING)
        );
        lLogoApp=sGrafico.crearJLabel(iDimAux, 20, 0 , 50,50,sRecursos.getcMano());
        this.add(lLogoApp);
        
        lTituloApp = sGrafico.crearJLabel(
                "ProductList",
                fontTituloBarra,
                40,
                5,
                200,
                40,
                sRecursos.getColorPrincipal());
        this.add(lTituloApp);
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbMinimizar() {
        return bMinimizar;
    }
    
}
