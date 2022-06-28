
package client.components.navegacionUsuario;

import client.login.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavegacionUsuarioComponent implements ActionListener{
    private NavegacionUsuarioTemplate template;
    private VistaPrincipalComponent componentPrincipal;
    
    public NavegacionUsuarioComponent(VistaPrincipalComponent componentPrincipal){
        this.template=new NavegacionUsuarioTemplate(this);
        this.componentPrincipal=componentPrincipal;
        
        
    }

    public NavegacionUsuarioTemplate getTemplate() {
        return template;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
