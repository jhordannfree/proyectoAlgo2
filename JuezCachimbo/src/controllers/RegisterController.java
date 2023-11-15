package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.PanelRegister;
import views.RegisterDocente1;
import views.RegisterEstudiante1;
import views.Login;

public class RegisterController implements ActionListener {
    PanelRegister viewRegister;
    
    public RegisterController(PanelRegister viewRegister){
        this.viewRegister=viewRegister;
        this.viewRegister.btnEstudianteRegistro.addActionListener(this);
        this.viewRegister.btnDocenteRegistro.addActionListener(this);
        this.viewRegister.btnRegresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==viewRegister.btnEstudianteRegistro){
            RegisterEstudiante1 viewRegisterEstudiante1=new RegisterEstudiante1();
            viewRegisterEstudiante1.setVisible(true);
            this.viewRegister.dispose();
        }
        else if (e.getSource()==viewRegister.btnDocenteRegistro){
            RegisterDocente1 viewRegisterDocente1=new RegisterDocente1();
            viewRegisterDocente1.setVisible(true);
            this.viewRegister.dispose();
        }
        else if (e.getSource()==viewRegister.btnRegresar){
            Login viewLogin=new Login();
            viewLogin.setVisible(true);
            this.viewRegister.dispose();
        }
    }
}
