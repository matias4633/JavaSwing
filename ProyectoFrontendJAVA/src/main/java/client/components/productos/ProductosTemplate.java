
package client.components.productos;

import java.awt.Color;
import javax.swing.*;


public class ProductosTemplate extends JPanel{
    private ProductosComponent component;
    
    public ProductosTemplate(ProductosComponent component){
        this.component=component;
        
            
        this.setSize(850,600);
        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setVisible(true);
    }
}
