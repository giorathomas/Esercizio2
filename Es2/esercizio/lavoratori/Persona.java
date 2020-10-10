package lavoratori;

public abstract class Persona {

    private String nome; //nome
    private String indirizzo; //indirizzo
    private String telefono; //telefono

    /**
     * Costruttore completo
     * @param nome Nome
     * @param indirizzo Indirizzo
     * @param telefono Numero di telefono
     */
    public Persona(String nome, String indirizzo, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }//Persona

    /**
     * Costruttore di copia
     * @param p Oggetto da copiare
     */
    public Persona(Persona p){
        this(p.getNome(), p.getIndirizzo(), p.getTelefono());
    }//Persona

    /**
     * Metodo paga
     * @return la paga
     */
    public abstract double paga();

    /**
     * getNome
     * @return il nome
     */
    public String getNome() {
        return nome;
    }//getNome

    /**
     * setNome
     * @param nome il nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }//setNome

    /**
     * getIndirizzo
     * @return l'indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }//getIndirizzo

    /**
     * setIndirizzo
     * @param indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }//setIndirizzo

    /**
     * getTelefono
     * @return il numero di telefono
     */
    public String getTelefono() {
        return telefono;
    }//getTelefono

    /**
     * setTelefono
     * @param telefono il numero di telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }//setTelefono

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    public String toString() {
        return getClass()+": " +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }//toString
}//Persona
