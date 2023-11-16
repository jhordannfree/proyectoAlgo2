package controllers;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import views.EstadisticasEstudiante;
import views.InicioEstudiante;
import views.Login;
import views.PanelEstudiante;
import views.PerfilEstudiante;
import views.PracticarEstudiante;


public class PanelEstudianteController extends MouseAdapter {
    PanelEstudiante viewPanelEstudiante;
    
    
    public PanelEstudianteController(PanelEstudiante viewPanelEstudiante){
        this.viewPanelEstudiante=viewPanelEstudiante;
        this.viewPanelEstudiante.jLabelInicio.addMouseListener(this);
        this.viewPanelEstudiante.jLabelPerfil.addMouseListener(this);
        this.viewPanelEstudiante.jLabelPracticar.addMouseListener(this);
        this.viewPanelEstudiante.jLabelEstadistica.addMouseListener(this);
        this.viewPanelEstudiante.jLabelCerrarSesion.addMouseListener(this);
        this.viewPanelEstudiante.jLabelBuscar.addMouseListener(this);
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource()==viewPanelEstudiante.jLabelInicio){
            switchPanel(new InicioEstudiante());
        }
        else if(e.getSource()==viewPanelEstudiante.jLabelPerfil){
            switchPanel(new PerfilEstudiante());
        }
        else if(e.getSource()==viewPanelEstudiante.jLabelPracticar){
            switchPanel(new PracticarEstudiante());
        }
        else if(e.getSource()==viewPanelEstudiante.jLabelEstadistica){
            switchPanel(new EstadisticasEstudiante());
        }
        else if(e.getSource()==viewPanelEstudiante.jLabelCerrarSesion){

        }
        else if (e.getSource()==viewPanelEstudiante.jLabelBuscar){
            
        }
        
    }
    
    private void switchPanel(JPanel newPanel) {
        viewPanelEstudiante.contenedorPrincipalE.removeAll();
        viewPanelEstudiante.contenedorPrincipalE.setLayout(null);
        viewPanelEstudiante.contenedorPrincipalE.add(newPanel);
        newPanel.setBounds(0, 0, viewPanelEstudiante.contenedorPrincipalE.getWidth(), viewPanelEstudiante.contenedorPrincipalE.getHeight());
        viewPanelEstudiante.contenedorPrincipalE.revalidate();
        viewPanelEstudiante.contenedorPrincipalE.repaint();
    }
    
}
