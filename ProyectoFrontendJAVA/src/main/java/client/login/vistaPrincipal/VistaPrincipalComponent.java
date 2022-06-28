
package client.login.vistaPrincipal;

import client.components.barraTitulo.BarraTituloComponent;
import client.components.navegacionUsuario.NavegacionUsuarioComponent;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VistaPrincipalComponent implements ActionListener{
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraTituloComponent barraTituloComponent;
    private NavegacionUsuarioComponent navegacionComponent;
    
    public VistaPrincipalComponent(){
        this.vistaPrincipalTemplate=new VistaPrincipalTemplate(this);
        this.barraTituloComponent=new BarraTituloComponent(this);
        this.navegacionComponent= new NavegacionUsuarioComponent(this);
        
        vistaPrincipalTemplate.getpBarra().add(barraTituloComponent.getTemplate());
        vistaPrincipalTemplate.getpNavegacion().add(navegacionComponent.getTemplate());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void cerrar(){
        System.exit(0);
    }
    public void minimizar(){
        this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }
}
