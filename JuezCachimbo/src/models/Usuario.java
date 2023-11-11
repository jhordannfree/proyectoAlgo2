
package models;
import java.time.LocalDate;
/**
 *
 * @author Pumapillo
 */
public abstract class Usuario {
    private static int nUsuarios =0;
    
    private String id;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String username;
    private String password;

    public Usuario(String nombres, String apellidos, LocalDate fechaNacimiento, String username, String password) {
        nUsuarios++;
        
        this.id=String.valueOf(nUsuarios);
        this.fechaNacimiento=fechaNacimiento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.username = username;
        this.password = password;
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public abstract void register();
    public abstract void login();
    public abstract void logout();

    /**
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
