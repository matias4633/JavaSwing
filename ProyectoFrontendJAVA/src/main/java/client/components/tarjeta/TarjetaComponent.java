package client.components.tarjeta;

import javax.swing.ImageIcon;

public class TarjetaComponent {

    private TarjetaTemplate template;

    public TarjetaComponent(String titulo, ImageIcon imagen, String parrafo) {
        template = new TarjetaTemplate(this, titulo, imagen, parrafo);
    }

    public TarjetaTemplate getTemplate() {
        return template;
    }

}
