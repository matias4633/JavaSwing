
package client.login.vistaPrincipal;

import app.services.ObjGraficoService;
import app.services.RecursosService;
import javax.swing.JFrame;


public class VistaPrincipalTemplate extends JFrame {
    private static final long SERIAL_VERSION_UID=1L;
    
    private ObjGraficoService sGraficos;
    private RecursosService sRecursos;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent component){
        super("Vista Principal");
        this.vistaPrincipalComponent=component;
        sGraficos = ObjGraficoService.getService();
        sRecursos = RecursosService.getService();
        
        this.saludar();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
    }
    
    public void saludar(){
        String mensaje="Hola";
        System.out.println(mensaje);
    }
}
