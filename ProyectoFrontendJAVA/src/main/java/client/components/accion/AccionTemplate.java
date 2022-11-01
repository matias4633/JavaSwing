package client.components.accion;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccionTemplate extends JPanel {

    private AccionComponent accionComponent;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;
    private JLabel lImagen, lTitulo, lParrafo;
    private ImageIcon iDimAux;

    public AccionTemplate(AccionComponent accionComponent, ImageIcon imagen , String titulo , String parrafo) {
        this.accionComponent = accionComponent;
        sObjGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();

        // Dentro del constructor
        iDimAux = new ImageIcon(
                imagen.getImage()
                        .getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING)
        );
        this.lImagen = sObjGraficos.crearJLabel(iDimAux, (250-60)/2, 5, 45, 45, sRecursos.getcMano());
        this.add(lImagen);
        
        this.lTitulo= sObjGraficos.crearJLabel(titulo, sRecursos.getFontTitulo(), (250-220)/2, 50, 220, 30, sRecursos.getColorGrisOscuro());
        this.add(lTitulo);
        
        this.lParrafo=sObjGraficos.crearJLabel(
                "<html><div align='center'>" + parrafo + "</div></html>", 
                sRecursos.getFontLigera(),
                (250-230)/2,65,230,70,
                sRecursos.getColorGrisOscuro()
        );
        this.add(lParrafo);

        this.setSize(250, 125);
        this.setBackground(Color.WHITE);
        this.setBorder(sRecursos.getBorderGris());
        this.setLayout(null);
        this.setVisible(true);
    }
}
