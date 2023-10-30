
package juezcachimbo;

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
}
