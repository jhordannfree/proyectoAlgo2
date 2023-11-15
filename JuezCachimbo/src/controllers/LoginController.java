package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import views.Login;
import views.PanelEstudiante;
import views.PanelDocente;
import views.InicioEstudiante;
import views.InicioDocente;

import views.PanelRegister;

import models.Alumno;
import models.Docente;
import models.ManejadorCSV;
import models.Usuario;

public class LoginController implements ActionListener {
    Login viewLogin;
    Usuario usuario;
    
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    
    public LoginController(Login viewLogin, Usuario usuario){
        this.usuario=usuario;
        this.viewLogin=viewLogin;
        this.viewLogin.btnLoginIniciarSesion.addActionListener(this);
        this.viewLogin.btnLoginRegistrarse.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        //Botón "Iniciar Sesión"
        if(e.getSource()==viewLogin.btnLoginIniciarSesion){ 

            //Verificar si es alumno
            if(null!=ManejadorCSV.encontrarAlumno(viewLogin.txtLoginCorreo.getText(), new String(viewLogin.txtLoginClave.getPassword()))){
                this.usuario=ManejadorCSV.encontrarAlumno(viewLogin.txtLoginCorreo.getText(), new String(viewLogin.txtLoginClave.getPassword()));

                PanelEstudiante viewEstudiante=new PanelEstudiante();
                InicioEstudiante inicioEstudiante=new InicioEstudiante();
                viewEstudiante.contenedorPrincipalE.add(inicioEstudiante);
                viewEstudiante.setVisible(true);
                this.viewLogin.dispose();

            }
      
                
            //Verificar si es docente
            else if(null!=ManejadorCSV.encontrarDocente(viewLogin.txtLoginCorreo.getText(), new String(viewLogin.txtLoginClave.getPassword()))){

                this.usuario=ManejadorCSV.encontrarDocente(viewLogin.txtLoginCorreo.getText(), new String(viewLogin.txtLoginClave.getPassword())) ;

                PanelDocente viewDocente=new PanelDocente();
                InicioDocente inicioDocente=new InicioDocente();
                viewDocente.contenedorPrincipalD.add(inicioDocente);
                viewDocente.setVisible(true);
                this.viewLogin.dispose();
            }
  
            //No es usuario
            else{
                JOptionPane.showMessageDialog(viewLogin, "Usuario no existe.");
            }
                
               

        
        } 
        
        //Botón "Registrarse"
        else{ 
            
            PanelRegister viewRegister=new PanelRegister();
            viewRegister.setVisible(true);
            this.viewLogin.dispose();
            
        }

    }
    
}
