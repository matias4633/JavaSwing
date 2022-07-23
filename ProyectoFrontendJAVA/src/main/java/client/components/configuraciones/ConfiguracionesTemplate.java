
package client.components.configuraciones;

import java.awt.Color;
import javax.swing.*;


public class ConfiguracionesTemplate extends JPanel {
    private ConfiguracionesComponent component;
    
    public ConfiguracionesTemplate(ConfiguracionesComponent component){
        this.component=component;
        
            
        this.setSize(850,600);
        this.setBackground(Color.PINK);
        this.setLayout(null);
        this.setVisible(true);
    }
}
