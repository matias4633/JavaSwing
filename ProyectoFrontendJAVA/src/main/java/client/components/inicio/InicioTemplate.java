
package client.components.inicio;

import javax.swing.*;
import java.awt.*;


public class InicioTemplate extends JPanel {
    private InicioComponent component;
    
    public InicioTemplate(InicioComponent component){
        this.component=component;
        
        
        this.setSize(850,600);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);
        
    }
}
