
package client.components.amigos;

import java.awt.Color;
import javax.swing.*;


public class AmigosTemplate extends JPanel{
    
    private AmigosComponent component;
    
    public AmigosTemplate(AmigosComponent component){
        this.component=component;
        
        
          
        this.setSize(850,600);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true);
    }
}
