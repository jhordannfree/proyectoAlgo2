
package models;

/**
 *
 * @author Pumapillo
 */
public class Resolucion {
    private String resolucion;
    private String idUsuario;
    private String idPreguntaSeleccionada;
    private String idAlternativaMarcada;
    private boolean esCorrecto;

    public Resolucion(String resolucion, String idUsuario, String idPreguntaSeleccionada, String idAlternativaMarcada, boolean esCorrecto) {
        this.resolucion = resolucion;
        this.idUsuario = idUsuario;
        this.idPreguntaSeleccionada = idPreguntaSeleccionada;
        this.idAlternativaMarcada = idAlternativaMarcada;
        this.esCorrecto = esCorrecto;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idPreguntaSeleccionada
     */
    public String getIdPreguntaSeleccionada() {
        return idPreguntaSeleccionada;
    }

    /**
     * @param idPreguntaSeleccionada the idPreguntaSeleccionada to set
     */
    public void setIdPreguntaSeleccionada(String idPreguntaSeleccionada) {
        this.idPreguntaSeleccionada = idPreguntaSeleccionada;
    }

    /**
     * @return the idAlternativaMarcada
     */
    public String getIdAlternativaMarcada() {
        return idAlternativaMarcada;
    }

    /**
     * @param idAlternativaMarcada the idAlternativaMarcada to set
     */
    public void setIdAlternativaMarcada(String idAlternativaMarcada) {
        this.idAlternativaMarcada = idAlternativaMarcada;
    }

    /**
     * @return the esCorrecto
     */
    public boolean isEsCorrecto() {
        return esCorrecto;
    }

    /**
     * @param esCorrecto the esCorrecto to set
     */
    public void setEsCorrecto(boolean esCorrecto) {
        this.esCorrecto = esCorrecto;
    }
    
    //todos los metodos de la clase padre
}
