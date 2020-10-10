package lavoratori;

public class Impiegato extends Dipendente {

    private int bonusMaturati; //bonus maturati

    /**
     * Costruttore parametrico
     * @param nome nome
     * @param indirizzo indirizzo
     * @param telefono telefono
     * @param codFiscale codFiscale
     * @param baseRetribuzione baseRetribuzione
     */
    public Impiegato(String nome, String indirizzo, String telefono, String codFiscale, int baseRetribuzione, int bonusMaturati) {
        super(nome, indirizzo, telefono, codFiscale, baseRetribuzione);
        this.bonusMaturati=bonusMaturati;
    }//Impiegato

    /**
     * Metodo paga
     * @return stipendio del dipendente
     */
    @Override
    public double paga() {
        return getBaseRetribuzione()+bonusMaturati;
    }//paga

    /**
     * getBonusMaturati
     * @return bonus maturati
     */
    public int getBonusMaturati() {
        return bonusMaturati;
    }//getBonusMaturati

    /**
     * setBonusMaturati
     * @param bonusMaturati bonus maturati
     */
    public void setBonusMaturati(int bonusMaturati) {
        this.bonusMaturati = bonusMaturati;
    }//setBonusMaturati

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    @Override
    public String toString() {
        return super.toString()+"{" +
                "bonusMaturati=" + bonusMaturati +
                '}';
    }//toString

}//Impiegato
