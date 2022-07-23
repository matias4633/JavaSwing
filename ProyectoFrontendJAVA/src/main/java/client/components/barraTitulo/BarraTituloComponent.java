
package client.components.barraTitulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import client.components.barraTitulo.BarraTituloTemplate;
import client.vistaPrincipal.VistaPrincipalComponent;


public class BarraTituloComponent implements ActionListener{
    private BarraTituloTemplate template;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    public BarraTituloComponent(VistaPrincipalComponent vistaPrincipalComponent){
        this.template=new BarraTituloTemplate(this);
        this.vistaPrincipalComponent=vistaPrincipalComponent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== template.getbCerrar()){
            vistaPrincipalComponent.cerrar();
        }
        if(e.getSource() == template.getbMinimizar()){
            vistaPrincipalComponent.minimizar();
        }
    }

    public BarraTituloTemplate getTemplate() {
        return template;
    }
    
}
