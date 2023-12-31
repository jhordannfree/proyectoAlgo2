
package models;
import java.time.LocalDate;
/**
 *
 * @author Pumapillo
 */
public class Docente extends Usuario{
    private String carrera;

    public Docente(String id,String username, String password, String nombres,String apellidos,  LocalDate fechaNacimiento, String carrera) {
        super(id, nombres,apellidos, fechaNacimiento,username, password);
        this.carrera = carrera;
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

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
