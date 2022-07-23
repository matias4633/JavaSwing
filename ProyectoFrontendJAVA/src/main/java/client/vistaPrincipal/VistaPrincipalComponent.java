
package client.vistaPrincipal;

import client.components.amigos.AmigosComponent;
import client.components.barraTitulo.BarraTituloComponent;
import client.components.configuraciones.ConfiguracionesComponent;
import client.components.inicio.InicioComponent;
import client.components.navegacionUsuario.NavegacionUsuarioComponent;
import client.components.perfil.PerfilComponent;
import client.components.productos.ProductosComponent;
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
    public void mostrarComponent(String comando){
        this.vistaPrincipalTemplate.getpPrincipal().removeAll();
        
        switch(comando){
            case "Inicio":
                vistaPrincipalTemplate.getpPrincipal().add(new InicioComponent().getTemplate());
                break;
            case "Perfil":
                vistaPrincipalTemplate.getpPrincipal().add(new PerfilComponent().getTemplate());
                break;
            case "Amigos":
                vistaPrincipalTemplate.getpPrincipal().add(new AmigosComponent().getTemplate());
                break;
            case "Productos":
                vistaPrincipalTemplate.getpPrincipal().add(new ProductosComponent().getTemplate());
                break;
            case "Configuracion":
                vistaPrincipalTemplate.getpPrincipal().add(new ConfiguracionesComponent().getTemplate());
                break;
            case "Cerrar Sesión":
                
                break;
            
        }
        this.vistaPrincipalTemplate.repaint();
    }
}
