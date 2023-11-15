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
import models.Usuario;

public class LoginController implements ActionListener {
    Login viewLogin;
    Usuario usuario;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    
    public LoginController(Login viewLogin, Usuario usuario){
        this.usuario=usuario;
        this.viewLogin=viewLogin;
        this.viewLogin.btnLoginIniciarSesion.addActionListener(this);
        this.viewLogin.btnLoginRegistrarse.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==viewLogin.btnLoginIniciarSesion){ //Botón "Iniciar Sesión"
            
            boolean esUsuario=false;
            String fileLine = "";  
            
            try
            {  
                //Verificar si es alumno
                BufferedReader readerAlumnos = new BufferedReader(new FileReader("src\\csv\\alumnos.csv"));  
                while ((fileLine = readerAlumnos.readLine()) != null)  
                {  
                    String[] alumno = fileLine.split(",");

                    if(viewLogin.txtLoginCorreo.getText().equals(alumno[1])&&new String(viewLogin.txtLoginClave.getPassword()).equals(alumno[2])){
                        esUsuario=true;
                        this.usuario=new Alumno(alumno[0],alumno[1],alumno[2],alumno[3],alumno[4],LocalDate.parse(alumno[5],formatter),alumno[6],Integer.parseInt(alumno[7]),Double.parseDouble(alumno[8]),Double.parseDouble(alumno[9]),Double.parseDouble(alumno[10]),Double.parseDouble(alumno[11])) ;
                        
     
                        PanelEstudiante viewEstudiante=new PanelEstudiante();
                        InicioEstudiante inicioEstudiante=new InicioEstudiante();
                        viewEstudiante.contenedorPrincipalE.add(inicioEstudiante);
                        viewEstudiante.setVisible(true);
                        this.viewLogin.dispose();
                        
                        break;
                    }

                }  
                
                //Verificar si es docente
                if(!esUsuario){
                    BufferedReader readerDocentes = new BufferedReader(new FileReader("src\\csv\\docentes.csv"));  
                    while ((fileLine = readerDocentes.readLine()) != null)  
                    {  
                        String[] docente = fileLine.split(",");

                        if(viewLogin.txtLoginCorreo.getText().equals(docente[1])&&new String (viewLogin.txtLoginClave.getPassword()).equals(docente[2])){
                            esUsuario=true;
                            this.usuario=new Docente(docente[0],docente[1],docente[2],docente[3],docente[4],LocalDate.parse(docente[5],formatter),docente[6]) ;
                            
                            PanelDocente viewDocente=new PanelDocente();
                            InicioDocente inicioDocente=new InicioDocente();
                            viewDocente.contenedorPrincipalD.add(inicioDocente);
                            viewDocente.setVisible(true);
                            this.viewLogin.dispose();
                            
                            break;
                        }

                    } 
                }
                
                //No es usuario
                if(!esUsuario){
                        JOptionPane.showMessageDialog(viewLogin, "Usuario no existe.");
                }
                
            }   

            catch (IOException exception)   
            {  
                exception.printStackTrace();  
            }   
        }
        
        else if (e.getSource()==viewLogin.btnLoginRegistrarse){ //Botón "Registrarse"
            
            PanelRegister viewRegister=new PanelRegister();
            viewRegister.setVisible(true);
            this.viewLogin.dispose();
            
        }

    }
    
}
