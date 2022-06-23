

package app;

import client.login.LoginTemplate;
import javax.swing.SwingUtilities;
import client.login.vistaPrincipal.VistaPrincipalTemplate;


public class App {

    public static void main(String[] args) {
        Runnable correrAplicacion = new Runnable(){
            @Override
            public void run(){
//                VistaPrincipalTemplate vista=new VistaPrincipalTemplate();
//                vista.getClass();
                LoginTemplate login = new LoginTemplate();
                login.getClass();
            }
        };
        SwingUtilities.invokeLater(correrAplicacion);
    }
}
