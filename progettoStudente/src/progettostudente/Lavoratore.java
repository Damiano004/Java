package progettostudente;

public class Lavoratore extends Persona{
    
    private String lavoro, sede;

    public Lavoratore(String lavoro, String sede, String nome, String cognome, String eta, char sesso) {
        super(nome, cognome, eta, sesso);
        this.lavoro = lavoro;
        this.sede = sede;
    }

    public String getLavoro() {
        return lavoro;
    }

    public String getSede() {
        return sede;
    }

    @Override
    public String toString() {
       return super.toString()+"\nProfessione: "+lavoro+"\nluogo di lavoro: "+sede;
    }
    
    
}
