
package client.components.inicio;

import client.vistaPrincipal.VistaPrincipalComponent;


public class InicioComponent {
    
    private InicioTemplate template;
  //  private VistaPrincipalComponent component;
    public InicioComponent(){
        this.template=new InicioTemplate(this);
        
    }

    public InicioTemplate getTemplate() {
        return template;
    }
    
            
}

