
package client.login;

import client.vistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class LoginComponent implements ActionListener {
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    
    public LoginComponent(){
        this.loginTemplate=new LoginTemplate(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginTemplate.getbEntrar()){
            mostrarDatosUsuario();
            entrar();
        }
        if(e.getSource()== loginTemplate.getbCerrar()){
            System.exit(0);
        }
        if(e.getSource()== loginTemplate.getbOpcion1()){
            JOptionPane.showMessageDialog(null, "Boton Opcion1","Advertencia", 1);
        }
        if(e.getSource()==loginTemplate.getbRegistrarse()){
            JOptionPane.showMessageDialog(null, "Boton Registrarse", "Advetencia", 1);
        }
        /*
        Discriminacion de eventos comparando el tipo de objeto.
       
        */
//        if(e.getActionCommand()=="Entrar"){
//            JOptionPane.showMessageDialog(null, "Boton entrar", "Advertencia", 1);
//        }//Discrimitacion por texto del boton, no es comveniente.
    }
    
    public LoginTemplate getLoginTemplate(){
        return this.loginTemplate;
    }
    public void mostrarDatosUsuario(){
        String nombre= loginTemplate.gettNombreUsuario().getText();
        String pass=new String(loginTemplate.gettClaveUsuario().getPassword());
        String tipoUsuario= (String)loginTemplate.getCbTipoUsuario().getSelectedItem();
        String check="No registra.";
        if(loginTemplate.getCheckSi().isSelected()){
            check="SI";
        }
        if(loginTemplate.getCheckNo().isSelected()){
            check="NO";
        }
        JOptionPane.showMessageDialog(
                null,
                "Nombre de usuario: "+ nombre+
                "\nContraseña: "+pass+
                "\nTipo de usuario: "+tipoUsuario
                +"\nNotificiaciones?: "+check,
                "Datos ingresados",
                1
        );
        
    }
    public void entrar(){
        vistaPrincipal=new VistaPrincipalComponent();
        loginTemplate.setVisible(false);
    }
}
