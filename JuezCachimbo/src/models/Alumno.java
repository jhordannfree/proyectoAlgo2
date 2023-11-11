
package models;
import java.time.LocalDate;
/**
 *
 * @author Pumapillo
 */
public class Alumno extends Usuario {
    private int textosLeidos;
    private double preguntasCorrectas;
    private double preguntasCorrectasXTexto;
    private double textosCompletamenteFallados;
    private double textosCompletamenteAcertados;

    public Alumno(String name, String username, String password, LocalDate fechaNacimiento){
        super(name,fechaNacimiento,username,password);
    }
    
    public Alumno(int textosLeidos, double preguntasCorrectas, double preguntasCorrectasXTexto, double textosCompletamenteFallados, double textosCompletamenteAcertados,String name, String username, String password, LocalDate fechaNacimiento) {
        super(name, fechaNacimiento, username, password);
        this.textosLeidos=textosLeidos;
        this.preguntasCorrectas=preguntasCorrectas;
        this.preguntasCorrectasXTexto=preguntasCorrectasXTexto;
        this.textosCompletamenteFallados=textosCompletamenteFallados;
        this.textosCompletamenteAcertados=textosCompletamenteAcertados;
    }

    @Override
    public void register() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
