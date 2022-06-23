
package client.login.vistaPrincipal;

import javax.swing.JFrame;


public class VistaPrincipalTemplate extends JFrame {
    private static final long SERIAL_VERSION_UID=1L;
    
    public VistaPrincipalTemplate(){
        super("Vista Principal");
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
