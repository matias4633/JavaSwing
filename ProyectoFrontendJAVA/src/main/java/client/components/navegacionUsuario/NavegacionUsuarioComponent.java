package client.components.navegacionUsuario;

import client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavegacionUsuarioComponent implements ActionListener {

    private NavegacionUsuarioTemplate template;
    private VistaPrincipalComponent componentPrincipal;

    public NavegacionUsuarioComponent(VistaPrincipalComponent componentPrincipal) {
        this.template = new NavegacionUsuarioTemplate(this);
        this.componentPrincipal = componentPrincipal;

    }

    public NavegacionUsuarioTemplate getTemplate() {
        return template;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.componentPrincipal.mostrarComponent(e.getActionCommand().trim());
        //.trim saca los espacios al pricipio y al final, no en el medio.
    }

}
