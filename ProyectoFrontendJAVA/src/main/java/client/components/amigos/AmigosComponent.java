
package client.components.amigos;


public class AmigosComponent {
    private AmigosTemplate template;
    
    public AmigosComponent(){
        this.template=new AmigosTemplate(this);
    }

    public AmigosTemplate getTemplate() {
        return template;
    }
    
}
