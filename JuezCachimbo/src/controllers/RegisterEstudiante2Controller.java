/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.ManejadorCSV;
import models.Usuario;
import views.InicioEstudiante;
import views.PanelEstudiante;
import views.RegisterEstudiante2;

public class RegisterEstudiante2Controller implements ActionListener{
    RegisterEstudiante2 viewRegisterEstudiante2;
    
    public RegisterEstudiante2Controller(RegisterEstudiante2 viewRegisterEstudiante2){
        this.viewRegisterEstudiante2=viewRegisterEstudiante2;
        this.viewRegisterEstudiante2.btnRegistrarseE.addActionListener(this);
        this.viewRegisterEstudiante2.jComboBoxGrupoE.setModel(new DefaultComboBoxModel<>(ManejadorCSV.getNombresGrupos().toArray(new String[0])));
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==viewRegisterEstudiante2.btnRegistrarseE){
            if(viewRegisterEstudiante2.txtUsernameRegisterE.getText().isBlank()||viewRegisterEstudiante2.txtClaveRegisterE.getText().isBlank()){
                JOptionPane.showMessageDialog(viewRegisterEstudiante2, "Completar todos los campos.");
            }
            else if(!ManejadorCSV.esUsuarioNuevo(viewRegisterEstudiante2.txtUsernameRegisterE.getText())){
                JOptionPane.showMessageDialog(viewRegisterEstudiante2, "Usuario no disponible.");
            }
            else{
                JOptionPane.showMessageDialog(viewRegisterEstudiante2, "Alumno registrado con éxito.");
                Usuario usuario=ManejadorCSV.registrarAlumno(viewRegisterEstudiante2.txtUsernameRegisterE.getText(), viewRegisterEstudiante2.txtClaveRegisterE.getText(), viewRegisterEstudiante2.getNombres(), viewRegisterEstudiante2.getApellidos(), viewRegisterEstudiante2.getFechaNacimiento(), ManejadorCSV.obtenerCodigoGrupo(viewRegisterEstudiante2.jComboBoxGrupoE.getSelectedItem().toString()));
                
                PanelEstudiante viewEstudiante=new PanelEstudiante();
                InicioEstudiante inicioEstudiante=new InicioEstudiante();
                viewEstudiante.contenedorPrincipalE.add(inicioEstudiante);
                viewEstudiante.setUsuario(usuario);
               
                viewEstudiante.setVisible(true);
                this.viewRegisterEstudiante2.dispose();
            }
        }
    }
}
