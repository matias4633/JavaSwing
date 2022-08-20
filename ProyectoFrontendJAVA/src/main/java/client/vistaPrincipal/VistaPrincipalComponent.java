package client.vistaPrincipal;

import client.components.amigos.AmigosComponent;
import client.components.barraTitulo.BarraTituloComponent;
import client.components.configuraciones.ConfiguracionesComponent;
import client.components.inicio.InicioComponent;
import client.components.navegacionUsuario.NavegacionUsuarioComponent;
import client.components.perfil.PerfilComponent;
import client.components.productos.ProductosComponent;
import client.login.LoginComponent;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipalComponent implements ActionListener {

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraTituloComponent barraTituloComponent;
    private NavegacionUsuarioComponent navegacionComponent;
    private LoginComponent login;

    private InicioComponent inicio;
    private PerfilComponent perfil;
    private AmigosComponent amigos;
    private ProductosComponent productos;
    private ConfiguracionesComponent configuraciones;
    
    //Solor para pruebas. borrar despuest
    public VistaPrincipalComponent(){
        this.vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        this.barraTituloComponent = new BarraTituloComponent(this);
        this.navegacionComponent = new NavegacionUsuarioComponent(this);
        
        vistaPrincipalTemplate.getpBarra().add(barraTituloComponent.getTemplate());
        vistaPrincipalTemplate.getpNavegacion().add(navegacionComponent.getTemplate());
        
        inicio=new InicioComponent();
        vistaPrincipalTemplate.getpPrincipal().add(inicio.getTemplate());
    }
    //Hasta aca.
    
    
    public VistaPrincipalComponent(LoginComponent loginComponent) {
        this.vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        this.barraTituloComponent = new BarraTituloComponent(this);
        this.navegacionComponent = new NavegacionUsuarioComponent(this);
        this.login = loginComponent;
        vistaPrincipalTemplate.getpBarra().add(barraTituloComponent.getTemplate());
        vistaPrincipalTemplate.getpNavegacion().add(navegacionComponent.getTemplate());
        
        inicio=new InicioComponent();
        vistaPrincipalTemplate.getpPrincipal().add(inicio.getTemplate());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cerrar() {
        System.exit(0);
    }

    public void minimizar() {
        this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }

    public void mostrarComponent(String comando) {
        this.vistaPrincipalTemplate.getpPrincipal().removeAll();

        switch (comando) {
            case "Inicio":
                    vistaPrincipalTemplate.getpPrincipal().add(inicio.getTemplate());
                break;
            case "Perfil":
                if (perfil == null) {
                    perfil = new PerfilComponent();
                    vistaPrincipalTemplate.getpPrincipal().add(perfil.getTemplate());
                } else {
                    vistaPrincipalTemplate.getpPrincipal().add(perfil.getTemplate());
                }

                break;
            case "Amigos":
                if (amigos == null) {
                    amigos = new AmigosComponent();
                    vistaPrincipalTemplate.getpPrincipal().add(amigos.getTemplate());
                } else {
                    vistaPrincipalTemplate.getpPrincipal().add(amigos.getTemplate());
                }

                break;
            case "Productos":
                if (productos == null) {
                    productos = new ProductosComponent();
                    vistaPrincipalTemplate.getpPrincipal().add(productos.getTemplate());
                } else {
                    vistaPrincipalTemplate.getpPrincipal().add(productos.getTemplate());
                }

                break;
            case "Configuracion":
                if (configuraciones == null) {
                    configuraciones = new ConfiguracionesComponent();
                    vistaPrincipalTemplate.getpPrincipal().add(configuraciones.getTemplate());
                } else {
                    vistaPrincipalTemplate.getpPrincipal().add(configuraciones.getTemplate());
                }
                vistaPrincipalTemplate.getpPrincipal().add(new ConfiguracionesComponent().getTemplate());
                break;
            case "Cerrar Sesión":
                vistaPrincipalTemplate.setVisible(false);

                login.getLoginTemplate().setVisible(true);
                break;

        }
        this.vistaPrincipalTemplate.repaint();
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }
}
