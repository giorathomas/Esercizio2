package lavoratori;

public class Giornaliero extends Dipendente {

    private int nGiornate;//numero giornate lavorative

    /**
     * Costruttore parametrico
     * @param nome nome
     * @param indirizzo indirizzo
     * @param telefono telefono
     * @param codFiscale codFiscale
     * @param baseRetribuzione baseRetribuzione
     */
    public Giornaliero(String nome, String indirizzo, String telefono, String codFiscale, int baseRetribuzione, int nGiornate) {
        super(nome, indirizzo, telefono, codFiscale, baseRetribuzione);
        this.nGiornate=nGiornate;
    }//Giornaliero

    /**
     * Metodo paga
     * @return stipendio del dipendente
     */
    @Override
    public double paga() {
        return getBaseRetribuzione()*nGiornate;
    }//paga

    /**
     * getnGiornate
     * @return giornate lavorative
     */
    public int getnGiornate() {
        return nGiornate;
    }//getnGiornate

    /**
     * setnGiornate
     * @param nGiornate giornate lavorative
     */
    public void setnGiornate(int nGiornate) {
        this.nGiornate = nGiornate;
    }//setnGiornate

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    @Override
    public String toString() {
        return super.toString() +
                "nGiornate=" + nGiornate +
                '}';
    }//toString

}//Giornaliero
