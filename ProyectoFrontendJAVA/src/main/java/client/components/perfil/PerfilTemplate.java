
package client.components.perfil;

import java.awt.Color;
import javax.swing.*;


public class PerfilTemplate extends JPanel{
    
    private PerfilComponent component;
    public PerfilTemplate(PerfilComponent component){
        this.component=component;
        
        this.setSize(850,600);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.setVisible(true);
    }
}
