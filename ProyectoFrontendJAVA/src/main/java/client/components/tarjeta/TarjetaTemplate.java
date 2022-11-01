package client.components.tarjeta;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TarjetaTemplate extends JPanel {

    private TarjetaComponent component;
    private ObjGraficoService sObjGraficos;
    private RecursosService sRecursos;
    private JLabel lTitulo, lImagen, lParrafo;
    private ImageIcon iDimAux;

    public TarjetaTemplate(TarjetaComponent component, String titulo, ImageIcon imagen, String parrafo) {
        this.component = component;
        this.sObjGraficos = ObjGraficoService.getService();
        this.sRecursos = RecursosService.getService();

        iDimAux = new ImageIcon(imagen.getImage().getScaledInstance(246, 110, Image.SCALE_AREA_AVERAGING));
        lImagen = sObjGraficos.crearJLabel(iDimAux, 5, 5, 246, 110, sRecursos.getcMano());
        this.add(lImagen);

        lTitulo = sObjGraficos.crearJLabel(titulo, sRecursos.getFontTitulo(), 15, 120, 180, 30, sRecursos.getColorPrincipal());
        this.add(lTitulo);

        lParrafo = sObjGraficos.crearJLabel(
                "<html><div align='justify'>" + parrafo + "</div></html>",
                sRecursos.getFontLigera(),
                20, 120, 206, 120,
                sRecursos.getColorGrisOscuro()
        );
        this.add(lParrafo);

        this.setSize(256, 230);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    }
}
