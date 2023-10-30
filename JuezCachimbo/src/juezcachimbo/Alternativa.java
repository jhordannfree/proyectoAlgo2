
package juezcachimbo;

/**
 *
 * @author Pumapillo
 */
public class Alternativa {
    private String item;
    private String texto;
    private String idTexto;

    public Alternativa(String item, String texto, String idTexto) {
        this.item = item;
        this.texto = texto;
        this.idTexto = idTexto;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
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
    
    //public boolean esCorrecta(String item){
    //}
    
}
