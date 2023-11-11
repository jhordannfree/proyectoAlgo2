
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
        preguntasCorrectas=0;
        preguntasCorrectasXTexto=0;
        textosLeidos=0;
        textosCompletamenteAcertados=0;
        textosCompletamenteFallados=0;
    }
    
    public Alumno(int textosLeidos, double preguntasCorrectas, double preguntasCorrectasXTexto, double textosCompletamenteFallados, double textosCompletamenteAcertados,String name, String username, String password, LocalDate fechaNacimiento) {
        super(name, fechaNacimiento, username, password);
        this.textosLeidos=textosLeidos;
        this.preguntasCorrectas=preguntasCorrectas;
        this.preguntasCorrectasXTexto=preguntasCorrectasXTexto;
        this.textosCompletamenteFallados=textosCompletamenteFallados;
        this.textosCompletamenteAcertados=textosCompletamenteAcertados;
    }
    
    /**
     * @return the preguntasCorrectas
     */
    public double getPreguntasCorrectas() {
        return preguntasCorrectas;
    }

    /**
     * @param preguntasCorrectas the preguntasCorrectas to set
     */
    public void setPreguntasCorrectas(double preguntasCorrectas) {
        this.preguntasCorrectas = preguntasCorrectas;
    }

    /**
     * @return the preguntasCorrectasXTexto
     */
    public double getPreguntasCorrectasXTexto() {
        return preguntasCorrectasXTexto;
    }

    /**
     * @param preguntasCorrectasXTexto the preguntasCorrectasXTexto to set
     */
    public void setPreguntasCorrectasXTexto(double preguntasCorrectasXTexto) {
        this.preguntasCorrectasXTexto = preguntasCorrectasXTexto;
    }

    /**
     * @return the textosCompletamenteFallados
     */
    public double getTextosCompletamenteFallados() {
        return textosCompletamenteFallados;
    }

    /**
     * @param textosCompletamenteFallados the textosCompletamenteFallados to set
     */
    public void setTextosCompletamenteFallados(double textosCompletamenteFallados) {
        this.textosCompletamenteFallados = textosCompletamenteFallados;
    }

    /**
     * @return the textosCompletamenteAcertados
     */
    public double getTextosCompletamenteAcertados() {
        return textosCompletamenteAcertados;
    }

    /**
     * @param textosCompletamenteAcertados the textosCompletamenteAcertados to set
     */
    public void setTextosCompletamenteAcertados(double textosCompletamenteAcertados) {
        this.textosCompletamenteAcertados = textosCompletamenteAcertados;
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
