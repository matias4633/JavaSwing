package client.components.navegacionUsuario;

import app.services.RecursosService;
import client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class NavegacionUsuarioComponent extends MouseAdapter implements ActionListener {

    private NavegacionUsuarioTemplate navegacionUsuarioTemplate;
    private VistaPrincipalComponent componentPrincipal;

    public NavegacionUsuarioComponent(VistaPrincipalComponent componentPrincipal) {
        this.navegacionUsuarioTemplate = new NavegacionUsuarioTemplate(this);
        this.componentPrincipal = componentPrincipal;

    }

    public NavegacionUsuarioTemplate getTemplate() {
        return navegacionUsuarioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.componentPrincipal.mostrarComponent(e.getActionCommand().trim());
        //.trim saca los espacios al pricipio y al final, no en el medio.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton boton = ((JButton) e.getSource());
        boton.setContentAreaFilled(true);
        boton.setBackground(RecursosService.getService().getColorPrincipalOscuro());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton boton = ((JButton) e.getSource());
        boton.setContentAreaFilled(false);
    }

}
