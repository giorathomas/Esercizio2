package lavoratori;

public abstract class Dipendente extends Persona {

    private final String codFiscale; //codice fiscale
    private int baseRetribuzione; //base stipendio

    /**
     * Costruttore parametrico
     * @param nome nome
     * @param indirizzo indirizzo
     * @param telefono telefono
     * @param codFiscale codFiscale
     * @param baseRetribuzione baseRetribuzione
     */
    public Dipendente(String nome, String indirizzo, String telefono, String codFiscale, int baseRetribuzione) {
        super(nome, indirizzo, telefono);
        this.codFiscale=codFiscale;
        this.baseRetribuzione=baseRetribuzione;
    }//Dipendente

    /**
     * Metodo paga
     * @return la paga
     */
    public double paga() {
        return baseRetribuzione;
    }//paga

    /**
     * getCodFiscale
     * @return CodFiscale
     */
    public String getCodFiscale() {
        return codFiscale;
    }//getCodFiscale

    /**
     * getBaseRetribuzione
     * @return BaseRetribuzione
     */
    public int getBaseRetribuzione() {
        return baseRetribuzione;
    }//getBaseRetribuzione

    /**
     * setBaseRetribuzione
     * @param baseRetribuzione BaseRetribuzione
     */
    public void setBaseRetribuzione(int baseRetribuzione) {
        this.baseRetribuzione = baseRetribuzione;
    }//setBaseRetribuzione

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    @Override
    public String toString() {
        return super.toString() +
                "codFiscale='" + codFiscale + '\'' +
                ", baseRetribuzione=" + baseRetribuzione +
                '}';
    }//toString

}//Dipendente
