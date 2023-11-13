
package models;

/**
 *
 * @author Pumapillo
 */
public class Pregunta {
    private String enunciado;
    private String idTexto;
    private String tipo;
    private String idDocente;
    private Resolucion resolucion;
    private Alternativa[] alternativa;

    public Pregunta(String enunciado, String idTexto, String tipo, String idDocente, String alternativa){
        this.enunciado = enunciado;
        this.idTexto = idTexto;
        this.tipo = tipo;
        this.idDocente = idDocente;
        this.alternativa = new Alternativa[4];
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the idTexto
     */
    public String getIdTexto() {
        return idTexto;
    }

    /**
     * @param idTexto the idTexto to set
     */
    public void setIdTexto(String idTexto) {
        this.idTexto = idTexto;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the idDocente
     */
    public String getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    /**
     * @return the resolucion
     */
    public Resolucion getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
    
}
