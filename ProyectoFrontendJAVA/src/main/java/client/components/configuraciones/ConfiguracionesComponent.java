
package client.components.configuraciones;


public class ConfiguracionesComponent {
    private ConfiguracionesTemplate template;
    
    public ConfiguracionesComponent(){
        this.template=new ConfiguracionesTemplate(this);
    }

    public ConfiguracionesTemplate getTemplate() {
        return template;
    }
    
}
