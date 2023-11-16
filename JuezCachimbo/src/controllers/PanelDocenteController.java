package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import views.EstadisticasDocente1;
import views.InicioDocente;
import views.PanelDocente;
import views.PerfilDocente;
import views.SeguimientoDocente;


public class PanelDocenteController extends MouseAdapter {
    PanelDocente viewPanelDocente;
    
   public PanelDocenteController(PanelDocente viewPanelDocente){
        this.viewPanelDocente=viewPanelDocente;
        this.viewPanelDocente.jLabelInicio.addMouseListener(this);
        this.viewPanelDocente.jLabelPerfil.addMouseListener(this);
        this.viewPanelDocente.jLabelSeguimiento.addMouseListener(this);
        this.viewPanelDocente.jLabelEstadisticaGenerales.addMouseListener(this);
        this.viewPanelDocente.jLabelCerrarSesion.addMouseListener(this);
   }
   
   @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource()==viewPanelDocente.jLabelInicio){
            switchPanel(new InicioDocente());
        }
        else if(e.getSource()==viewPanelDocente.jLabelPerfil){
            switchPanel(new PerfilDocente());
        }
        else if(e.getSource()==viewPanelDocente.jLabelSeguimiento){
            switchPanel(new SeguimientoDocente());
        }
        else if(e.getSource()==viewPanelDocente.jLabelEstadisticaGenerales){
            switchPanel(new EstadisticasDocente1());
        }
        else if(e.getSource()==viewPanelDocente.jLabelCerrarSesion){

        }
    }
    
    private void switchPanel(JPanel newPanel) {
            viewPanelDocente.contenedorPrincipalD.removeAll();
            viewPanelDocente.contenedorPrincipalD.setLayout(null);
            viewPanelDocente.contenedorPrincipalD.add(newPanel);
            newPanel.setBounds(0, 0, viewPanelDocente.contenedorPrincipalD.getWidth(), viewPanelDocente.contenedorPrincipalD.getHeight());
            viewPanelDocente.contenedorPrincipalD.revalidate();
            viewPanelDocente.contenedorPrincipalD.repaint();
    }
}
