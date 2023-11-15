package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import views.RegisterEstudiante1;
import views.RegisterEstudiante2;

public class RegisterEstudiante1Controller implements ActionListener{
    RegisterEstudiante1 viewRegisterEstudiante1;
    
    public RegisterEstudiante1Controller(RegisterEstudiante1 viewRegisterEstudiante1){
        this.viewRegisterEstudiante1=viewRegisterEstudiante1;
        this.viewRegisterEstudiante1.btnSiguienteRegisterE.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==viewRegisterEstudiante1.btnSiguienteRegisterE){
            String nombres=viewRegisterEstudiante1.txtNombreRegisterEstudiante.getText();
            String apellidos=viewRegisterEstudiante1.txtApellidosRegisterE.getText();
            String dia=viewRegisterEstudiante1.txtDiaRegisterE.getText();
            String mes=viewRegisterEstudiante1.txtNumeroMesRegisterE.getText();
            String año=viewRegisterEstudiante1.txtAnioRegisterE.getText();
            
            if(nombres.isEmpty()||apellidos.isEmpty()||dia.isEmpty()||mes.isEmpty()||año.isEmpty()){
                JOptionPane.showMessageDialog(viewRegisterEstudiante1, "Completar todos los campos.");
            }
            else{
                if(Integer.parseInt(dia)>0&&Integer.parseInt(mes)>0&&Integer.parseInt(año)>=1900&&Integer.parseInt(dia)>0&&31>=Integer.parseInt(dia)&&12>=Integer.parseInt(mes)&&2023>=Integer.parseInt(año)){
                    RegisterEstudiante2 viewRegisterDocente2=new RegisterEstudiante2();
                    viewRegisterDocente2.setVisible(true);
                    this.viewRegisterEstudiante1.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(viewRegisterEstudiante1, "Ingresar fecha válida en formato dd-MM-yyyy.");
                }
            }
          
            
        }
    }
    
}
