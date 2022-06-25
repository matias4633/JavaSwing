
package client.login.vistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VistaPrincipalComponent implements ActionListener{
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    
    public VistaPrincipalComponent(){
        this.vistaPrincipalTemplate=new VistaPrincipalTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
