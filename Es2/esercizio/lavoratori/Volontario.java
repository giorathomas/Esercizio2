package lavoratori;

public class Volontario extends Persona {
    /**
     * Costruttore completo
     * @param nome Nome
     * @param indirizzo Indirizzo
     * @param telefono  Numero di telefono
     */
    public Volontario(String nome, String indirizzo, String telefono) {
        super(nome, indirizzo, telefono);
    }//Volontario

    /**
     * Metodo paga
     * @return la paga
     */
    @Override
    public double paga() {
        return 0;
    }//paga

}//Volontario
