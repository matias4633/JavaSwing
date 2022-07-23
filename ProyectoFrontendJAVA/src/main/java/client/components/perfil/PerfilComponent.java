
package client.components.perfil;

import client.vistaPrincipal.VistaPrincipalComponent;


public class PerfilComponent {
    private PerfilTemplate template;
   // VistaPrincipalComponent component;
    public PerfilComponent(){
        
        this.template=new PerfilTemplate(this);
        
    }

    public PerfilTemplate getTemplate() {
        return template;
    }
    
}
