

package app;

import client.login.LoginComponent;
import client.vistaPrincipal.VistaPrincipalComponent;
import javax.swing.SwingUtilities;
import client.vistaPrincipal.VistaPrincipalTemplate;


public class App {

    public static void main(String[] args) {
        Runnable correrAplicacion = new Runnable(){
            @Override
            public void run(){
                VistaPrincipalComponent vista = new VistaPrincipalComponent();
                vista.getClass();
//                LoginComponent login = new LoginComponent();
//                login.getClass();
            }
        };
        SwingUtilities.invokeLater(correrAplicacion);
    }
}
