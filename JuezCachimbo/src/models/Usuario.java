
package models;
import java.time.LocalDate;
/**
 *
 * @author Pumapillo
 */
public abstract class Usuario {
    private static int nUsuarios =0;
    
    private String id;
    private String name;
    private LocalDate fechaNacimiento;
    private String username;
    private String password;

    public Usuario(String name, LocalDate fechaNacimiento, String username, String password) {
        nUsuarios++;
        
        this.id=String.valueOf(nUsuarios);
        this.fechaNacimiento=fechaNacimiento;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
}
