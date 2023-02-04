package client.components.configuraciones;

//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
import java.awt.event.*;

public class ConfiguracionesComponent implements MouseListener, MouseMotionListener, MouseWheelListener {

    private ConfiguracionesTemplate configuracionesTemplate;

    public ConfiguracionesComponent() {
        this.configuracionesTemplate = new ConfiguracionesTemplate(this);
    }

    public ConfiguracionesTemplate getTemplate() {
        return configuracionesTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) { //apreto y suelto
        this.configuracionesTemplate.getLPOnClickXValor().setText(e.getX() + "");
        this.configuracionesTemplate.getLPOnClickYValor().setText(e.getY() + "");
    }

    @Override
    public void mousePressed(MouseEvent e) { // mantengo apretado
        this.configuracionesTemplate.getLPInicialXValor().setText(e.getX() + "");
        this.configuracionesTemplate.getLPInicialYValor().setText(e.getY() + "");
    }

    @Override
    public void mouseReleased(MouseEvent e) { //suelto
        this.configuracionesTemplate.getLPFinalXValor().setText(e.getX() + "");
        this.configuracionesTemplate.getLPFinalYValor().setText(e.getY() + "");
    }

    @Override
    public void mouseEntered(MouseEvent e) { //me pongo encima del elemento, no detecta la salida.
        this.configuracionesTemplate.getLEstadoValor().setText("ADENTRO");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.configuracionesTemplate.getLEstadoValor().setText("AFUERA");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.configuracionesTemplate.getLLadoXValor().setText(e.getX() + "");
        this.configuracionesTemplate.getLLadoYValor().setText(e.getY() + "");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.configuracionesTemplate.getLPActualXValor().setText(e.getX() + "");
        this.configuracionesTemplate.getLPActualYValor().setText(e.getY() + "");
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int valorZoomActual = Integer.parseInt(this.configuracionesTemplate.getLZoomValor().getText());
        if (e.getWheelRotation() == -1) {
            this.configuracionesTemplate.getLZoomValor().setText(valorZoomActual + 1 + "");
        }
        if (e.getWheelRotation() == 1 && valorZoomActual > 0) {
            this.configuracionesTemplate.getLZoomValor().setText(valorZoomActual - 1 + "");
        }
    }

}
