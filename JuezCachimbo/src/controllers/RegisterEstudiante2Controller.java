/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.RegisterEstudiante2;

public class RegisterEstudiante2Controller implements ActionListener{
    RegisterEstudiante2 viewRegisterEstudiante2;
    
    public RegisterEstudiante2Controller(RegisterEstudiante2 viewRegisterEstudiante2){
        this.viewRegisterEstudiante2=viewRegisterEstudiante2;
        this.viewRegisterEstudiante2.btnRegistrarseE.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
